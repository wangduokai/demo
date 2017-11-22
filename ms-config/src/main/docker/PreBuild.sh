#!/bin/bash
docker rm -f $(docker ps -a  | grep "cfmicserver1.node/platformgroup/ms-config:1.0-SNAPSHOT"| awk '{ print $1 }')  >/dev/null 2>&1
docker rmi -f cfmicserver1.node/platformgroup/ms-config:1.0-SNAPSHOT  >/dev/null 2>&1