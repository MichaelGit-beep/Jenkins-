pipeline{
    agent {lable 'linux'}
    stages{
      stage('git checkout'){
          steps{
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [[$class: 'SparseCheckoutPaths', sparseCheckoutPaths: [[path: './Dockerfile']]]], userRemoteConfigs: [[url: 'https://github.com/MichaelGit-beep/Hello_World.git']]])
          }
          }
    }
}
