#!/usr/bin/env bash

# if liche exits and everything goes fine then exit successfully
command -v liche 1>/dev/null 2>&1 && liche -vr "$1" && exit $?
# try with remark, check external links
command -v remark 1>/dev/null 2>&1 && remark --use lint-no-dead-urls "$1"
# check relative links
command -v remark 1>/dev/null 2>&1 && remark --use validate-links "$1"
