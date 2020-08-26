# SpringCountryDB
This program will read country data from a database and output the data onto a webpage

* This program utilizes RabbitMQ, so to run, you must download and run RabbitMQ using the command:
  * brew services start rabbitmq
* You can monitor RabbitMQ at localhost:15672
* Run the program as a Spring Boot application
* Check the output by using H2 console at localhost:8080/h2-console and connect
* In the console, you can click COUNTRY on the left-hand side or type SELECT * FROM COUNTRY and hit run
* This will show all data in the database, which by default only holds data for the United States
* Alternatively, you can go to localhost:8080/Countries to see all the countries
* You can alter the URL to see specific data
* localhost:8080/Countries/countryname will give you data for one specific country
  * For example, localhost:8080/Countries/USA will show data for the United States
* localhost:8080/Capital/capital will give you data for the country whose capital is specified
* localhost:8080/Landmark/landmark will give data for the country that has that certain landmark
* localhost:8080/Id/id will give data for the country whose id matches, which isn't very useful for the user
* All of this can be viewed in Postman for better formated output
* Additionally, Postman allows users to add data to the database by using Post at localhost:8080/Country
  * Data to be inputted is (in XML format):
    * { "name": "String",
    * "capital": "String",
    * "population": int,
    * "landmark": "String" }
