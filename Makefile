
build-libs:
	npx webpack ./target/index.js -o public/js/libs

watch:
	yarn
	npx shadow-cljs watch ex3

build:
	yarn
	npx shadow-cljs compile ex3
	npx webpack ./target/index.js -o public/js/libs
