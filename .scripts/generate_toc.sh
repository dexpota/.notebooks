#!/usr/bin/env bash

DISCLAIMER="<!-- DO NOT MODIFY THIS FILE, THIS FILE IS AUTO-GENERATED -->"
export DISCLAIMER

input_filename=$1

shift

MD=$(echo "$@" | tr " " "\n")

TOC=$(echo "$MD" | sed -n 's/\/$//;s/.*\/\([^\/]*\)\(\.md\)/- [\u\1](\0);/p')
export TOC

output_filename="${filename%.mo}"
mo "$input_filename"
#"$output_filename"
