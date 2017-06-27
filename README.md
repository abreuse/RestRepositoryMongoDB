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
