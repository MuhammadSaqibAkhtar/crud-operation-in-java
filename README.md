# crud-operation-in-java
crud operation in java using database with the help of logging

How to connect data base with java application using mevan?
In this blog we will discuss that how java programmer can connect his application to JDBC. We was using the IntelliJ as an environment for java application/ For this purpose we must have MySQL Workbench for the database. We will create table in MySQL Workbench and connect it through Java application. Dependencies will be added  in POM.XML file of java in IntelliJ. POM.XML file is use for adding external dependencies in java.

Maven Dependency for JDBC MySQL
Below mention maven dependency to our project’s pom.xml file.

<dependency>
 <groupId>mysql</groupId>
 <artifactId>mysql-connector-java</artifactId>
 <version>8.0</version>
</dependency>

Then we have to make table in database. Once table is created we will add values to its columns and rows. Then will will connect it with our java program. Then we fetch the data and display it on console. After that we safe that data on file and display it. We using logging log4j2 which is latest one for configuration.
