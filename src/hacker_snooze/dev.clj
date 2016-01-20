(ns hacker-snooze.dev
  (:require [mount.core :as mount]
            [clojure.tools.namespace.repl :as tn]))

(defn go
  []
  (mount/start)
  :ready)

(defn reset
  []
  (mount/stop)
  (tn/refresh :after 'dev/go))
