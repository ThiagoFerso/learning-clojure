(ns maps-test
  (:require [clojure.test :refer :all]))

(deftest bla
  (is (= true (map? {}))))