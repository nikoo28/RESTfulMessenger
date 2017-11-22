# RESTfulMessenger
A basic REST API application for social messenger.

##### Use the [POSTMAN](https://www.getpostman.com/) desktop/web client to test your API calls

## Package information
#### Model
* Database: Currently a static class. Can be dynamic as per your implementation.
* Model: Defines the data models/bean for each component. (Message)
  * Message 
    * ```List<Message> getAllMessages()```
    * ```Message getMessage(long id)```
    * ```Message addMessage(Message message)```
    * ```Message updateMessage(Message message)```
    * ```Message removeMessage(long id)```
* Resources: The place to get all your REST api calls
* Service: Classes to connect to all your favorite services and actually fetch the resources


#### POST follows the format
```json
{
    "author": "nikoo28",
    "created": "2017-11-22T11:54:34.339Z[UTC]",
    "message": "Posting a message"
}
```

#### TODO:
* Make it thread-safe
