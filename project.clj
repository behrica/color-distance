(defproject behrica/color-distance "0.0.3-SNAPSHOT"
  :description "Library to clalculate color distances"
  :min-lein-version  "2.0.0"
  :source-paths      ["src/clojure"]
  :java-source-paths ["src/java" "test/java"]
  :repositories [["maven-restlet" "http://maven.restlet.org"]]
  :dependencies [
                 [junit/junit "4.11"]
                 [org.apache.commons/commons-lang3 "3.4"]
                 ]
  :plugins [[lein-junit "1.1.8"]]
  :junit ["test/java"]
   lein-release {:deploy-via :clojars}
  )




