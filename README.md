# Test for count symbol task

#### Before run app locally you have to install on your machine the following tools:

- Java 17
- maven 3.6+

#### How to run app locally:

- Check that you in root folder `ls`
- Go into folder with app `cd count-symbols`
- Build project `mvn clean install`
- Run via command line `java -jar target/count-symbols-0.0.1-SNAPSHOT.jar`
- Open `http://localhost:8080/swagger-ui/index.html` to check that everything fine

#### How to check app works correctly:
- Open `http://localhost:8080/swagger-ui/index.html`
- Click on `POST /api/v1/count`
- Click on `Try it out`
- Put into `Request body` field any text you want
- Click on `Execute`

#### What params are available for count symbol request:
- You can put into `Request body` field any text you want
