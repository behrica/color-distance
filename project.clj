(defproject behrica/color-distance "0.0.2"
  :description "Library to clalculate color distances"
  :min-lein-version  "2.0.0"
  :source-paths      ["src/clojure"]
  :java-source-paths ["src/java" "test/java"]
  :repositories [["maven-restlet" "http://maven.restlet.org"]]
  :dependencies [
                 [junit/junit "4.11"]
                 [org.hibernate/hibernate-core "5.0.0.CR2"]
                 [org.hsqldb/hsqldb "2.3.1"]
                 [org.restlet.jse/org.restlet "2.3.0"]
                 [org.restlet.jse/org.restlet.ext.simple "2.3.0"]
                 [org.restlet.jee/org.restlet.ext.servlet "2.3.0"]
                 [org.apache.geronimo.specs/geronimo-servlet_2.5_spec "1.2"]
                 [com.google.code.gson/gson "1.7.1"]
                 
                 [org.apache.commons/commons-lang3 "3.4"]
                 ]
  :plugins [[lein-junit "1.1.8"]]
  :junit ["test/java"]
   lein-release {:deploy-via :clojars}
  )




