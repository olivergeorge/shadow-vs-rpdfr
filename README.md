# shadow-vs-rpdfr
Repro for error using @react-pdf/renderer with shadow-cljs 

Error shown in console for ex2

```
js.js:74 shadow-cljs - failed to load module$node_modules$$react_pdf$yoga$src$dist$entry_browser
shadow.js.jsRequire @ js.js:74
shadow$provide.module$node_modules$$react_pdf$renderer$dist$react_pdf_browser_cjs @ react-pdf.browser.cjs.js:22
shadow.js.jsRequire @ js.js:66
shadow.js.require @ js.js:113
eval @ rpdf.ex2.js:2
goog.globalEval @ main.js:486
env.evalLoad @ main.js:1549
(anonymous) @ main.js:2269
js.js:74 shadow-cljs - failed to load module$node_modules$$react_pdf$renderer$dist$react_pdf_browser_cjs
shadow.js.jsRequire @ js.js:74
shadow.js.require @ js.js:113
eval @ rpdf.ex2.js:2
goog.globalEval @ main.js:486
env.evalLoad @ main.js:1549
(anonymous) @ main.js:2269
main.js:1551 An error occurred when loading rpdf.ex2.js
env.evalLoad @ main.js:1551
(anonymous) @ main.js:2269
main.js:1552 TypeError: dynCall is not a function
    at Function.eval [as bind_value] (eval at buildCallerFunction (nbind.js:1), <anonymous>:1:96)
    at _nbind_value (nbind.js:1041)
    at module.exports (entry-common.js:241)
    at Object.shadow$provide.module$node_modules$$react_pdf$yoga$src$dist$entry_browser (entry-browser.js:41)
    at shadow.js.jsRequire (js.js:66)
    at Object.shadow$provide.module$node_modules$$react_pdf$renderer$dist$react_pdf_browser_cjs (react-pdf.browser.cjs.js:22)
    at Object.shadow.js.jsRequire (js.js:66)
    at Object.shadow.js.require (js.js:113)
    at eval (rpdf.ex2.js:2)
    at eval (<anonymous>)
```
