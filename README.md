# Spring Boot REST API (MongoDB)

Technologies used :
- Docker
  - Mongo Express
  - 


Sample JSON to POST data :

```json
[
    {
        "firstName": "Ja",
        "lastName": "Champion",
        "email": "david@email.com",
        "gender": "MALE",
        "address": {
            "country": "England",
            "city": "London",
            "postCode": "NE7"
        },
        "favouriteSubjects": [
            "Computer Science"
        ],
        "totalSpentInBooks": 10,
        "created": "2021-10-09T21:41:27.024"
    }
]
```
Docker yaml file :

```yaml
version: "3.8"
services:
  mongodb:
    image: mongo
    container_name: mongodb
    ports:
      - 27017:27017
    volumes:
      - data:/data
    environment:
      - MONGO_INITDB_ROOT_USERNAME=rootuser
      - MONGO_INITDB_ROOT_PASSWORD=rootpass
  mongo-express:
    image: mongo-express
    container_name: mongo-express
    restart: always
    ports:
      - 8081:8081
    environment:
      - ME_CONFIG_MONGODB_ADMINUSERNAME=rootuser
      - ME_CONFIG_MONGODB_ADMINPASSWORD=rootpass
      - ME_CONFIG_MONGODB_SERVER=mongodb
volumes:
  data: {}

networks:
  default:
    name: mongodb_network
```

Future improvements :
- use records
- implement POST, PUT, etc
- try out GraphQL

