(defproject dda/httpd "0.2.10"
  :description "Pallet crate to install and run Apache httpd"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [dda/pallet "0.9.0"]]
  :repositories [["snapshots" :clojars]
                 ["releases" :clojars]]
  :deploy-repositories [["snapshots" :clojars]
                        ["releases" :clojars]]
  :profiles {:dev {:dependencies
                   [[org.clojure/test.check "0.10.0-alpha2"]
                    [dda/pallet "0.9.0" :classifier "tests"]
                    [ch.qos.logback/logback-classic "1.3.0-alpha4"]
                    [org.slf4j/jcl-over-slf4j "1.8.0-beta2"]]
                   :leiningen/reply  {:dependencies [[org.slf4j/jcl-over-slf4j "1.8.0-alpha2"
                                                      :exclusions [commons-logging]]]}}
             :test {:dependencies [[dda/pallet "0.9.0" :classifier "tests"]]}}
  :local-repo-classpath true)
