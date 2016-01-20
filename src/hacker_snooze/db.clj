(ns hacker-snooze.db
  (:require [clojure.java.jdbc :as jdbc]
            [clojure.tools.logging :as log]
            [hikari-cp.core :as hikari]
            [mount.core :as mount]))

(def db-spec {:pool-name "hn-pool"
              :adapter "mysql"
              :username "hn"
              :password ""
              :database-name "hn"
              :server-name "localhost"
              :port-number 3306})

(mount/defstate hn
  :start (hikari/make-datasource db-spec)
  :stop (hikari/close-datasource hn))

(defn all-articles
  [ds]
  (jdbc/with-db-connection [conn {:datasource ds}]
    (let [rows (jdbc/query conn "select * from article order by id desc")]
      (log/info (str "Retrieved " (count rows) " articles"))
      rows)))
