(defproject test_exec "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :plugins [[lein-exec "0.3.4"]]
  :main ^:skip-aot test-exec.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
