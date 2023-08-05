(ns consumer.main
  (:require [clojure.data.xml :as xml]))

(defn- main [& args]
  (spit "out.xml"
    "test"
    #_(xml/sexp-as-element
      [:foo {:foo-attr "foo value"}
       [:bar {:bar-attr "bar value"}
        [:baz {} "The baz value"]]])))