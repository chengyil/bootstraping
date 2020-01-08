FROM openjdk:13
RUN mkdir -p /usr/app
VOLUME /usr/app
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["bash"]
