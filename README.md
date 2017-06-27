REST REPOSITORY WITH MONGODB
============================

# 1. Install MongoDB

MAC OS :

    $ brew install mongodb

Others : 

>Go to https://docs.mongodb.com/manual/installation/

# 2. Install MongoDB GUI (optional)

> Install [Compass GUI](https://www.mongodb.com/download-center?filter=enterprise&utm_source=google&utm_campaign=EMEA_France_CorpEntOnly_Brand_Alpha_FM&utm_keyword=compass%20mongodb&utm_device=c&utm_network=g&utm_medium=cpc&utm_creative=197732053115&utm_matchtype=e&_bt=197732053115&_bk=compass%20mongodb&_bm=e&_bn=g&jmp=search&gclid=Cj0KEQjwhMjKBRDjxb31j-aesI4BEiQA7ivN-OeZ_Ze0ffuqYphUVStr06IQsB4MI6e9cibID-TTvegaAhFP8P8HAQ#compass)

# 3. Configuration

application.properties
``` 
 spring.data.mongodb.host=localhost
 spring.data.mongodb.port=27017
 spring.data.mongodb.database=yourdatabase
 ```

# 4. Build 

With Maven :

    $ mvn clean package

# 5. Start

Start MongoDB server :

    $ mongod

Create database :

    $ mongo
    $ USE yourdatabase

Start REST API :

    $ java -jar target/hooper-0.0.1-SNAPSHOT.jar

# 6. Usages

    $ curl http://localhost:8080
    
    $ curl http://localhost:8080/user
    
    $ curl http://localhost:8080/user/53149b8e3004990b1af9f229
    
    $ curl http://localhost:8080/people/search
    
    $ curl http://localhost:8080/people/search/findByFirstName?name=Frodo
    
    $ curl http://localhost:8080/people/search/findByLastName?name=Baggins
    
    $ curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Frodo\",  \"lastName\" : \"Baggins\" }" http://localhost:8080/user
    
    $ curl -X PUT -H "Content-Type:application/json" -d "{ \"firstName\": \"Bilbo\", \"lastName\": \"Baggins\" }" http://localhost:8080/user/53149b8e3004990b1af9f229
    
    $ curl -X PATCH -H "Content-Type:application/json" -d "{ \"firstName\": \"Bilbo Jr.\" }" http://localhost:8080/user/53149b8e3004990b1af9f229
    
    $ curl -X DELETE http://localhost:8080/user/53149b8e3004990b1af9f229
