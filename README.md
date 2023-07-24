# Project Name

Send Sms  and Message App

## Project Description
Send Sms  and Message From React Application To Mobile Phone
I an using a 'Twilio' is a 3rd party application used to send SMS.

### Prerequisites

Before starting, ensure you have the following installed:

- Java Development Kit 19 (JDK):  https://www.oracle.com/in/java/technologies/downloads/#jdk20-windows
- Apache Tomcat Server 9:[32-bit/64-bit Windows Service Installer (pgp, sha512)] https://tomcat.apache.org/download-90.cgi
- Java IDE (NetBeans): https://www.apache.org/dyn/closer.cgi/netbeans/netbeans-installers/18/Apache-NetBeans-18-bin-windows-x64.exe
- Mysql Database Version: https://dev.mysql.com/downloads/installer/

## Dependencies

We need to add the Twilio dependency in our build configuration file (pom.xml)
<dependency>
    <groupId>com.twilio.sdk</groupId>
    <artifactId>twilio</artifactId>
    <version>7.1.0</version>
</dependency>

also add websocket dependancy.
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-websocket</artifactId>
</dependency>


 ### Prerequisites
Before getting started, make sure you have the following set up:

First you need to set up your Twilio account and a suitable phone number.

a. if you haven't yet, sign up for free Twilio account
b. Get The follwing information 
      1)ACCOUNT_SID Number

	  2) AUTH_TOKEN Number

	  3) FROM_NUMBER 

c. configure the websocket endpoint  and message broker.

## Run Application 
-Right-click on the project in the spring boot application.
-Select "Run" from the context menu.


## create react application 
## Integrating Spring Boot Sms api
## Running the Project in Vs Code
a. Build the project: Open The terminal and used command 'npm start'.
b. Access the project:

   - Open a web browser.
   - Enter the URL (e.g., `http://localhost:3000/`).
## Priview 

