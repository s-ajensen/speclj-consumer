(ns consumer.core-spec
  (:require [speclj.core :refer :all]))

;(import
;  'consumer.sample-reporter 'SampleReporter)

(describe "core"
  (describe "nested"
    (it "asserts"
      (should= true true)
      (Thread/sleep 500)
      (take 500 (iterate inc 0))))

  (it "asserts again"
    (Thread/sleep 300)
    (should= true true))

  (it "fails"
    (Thread/sleep 200)
    (should= false true)))