(ns os.hashobject.views.common
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5 include-css include-js)]))


(defn ga []
  [:script "(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-41533076-3', 'hashobject.com');
  ga('send', 'pageview');"])


(defn header []
  [:header.row
   [:div.content
    [:a {:href "http://os.hashobject.com"}[:div.logo]]
    [:nav {:role "navigation"}
     [:ul
      [:li [:a {:href "http://hashobject.com"} "Home"]]
      [:li [:a {:href "http://blog.hashobject.com"} "Blog"]]
      [:li.active [:a {:href "http://os.hashobject.com"} "Open Source"]]]]]])

(defn footer []
  [:footer.row
   [:div.content
    [:p.licence "Except as otherwise noted, the content of this site is licensed
     under the <a href='http://creativecommons.org/licenses/by/3.0/'>Creative Commons Attribution 3.0 License</a>,
     and code samples and library code are licensed under the
     <a href='http://opensource.org/licenses/eclipse-1.0'>Eclipse Public License 1.0</a>."]]])