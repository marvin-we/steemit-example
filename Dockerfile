FROM ubuntu:16.04

EXPOSE 8080

RUN apt-get update && apt-get install -y openjdk-9-jre
RUN mkdir /data && mkdir /data/steemit

ADD target/dez1337Example/ /data/steemit/

CMD /data/steemit/bin/dez1337Example