(ns bob
	(:require [clojure.string :as string]))

(defn countUppercase [sentence]
	(count (filter #(Character/isUpperCase %) sentence)))

(defn countLowercase [sentence]
	(count (filter #(Character/isLowerCase %) sentence)))

; Check for silence - empty sentance
(defn- silence? [sentence]
    (re-matches #"^\s*$" sentence))

; Check for Yelling - No character letters and at least one uppercase character
(defn- yelling? [sentence]
    (and (zero? (countLowercase sentence)) (pos? (countUppercase sentence))))

; Check for Questions - sentenance ends in a ?
(defn- question? [sentence]
    (re-matches #".*\?" sentence))

(defn response-for [sentence]
    (cond
        (silence? sentence) "Fine. Be that way!"
        (yelling? sentence) "Whoa, chill out!"
        (question? sentence) "Sure."
        :else "Whatever."))