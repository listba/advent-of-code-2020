(ns aoc-2020.util)

(defn parse-nums [input]
  (->> input
       (str "../resources/")
       slurp
       (re-seq #"[^\n]+")
       (map read-string)))

(defn permutations [colls]
  (if (= 1 (count colls))
    (list colls)
    (for [head colls
          tail (permutations (disj (set colls) head))]
      (cons head tail))))