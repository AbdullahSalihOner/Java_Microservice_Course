# Uygulama için gerekli olan JDK
FROM amazoncorreto:21
# From ile Docker Hub üzerinden image çekilir

# Projemizdeki JAR dosyasını Docker image'ına kopyalıyoruz, Dockerda çalıştırılacak olan JAR dosyası
ARG JAR_FILE=target/*.jar

# JAR dosyasını Docker image'ına kopyalıyoruz, Docker a kopayalama işlemi
COPY ${JAR_FILE} app.jar

# Terminal komutları için CMD kullanılır,
CMD apt-get update -y

# Projenin çalıştırılacağı iç port
EXPOSE 8080

# Uygulamanın çalıştırılmasını sağlayan komut
ENTRYPOINT ["java","-jar","/app.jar"]