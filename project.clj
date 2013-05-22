(defproject com.taoensso/faraday "0.0.1-SNAPSHOT"
  :description "Clojure DynamoDB client"
  :url "https://github.com/ptaoussanis/faraday"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure        "1.5.1"]
                 [org.clojure/tools.macro    "0.1.1"]
                 [com.amazonaws/aws-java-sdk "1.4.3"] ; TODO 1.4.4
                 [com.taoensso/nippy         "1.2.0"]
                 [com.taoensso/timbre        "1.6.0"]]
  :profiles {:dev   {:dependencies []}
             :test  {:dependencies []}
             :bench {:dependencies []}}
  :min-lein-version "2.0.0"
  :warn-on-reflection true)