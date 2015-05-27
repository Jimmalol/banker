(ns banker.core
  (:use clojure-csv.core
        clojure.java.io))

(defn read-file [file-name]
  (with-open [rdr (reader file-name)]
    (doseq [line (line-seq rdr)]
      (println line))))

; keeps returning nil :( why no return??
(defn test-read-file [file-name]
  (slurp file-name))

; works?
(parse-csv (slurp "../resources/Bank.csv"))