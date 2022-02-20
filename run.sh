mvn clean install
cp target/*.jar infra/app.jar
cd infra
docker build -t bispatel/aro-mongo-service .
docker push  bispatel/aro-mongo-service

