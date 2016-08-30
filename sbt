#!/bin/bash
SBT_OPTS=""
java $SBT_OPTS -jar `dirname $0`/sbt-launch.jar "$@"
