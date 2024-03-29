sudo yum install docker -y

sudo systemctl --now enable docker.service

sudo usermod -aG docker $USER

docker run -d -p 8080:8080 --name jenkins \
  --volume jenkins_data:/bitnami/jenkins \
  bitnami/jenkins:2.361.3-debian-11-r3 
  
- user/bitnami
- install docker pipeline plugin (https://docs.cloudbees.com/docs/admin-resources/latest/plugins/docker-workflow)
- repo with DSL examples https://github.com/darinpope/jenkins-example-docker
### Scripted pipeline usage
```
node("linux") {
    def agent = docker.image('node:16-alpine')
    agent.pull()
    sh "touch file1"
    agent.inside {
        sh '''
            node --version
            ls
        '''
    }
}
```

### DSL
```

pipeline {
  agent {
    docker { image 'node:16-alpine' }
  }
  stages {
    stage('Test') {
      steps {
        sh 'node --version'
      }
    }
  }
}
```


### Build costum image and run
```
node("linux") {
    sh """
cat <<EOF> Dockerfile
FROM node:16-alpine
EOF
    """
    def myEnv = docker.build 'my-environment:snapshot'
    myEnv.inside {
        sh '''
            node --version
            ls
        '''
    }
}
```
