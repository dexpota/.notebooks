.PHONY = all

TOC := readme.md
MD := $(shell find -type f -name '*.md')

all: ${TOC}

${TOC}: ${MD}
	find . -name "*.md" | sed -n 's/\/$$//;s/.*\/\([^\/]*\)\(\.md\)/[\1](\0)/p'
