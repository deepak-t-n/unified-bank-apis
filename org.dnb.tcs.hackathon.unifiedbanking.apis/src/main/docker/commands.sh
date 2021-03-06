
## Run the image
sudo docker run -p 8090:8090 ubp-apis > udp-api.logs &

sudo docker run --network="host" ubp-apis > udp-api.logs &

## Show the IP address of the docker (if it requires to be enabled in firewall / iptables)
sudo ip addr show docker0

## Show the list of docker process
sudo docker ps

## Stoping the docker container
sudo docker stop {container-id}

## Running the application without docker
java -jar ubp-apis.jar

## Packing using maven
mvn package

## Building the image using maven
sudo mvn -e docker:build

## Building the image using docker command
sudo docker build -t ubp-apis .
