(ns hacker-snooze.www
  (:require [compojure.core :refer [routes defroutes GET]]
            [compojure.handler :as handler]
            [ring.adapter.jetty :refer [run-jetty]]
            [mount.core :as mount]
            [hacker-snooze.db :as db]))

(defroutes www-routes
  (GET "/" [] "Welcome" )
  (GET "/articles" [] (db/all-articles db/hn)))

(defn start-www
  []
  (-> (routes www-routes)
      (handler/site)
      (run-jetty {:join? false
                  :port 8081})))

(mount/defstate www-app
  :start (start-www)
  :stop (.stop www-app))
