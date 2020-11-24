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