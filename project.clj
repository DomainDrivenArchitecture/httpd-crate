(defproject dda/httpd "0.2.7-SNAPSHOT"
  :description "Pallet crate to install and run Apache httpd"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.palletops/pallet "0.8.12"]
                 [com.palletops/git-crate "0.8.0-alpha.2" :exclusions [org.clojure/clojure]]]
  :repositories [["snapshots" :clojars]
                 ["releases" :clojars]]
  :deploy-repositories [["snapshots" :clojars]
                        ["releases" :clojars]]
  :profiles {:dev
             {:dependencies
              [[com.palletops/pallet "0.8.12" :classifier "tests"]
               [ch.qos.logback/logback-classic "1.2.3"]
               [com.palletops/pallet-vmfest "0.4.0-alpha.1"]]
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
               [org.apache.jclouds/jclouds-allblobstore "2.0.1"]
               [org.apache.jclouds/jclouds-allcompute "2.0.1"]
               [org.apache.jclouds.driver/jclouds-slf4j "2.0.1"
                ;; the declared version is old and can overrule the
                ;; resolved version
                :exclusions [org.slf4j/slf4j-api]]
               [org.apache.jclouds.driver/jclouds-sshj "2.0.1"]]}
             :leiningen/reply
             {:dependencies [[org.slf4j/jcl-over-slf4j "1.7.25"]]
              :exclusions [commons-logging]}}
  :local-repo-classpath true)
