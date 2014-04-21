(defproject quil "2.0.1-juan"
  :description "(mix Processing Clojure)"
  :url "http://github.com/quil/quil"
  :mailing-list {:name "Quil Mailing List"
                 :archive "https://groups.google.com/forum/?fromgroups#!forum/clj-processing"
                 :post "clj-processing@googlegroups.com"}
  :license {:name "Common Public License - v 1.0"
            :url "http://www.opensource.org/licenses/cpl1.0"}
  :repositories [["jogamp" "http://www.jogamp.org/deployment/maven/"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [quil/processing-core "2.1.1"]
                 [quil/processing-pdf "2.1.1"]
                 [quil/processing-dxf "2.1.1"]
                 [org.jogamp.jogl/jogl-all-main "2.1.4-rc-20140113"]
                 [org.jogamp.gluegen/gluegen-rt-main "2.1.4-rc-20140113"]]
  :resource-paths ["lib/gstreamer-java.jar" "lib/video.jar" "lib/jna.jar" "lib/macosx64" "lib/oscP5.jar"]
  :aot [quil.helpers.applet-listener quil.applet])
