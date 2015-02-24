(ns bob
  (:require [clojure.string :as str]))

(defn response-for [] "Fine. Be that way!")

(defn response-for 
	([] "Fine. Be that way!")
	([sentence] 
		(if (= (count (str/trim sentence)) 0) "Fine. Be that way!" 
			(if (and (= (count (filter #(Character/isLowerCase %) sentence)) 0) (> (count (filter #(Character/isUpperCase %) sentence)) 0)) "Whoa, chill out!"
				(if (= (last sentence) \?) "Sure." "Whatever.")))))

