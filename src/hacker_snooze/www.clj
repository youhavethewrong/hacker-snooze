(ns hacker-snooze.www
  (:require [compojure.core :refer [routes defroutes GET]]
            [compojure.handler :as handler]
            [ring.adapter.jetty :refer [run-jetty]]))

(defroutes hn-routes
  (GET "/" [] "Welcome" ))

(defn start-hn
  []
  (-> (routes hn-routes)
      (handler/site)
      (run-jetty {:join? false
                  :port 8081})))
