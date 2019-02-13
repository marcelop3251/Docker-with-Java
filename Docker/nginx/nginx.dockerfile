FROM nginx:latest
MAINTAINER Marcelo Garcia Palma
COPY /nginx/public/ /var/www/public
COPY /nginx/config/nginx.conf /etc/nginx/nginx.conf
EXPOSE 80
ENTRYPOINT ["nginx"]
CMD ["-g","daemon off;"]
