FROM openjdk:8 
MAINTAINER Marcelo Garcia Palma

RUN  apt-get update && \
 	apt-get -y install git && apt-get -y install libgtk-3-dev && \
mkdir -p ${HOME}/workspace && \
 	cd /opt/ && \
 	wget http://espejito.fder.edu.uy/eclipse/technology/epp/downloads/release/2019-06/R/eclipse-jee-2019-06-R-linux-gtk-x86_64.tar.gz && \
 	tar -xzvf eclipse-jee-2019-06-R-linux-gtk-x86_64.tar.gz && \
 	rm eclipse-jee-2019-06-R-linux-gtk-x86_64.tar.gz

ENTRYPOINT /opt/eclipse/eclipse



