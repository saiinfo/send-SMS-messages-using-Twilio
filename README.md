# Project Name

send-SMS-messages-using-Twilio

## Project Description
Send Sms  and Message From React Application To Mobile Phone
I am using a 'Twilio' is a 3rd party application used to send SMS.

### Prerequisites

Before starting, ensure you have the following installed:

- Java Development Kit 19 (JDK):  https://www.oracle.com/in/java/technologies/downloads/#jdk20-windows
- Apache Tomcat Server 9:[32-bit/64-bit Windows Service Installer (pgp, sha512)] https://tomcat.apache.org/download-90.cgi
- Java IDE (NetBeans): https://www.apache.org/dyn/closer.cgi/netbeans/netbeans-installers/18/Apache-NetBeans-18-bin-windows-x64.exe
- Mysql Database Version: https://dev.mysql.com/downloads/installer/

## Dependencies

You can use Maven or Gradle to add the Twilio Java library to your project. Include the following dependency in your project's build file:
<dependency>
    <groupId>com.twilio.sdk</groupId>
    <artifactId>twilio</artifactId>
    <version>7.1.0</version>
</dependency>

also add websocket dependancy in your project's build file:

<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-websocket</artifactId>
</dependency>


 ### Prerequisites
Before getting started, make sure you have the following set up:

First you need to set up your Twilio account and a suitable phone number.

a. Sign up for Twilio:
     1.Go to the Twilio website (https://www.twilio.com/) and sign up for an account.

b. Get Twilio Account SID and Auth Token:
     1. After signing up, log in to your Twilio dashboard.
     2. On the dashboard, you'll find your Account SID and Auth Token. These are required to authenticate your API requests.
     	Replace your_account_sid and your_auth_token with the actual Account SID and Auth Token obtained from your Twilio dashboard.

c. configure the websocket endpoint  and message broker.

## Run Application 
Run your Java application, and it should send an SMS using the Twilio API.
-Right-click on the project in the spring boot application.
-Select "Run" from the context menu.


## create react application 
## Integrating Spring Boot twilio Sms api
## Running the Project in Vs Code
a. Build the project: Open The terminal and used command 'npm start'.
b. Access the project:

   - Open a web browser.
   - Enter the URL (e.g., `http://localhost:3000/`).
## Priview 

Twilio API in postman

![image](https://github.com/saiinfo/send-SMS-messages-using-Twilio/assets/26924010/3b016260-9116-45b2-a522-b9d8edcf186f)



![image](https://github.com/saiinfo/send-SMS-messages-using-Twilio/assets/26924010/592d7e8a-c5fc-4902-92fb-8f9d808e3afb)



![image](https://github.com/saiinfo/send-SMS-messages-using-Twilio/assets/26924010/9b38ab8f-3e93-4ad6-b76b-9ad3167bd6dd)


Mobile Output

![image](https://github.com/saiinfo/send-SMS-messages-using-Twilio/assets/26924010/235d1d30-34a6-49bc-b400-facb154f8c13)





