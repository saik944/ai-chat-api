# AI Chat API

A simple Spring Boot REST API project that accepts a message in JSON format and returns a response.

## Technologies Used

- Java
- Spring Boot
- REST API
- Maven
- Postman

## Project Structure

- Controller - Receives HTTP requests
- DTO - Stores the incoming message
- Service - Processes the message and generates the response

## API Endpoint

POST /api/chat

## Example Request

{
  "message": "Hello AI"
}

## Example Response

You said: Hello AI

## How It Works

Postman
↓
JSON Request
↓
ChatController
↓
ChatRequest DTO
↓
ChatService
↓
Response
↓
Postman