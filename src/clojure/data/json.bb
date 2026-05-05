(ns clojure.data.json
  (:require [cheshire.core :as cheshire]))

(defn write-str [x & _opts]
  (cheshire/generate-string x))

(defn read-str [s & {:keys [key-fn]}]
  (cheshire/parse-string s key-fn))
