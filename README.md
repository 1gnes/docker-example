# About

Simple docker demo with spring boot. 


### Building to docker image from dockerfile

```
mvn clean package
docker build -t spring-boot-docker-demo .
```

### Creating docker container from image

```
docker run -it --name boot-demo -p 5000:8080 spring-boot-docker-demo:latest
```
