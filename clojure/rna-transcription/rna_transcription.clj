(ns rna-transcription)

(defn throwAssertionError [nucleotide]
	(throw
	(AssertionError. 
		(str "The DNA nucleotide " nucleotide " is not known."))))

(defn transcribe [nucleotide]
	(case (str nucleotide)
		;* `G` -> `C`
		"G" "C"
		;* `C` -> `G`
		"C" "G"
		;* `T` -> `A`
		"T" "A"
		;* `A` -> `U`
		"A" "U"
		; No Match
		(throwAssertionError nucleotide)
		))

(defn to-rna [dna]
	(apply str (map #(transcribe %) dna)))