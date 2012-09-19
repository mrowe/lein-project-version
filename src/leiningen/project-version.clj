(ns leiningen.project-version)

(defn project-version
  "Prints the version of the current project."
  [project & keys]
  (println (:version project))
  (flush))
