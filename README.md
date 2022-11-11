sudo yum install docker -y

sudo systemctl --now enable docker.service

sudo usermod -aG docker $USER

docker run -d -p 8080:8080 --name jenkins \
  --volume jenkins_data:/bitnami/jenkins \
  bitnami/jenkins:2.361.3-debian-11-r3 
  
- user/bitnami
