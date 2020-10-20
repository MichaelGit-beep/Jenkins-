FROM ubuntu:16.04
RUN apt-get -y update
RUN apt-get -y install apache2
COPY index.html /var/www/html
EXPOSE 80
CMD ["/usr/sbin/apache2ctl", "-D","FOREGROUND"]