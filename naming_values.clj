(def failed-protagonist-names
  ["Larry Potter" "Doreen The Explore" "The Incredible Bulk"])

failed-protagonist-names

; define a name with a string value and change it dependent of the condition

(def severity :mild)
(def error-message "OH GOD! IT'S A DISASTER! WE'RE ")
(if (= severity :mild)
  (def error-message (str error-message "MILDLY INCONVENIENCED!"))
  (def error-message (str error-message "DOOOOOOOMED!")))

; another way to do the same thing is:

(defn error-message [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE "
    (if (= severity :mild)
      "MILDLY INCONVENIENCED!"
      "DOOOOOOOMED!")))
