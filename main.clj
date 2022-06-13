(ns user
  (:require [nextjournal.clerk :as clerk]))

(comment
  ;; start with file watcher for these sub-directory paths
  (clerk/serve! {:watch-paths ["notebooks" "index.clj"]})
  (clerk/show! "notebooks/index.clj"))
