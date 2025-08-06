# Micronaut - CursoredPage - Bug Reproduction Example

## Issue

```
Cannot convert type [class io.micronaut.data.model.DefaultSlice] to target type: interface io.micronaut.data.model.CursoredPage. Considering defining a TypeConverter bean to handle this case.
```

## Running locally

1. **Start Postgres:** docker compose up -d

2. **Run Micronaut App:** ./gradlew run

Database is available on `localhost:5469`, database `test_db`, user `micronaut`, password `password`.<br>
The API will be available on `http://localhost:8080`.<br>
To trigger the error, make a GET request to `http://localhost:8080/`.<br>
