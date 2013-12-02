(ns neocloft.helper
  (:import [org.bukkit Bukkit Material Sound Effect]))

(defn smoke-effect [loc]
  (doseq [i (range 0 8)
          :let [world (.getWorld loc)]]
    (.playEffect world loc Effect/SMOKE (byte i))))