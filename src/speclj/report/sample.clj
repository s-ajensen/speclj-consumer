(ns speclj.report.sample
  (:require [speclj.reporting]))

(deftype SampleReporter []
  speclj.reporting/Reporter
  (report-message [this message]
    (println message) (flush))
  (report-description [this description]
    (println "DESCRIPTION"))
  (report-pass [this result]
    (print ".") (flush))
  (report-pending [this result]
    (print "*") (flush))
  (report-fail [this result]
    (print "F") (flush))
  (report-error [this result]
    (print "E") (flush))
  (report-runs [this results]
    (println "REPORT RUNS")))

(defn new-sample-reporter []
  (SampleReporter.))