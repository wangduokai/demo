#!/bin/bash
docker run --restart=always -d -p 8762:8762 cfmicserver1.node/platformgroup/ms-monitor:1.0-SNAPSHOT  >/dev/null 2>&1