.PHONY=toc
toc:
	find . -name "*.md" | sed -n 's/\/$$//;s/.*\/\([^\/]*\)\(\.md\)/[\1](\0)/p'
