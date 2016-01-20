(defproject hacker-snooze "0.1.0-SNAPSHOT"
  :description "inth viewer"
  :url "https://github.com/youhavethewrong/hacker-snooze"
  :license {:name "Apache License, Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.namespace "0.2.11"]
                 [mount "0.1.8"]
                 ;; http
                 [ring "1.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [ring-json-response "0.2.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [compojure "1.4.0"]
                 [hiccup "1.0.5"]
                 ;; db
                 [org.clojure/java.jdbc "0.4.2"]
                 [hikari-cp "1.5.0"]
                 [mysql/mysql-connector-java "5.1.38"]
                 ;; log
                 [org.clojure/tools.logging "0.3.1"]
                 [log4j "1.2.17" :exclusions [javax.mail/mail
                                              javax.jms/jms
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]])
