(defproject dda/httpd "0.2.9-SNAPSHOT"
  :description "Pallet crate to install and run Apache httpd"
  :dependencies [[dda/dda-pallet "2.2.0"]
                 [dda/dda-git-crate "1.1.3"]]
  :repositories [["snapshots" :clojars]
                 ["releases" :clojars]]
  :deploy-repositories [["snapshots" :clojars]
                        ["releases" :clojars]]
  :profiles {:dev
             {:dependencies
              [[ch.qos.logback/logback-classic "1.2.3"]]
              :plugins
              [[com.palletops/pallet-lein "0.8.0-alpha.1"]
               [lein-sub "0.3.0"]]}
             :aws
             {:dependencies
              [
               [com.palletops/pallet-jclouds "1.7.3"]
               ;; To get started we include all jclouds compute providers.
               ;; You may wish to replace this with the specific jclouds
               ;; providers you use, to reduce dependency sizes.
               [org.apache.jclouds/jclouds-allblobstore "2.0.2"]
               [org.apache.jclouds/jclouds-allcompute "2.0.2"]
               [org.apache.jclouds.driver/jclouds-slf4j "2.0.2"
                ;; the declared version is old and can overrule the
                ;; resolved version
                :exclusions [org.slf4j/slf4j-api]]
               [org.apache.jclouds.driver/jclouds-sshj "2.0.2"]]}
             :leiningen/reply
             {:dependencies [[org.slf4j/jcl-over-slf4j "1.7.25"]]
              :exclusions [commons-logging]}}
  :local-repo-classpath true)
