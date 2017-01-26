#skeleton service
Skeleton service sample which provides a healthcheck endpoint. 

#Endpoints:

* <code>GET</code> /health - Gets a healthcheck status;
```bash
Alive!
```
#Running:

## Requirements
- Java 1.8

```bash
mvn spring-boot:run
```
# Testing

```bash
curl '$SERVICE_URL/health'
```
A successful response looks like:
```bash
Alive!
```
