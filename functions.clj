; Hello World function
(defn hello-world []
  (println "Hello World"))

(hello-world "TK")

; Hello Friend function with parameter
(defn hello-friend [name]
  (println "Hello Friend" name))

(hello-friend "TK")

; Sum function
(defn sum [x y]
  (+ x y))

(sum 1 2)
(sum 10 20)

; using many parameters
 (+ 1 2 3 4 5 6 7 8 9 10)

; define function with many parameters
(defn sum [& args]
  (reduce + args))

(sum 1 2 3 4 5 6 7 8 9 10)

; define function to concatenate strings
(defn concatenate [& strings]
  (str strings))

(concatenate "Kazumi" "I" "Love" "You")
