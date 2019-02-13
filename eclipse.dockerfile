FROM openjdk:8 
MAINTAINER Marcelo Garcia Palma

RUN  apt-get update && \
 	apt-get -y install git && \
 mkdir -p ${HOME}/workspace && \
 	cd /opt/ && \
 	wget http://eclipse.c3sl.ufpr.br/technology/epp/downloads/release/2018-09/R/eclipse-jee-2018-09-linux-gtk-x86_64.tar.gz  && \
 	tar -xzvf eclipse-jee-2018-09-linux-gtk-x86_64.tar.gz && \
 	rm eclipse-jee-2018-09-linux-gtk-x86_64.tar.gz 

ENTRYPOINT /opt/eclipse/eclipse

