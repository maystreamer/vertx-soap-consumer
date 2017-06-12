# vertx-soap-consumer

Sample application built in Vertx to consume SOAP or WCF based services.

## Getting Started

Git clone the project on your local machine and add it to your workspace.

### Prerequisites

For runnning this, you will need
- Java 1.8
- Gradle support - In Eclipse editor, goto help -> eclipse marketplace -> search for buildship (buildship gradle integration) and install it.
- Axis 2  - Axis 2 library to generate java classes from WSDL files (http://axis.apache.org/axis2/java/core/).

## Brief

This application consumes a publicly available SOAP/WCF service: http://www.webservicex.net/geoipservice.asmx and Vertx is used to provide a rest API which will consume SOAP/WCF service and returns the response.
- **VertxSoapLauncher**       -> The starting point of the application. It is used to deploy the AppVerticle.
- **AppVerticle**             -> Main verticle which sets the configurations, routers, HttpServer etc for the Vertx.
- **GeoIPSoapHandler**        -> Rest Handler which receives the input, calls the SOAP service and returns the Json response.

Execute blocking is used here along with the Async SOAP handlers.

## Running the app

For running the app, (IDE used here is Eclipse)
- Open **appConfig.json** file and set the "Port" as per your choice. No need to change other values.
- Once, changes are done in **appConfig.json**, right click on the project("vertx-soap-consumer"), select "Run As" -> "Run Configurations". Set:
  * a) Main class: com.vertx.soap.launcher.VertxSoapLauncher
  * b) Program arguments: run com.vertx.soap.verticle.AppVerticle -conf ../vertx-soap-consumer/src/main/resources/appConfig.json
  * c) VM arguments: -Dlogback.configurationFile=file:../vertx-soap-consumer/src/main/resources/logback.xml
After setting the variables, click "Run".
- If app starts successfull, goto **http://localhost:8080/**. Status json {"status":"Ok"} will be served as response.
- To call the SOAP/WCF service, do <br />
*GET http://localhost:8080/vertx-soap/v1/geoip/69.89.31.226* <br />
*Content-Type: application/json* <br />
* Response would be: <br />
```json
{
  "code": 200,
  "message": "Success",
  "hasError": false,
  "data": {
    "returnCode": 1,
    "ipspecified": true,
    "returnCodeDetailsSpecified": true,
    "returnCodeDetails": "Success",
    "countryNameSpecified": true,
    "countryName": "United States",
    "countryCodeSpecified": true,
    "countryCode": "USA",
    "ip": "69.89.31.226"
  }
}
```
## Built With

* [Vertx](http://vertx.io/) - The web framework used
* [Axis2](http://axis.apache.org/axis2/java/core/) - Auto code generation using WSDL
* [Gradle](https://gradle.org/) - Dependency Management
