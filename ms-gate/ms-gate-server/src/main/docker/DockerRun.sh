#!/bin/bash
docker run --restart=always -d -p 8762:8762 cfmicserver1.node/mic-service/ms-admin:1.0.0-SNAPSHOT  >/dev/null 2>&1