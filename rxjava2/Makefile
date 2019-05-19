.PHONY = all

TOC := readme.md
MD := $(shell find -type f -name '*.md' -not -name 'readme.md')

all: ${TOC}

${TOC}: ${MD}
	../.scripts/generate_toc.sh readme.md.mo ${MD}
