# RESTfulMessenger
A basic REST API application for social messenger.

##### Use the [POSTMAN](https://www.getpostman.com/) desktop/web client to test your API calls

## Package information
#### Model
* Database: Currently a static class. Can be dynamic as per your implementation.
* Model: Defines the data models/bean for each component. (Message)
  * Message 
    * ```getAllMessages()```
    * ```getMessage(long id)```
    * ```addMessage(Message message)```
    * ```updateMessage(long id, Message message)```
    * ```removeMessage(long id)```
  * Profile
    * ```getAllProfiles()```
    * ```getProfile(String profileName)```
    * ```addProfile(Profile profile)```
    * ```updateProfile(String profileName, Profile profile)```
    * ```removeProfile(String profileName)```
* Resources: The place to get all your REST api calls
* Service: Classes to connect to all your favorite services and actually fetch the resources

---

#### GET
###### MESSAGE
[http://localhost:8080/RESTfulMessenger/restapi/messages/](#)

[http://localhost:8080/RESTfulMessenger/restapi/messages/{messageId}](#)

###### PROFILE
[http://localhost:8080/RESTfulMessenger/restapi/profiles/](#)

[http://localhost:8080/RESTfulMessenger/restapi/messages/{profileId}](#)

---

#### POST
###### MESSAGE
[http://localhost:8080/RESTfulMessenger/restapi/messages/](#)
```json
{
    "author": "nikoo28",
    "created": "2017-11-22T11:54:34.339Z[UTC]",
    "message": "Posting a message"
}
```

###### PROFILE
[http://localhost:8080/RESTfulMessenger/restapi/profiles/](#)
```json
{
    "firstName": "User",
    "lastName": "Admin",
    "profileName": "admin"
}
```

---

#### PUT
###### MESSAGE
[http://localhost:8080/RESTfulMessenger/restapi/messages/{messageId}](#)
```json
{
    "author": "nikoo28",
    "created": "2017-11-22T11:54:34.339Z[UTC]",
    "message": "Updating a message"
}
```

###### PROFILE
[http://localhost:8080/RESTfulMessenger/restapi/profiles/{profilename}](#)
```json
{
    "firstName": "User",
    "id": 2,
    "lastName": "Admin"
}
```

---

#### DELETE
###### MESSAGE
[http://localhost:8080/RESTfulMessenger/restapi/messages/{messageId}](#)

###### PROFILE
[http://localhost:8080/RESTfulMessenger/restapi/profiles/{profilename}](#)

---

#### TODO:
* Make it thread-safe
