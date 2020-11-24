# Dockerized app logging example

## Dockerfile

Multistage. Uses different containers for build and execution.

## Docker-compose

Dockerfile as a source of service.

TIP: Docker-compose wont rebuild image if code changes. It uses cached image 
unless explicit rebuild is requested via `docker-compose build`

Docker logging driver gelf is used to forward messages from stdout of an app to logstash.

Logstash is configured to use gelf protocol for input.

## Docker blocking non-blocking logging

Docker provides two log delivery options. Depending on your needs you may prefer one or another.
https://docs.docker.com/config/containers/logging/configure/

## How to start

Running `docker-compose up` will start build process and finally run application and elk stack.

The following urls will be available:
Application
http://127.0.0.1:8080

Kibana:
http://127.0.0.1:5601

Elasticsearch:
http://127.0.0.1:9200

WARNING: Docker will make these ports available on all interfaces. Potential security risk.