(if true
  "It is true"
  "It is false")

(if true
  (do
    (println "First")
    (println "Second")
  )
)

(if (or true false)
  "it is true"
  "it is false"
)
