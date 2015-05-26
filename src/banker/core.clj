(ns banker.core
  (:use clojure-csv.core
        clojure.java.io))

(defn read-file [file-name]
  (with-open [rdr (reader file-name)]
    (doseq [line (line-seq rdr)]
      (println line))))

(defn test-read-file [file-name]
  (with-open [rdr (reader file-name)]))