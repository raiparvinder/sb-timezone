# sb-timezone
Spring boot application demonstrating how to set default timezone for an application


## Run service and verify default timezone for your application is PST
'''
    java -jar target/sb-timezone-0.0.1-SNAPSHOT.jar
'''

### Call your application using curl
'''
$ curl http://localhost:8080/greeting
{
    "id":1,
    "content":"Hello, World! Time now is: 2020-12-24T08:36:19.886625",
    "dateLastModified":"2020-12-24T08:36:19.886625"
}
'''
### Call your application from browser

Following is a screenshot of browser call

![Json output of browser](./rest-call.png?raw=True)