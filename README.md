# Vaccines [![Build](https://github.com/Covid-Alert-Microservices/vaccines/actions/workflows/build.yaml/badge.svg)](https://github.com/Covid-Alert-Microservices/covid-tests/actions/workflows/build.yaml)

This repository manages vaccines for Covid-Alert

## Environment variables

The following environment variables can be configured:
- `KEYCLOAK_URL`: the URL to the Keycloak instance (default: `http://localhost:5000`)
- `POSTGRES_HOST`: the host for the PostgreSQL database (default: `localhost:5432/postgres`)
- `POSTGRES_USER`: the user for the PostgreSQL database (default: `postgres`)
- `POSTGRES_PASSWORD`: the password for the PostgreSQL database (default: `postgres`)

## Dependencies

In order to use this microservice, make sure you cloned [Keycloak](https://github.com/Covid-Alert-Microservices/keycloak) repository.
