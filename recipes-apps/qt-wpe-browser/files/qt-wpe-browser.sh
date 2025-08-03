#!/bin/sh

EXAMPLE_APPLICATION="/usr/bin/qt-wpe-browser"

[[ ! -x ${EXAMPLE_APPLICATION} ]] && exit 1

if pidof -qx -o $$ $(basename "${0}") ; then
  echo "Process $(basename "${0}") is already running"
  exit 1
else
  ${EXAMPLE_APPLICATION}
  exit ${?}
fi