(ns examples.use-nil-punning)

;; use nil punning for checking for non emptiness

;; bad
(defn print-seq [s]
  (when-not (empty? s)
    (prn (first s))
    (recur (rest s))))


;; good
(defn print-seq [s]
  (when (seq s)
    (prn (first s))
    (recur (rest s))))

;; see https://groups.google.com/forum/?fromgroups=#!topic/clojure/gWvXoHa7-t4
