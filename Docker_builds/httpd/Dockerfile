FROM ubuntu:16.04
RUN apt-get -y update
RUN apt-get -y install apache2
RUN apt-get -y install vim
EXPOSE 80
CMD ["/usr/sbin/apache2ctl", "-D","FOREGROUND"]
