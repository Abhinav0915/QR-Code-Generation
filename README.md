
# QR Code Generator

## Introduction

The QR Code Generator project is a Spring Boot application developed to generate QR codes dynamically based on user input. This project utilizes the Google ZXing library to create QR codes and provides endpoints to either download the generated QR code image or retrieve it as a byte array.

## Features

- Dynamic QR Code Generation: Users can specify the text, width, and height parameters to generate QR codes on-the-fly.
- RESTful API Endpoints: Provides RESTful API endpoints to generate and download QR codes.
- Error Handling: Proper error handling for exceptions during QR code generation.

## Technologies Used

- Java 17: The project is developed using Java programming language version 17.
- Spring Boot: Utilized for building and running the application.
- Google ZXing Library: Used for generating QR codes.
- Maven: Dependency management and build tool.

## Project Structure

- QRController: Defines RESTful endpoints for generating and downloading QR codes.
- QRCodeGenerator: Contains methods to generate QR codes using the ZXing library.
- POM.xml: Maven configuration file specifying project dependencies and build settings.


## Restful Endpoints

1. Generate and Download QR Code:
   - URL: /generateAndDownloadQRCode/{codeText}/{width}/{height}
   - Method: GET
   - Parameters:
     - codeText: Text content for the QR code.
     - width: Width of the QR code.
     - height: Height of the QR code.
   - Description: Generates a QR code based on the provided parameters and downloads the image.
   
2. Generate QR Code:
   - URL: /generateQRCode/{codeText}/{width}/{height}
   - Method: GET
   - Parameters:
     - codeText: Text content for the QR code.
     - width: Width of the QR code.
     - height: Height of the QR code.
   - Description: Generates a QR code based on the provided parameters and returns it as a byte array.

## Dependency Used

- Spring Boot Starter Web: For building web applications using Spring MVC.
- Lombok: Provides annotations to reduce boilerplate code.
- Spring Boot Starter Test: For testing Spring Boot applications.
- Google ZXing Core and JavaSE: Libraries for generating QR codes.

## Conclusion

The QR Code Generator project offers a simple yet powerful solution for generating QR codes dynamically through RESTful endpoints. With its ease of use and flexibility, it can be integrated into various applications requiring QR code generation functionality.




