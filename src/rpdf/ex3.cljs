(ns rpdf.ex3
  (:require ["@react-pdf/renderer" :as module]
            [reagent.core :as r]
            [reagent.dom :as rdom]))

(assert module)

;import { Page, Text, View, Document, StyleSheet } from '@react-pdf/renderer';

(def page (r/adapt-react-class module/Page))
(def image (r/adapt-react-class module/Image))
(def text (r/adapt-react-class module/Text))
(def view (r/adapt-react-class module/View))
(def document (r/adapt-react-class module/Document))
(def style-sheet (r/adapt-react-class module/StyleSheet))
(def pdfviewer (r/adapt-react-class module/PDFViewer))
(def pdfdownload-link (r/adapt-react-class module/PDFDownloadLink))
(def blob-provider (r/adapt-react-class module/BlobProvider))

(defn register-font [m] (module/Font.register (clj->js m)))
(defn register-hyphenation-callback [f] (module/Font.registerHyphenationCallback f))

(register-font
  {:family "Open Sans"
   :fonts  [{:src "https://cdn.jsdelivr.net/npm/open-sans-all@0.1.3/fonts/open-sans-regular.ttf"}
            {:src "https://cdn.jsdelivr.net/npm/open-sans-all@0.1.3/fonts/open-sans-600.ttf" :fontWeight 600}]})

(register-hyphenation-callback (fn [w] #js [w]))

(def pdf-styles
  {:page    {:paddingTop        35
             :paddingBottom     65
             :paddingHorizontal 35
             :fontFamily        "Open Sans"
             :fontSize          12}
   :row     {:flexDirection "row"
             :marginTop     3}
   :section {:marginTop 20}
   :col1    {:width "55%"}
   :col2    {:width             "15%"
             :paddingHorizontal 10}
   :totals  {:borderTopStyle "double" :borderTopWidth 1 :width "45%"}
   :th      {:textAlign "center" :fontWeight 600}
   :notes   {:fontSize      10
             :paddingBottom 16}})

(defn report-pdf
  []
  [document
   [page {:size "A4" :style (:page pdf-styles)}
    [text "This is a test"]]])

(defn pdf-viewer-example []
  [pdfviewer {:height 800 :width 500}
   [report-pdf]])

(rdom/render [pdf-viewer-example] (.getElementById js/document "app"))