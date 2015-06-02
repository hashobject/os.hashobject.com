(set-env!
  :source-paths #{"src"}
  :resource-paths #{"resources"}
  :dependencies '[[org.clojure/clojure "1.6.0"]
                 [hiccup "1.0.5"]
                 [perun "0.1.0-SNAPSHOT"]
                 [clj-time "0.9.0"]
                 [jeluard/boot-notify "0.1.2" :scope "test"]])

(task-options!
  pom {:project 'os.hashobject.com
       :version "0.2.0"})

(require '[io.perun.markdown :refer :all])
(require '[io.perun.ttr :refer :all])
(require '[io.perun.draft :refer :all])
(require '[io.perun.permalink :refer :all])
(require '[io.perun.sitemap :refer :all])
(require '[io.perun.rss :refer :all])
(require '[io.perun.render :refer :all])
(require '[io.perun.collection :refer :all])

(require '[jeluard.boot-notify :refer [notify]])

(defn renderer [data] (:name data))

(deftask build
  "Build site"
  []
  (comp (markdown)
        (draft)
        ;(ttr)
        (permalink)
        (render :renderer 'renderer)
        ;(collection :renderer 'index-view/render :page "index.html" :comparator (fn [i1 i2] (compare i2 i1)))
        ;(sitemap :filename "sitemap.xml")
        ;(rss :title "Hashobject" :description "Hashobject open source corner" :link "http://os.hashobject.com")
        (notify)))