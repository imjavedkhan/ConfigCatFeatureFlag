# ConfigCatFeatureFlag

This application is demo of feature flag concept using ConfigCat(https://configcat.com/).

Also, Dockerfile is added to build image of application.

# Below command to build image
```
docker build -t spring-docker:latest .
```
# Below command to run container
```
docker run --name spd -d -p 8080:8080 spring-docker:latest
```
# Screenshot of application

![Screenshot 2022-09-02 at 7 49 56 PM](https://user-images.githubusercontent.com/21008846/188169464-419e6142-62ef-4893-8e54-5a518f9f0caf.png)
