pipeline{
    agent {label 'linux'}
    stages{
        stage("git checkout"){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [[$class: 'SparseCheckoutPaths', sparseCheckoutPaths: []]], userRemoteConfigs: [[url: 'https://github.com/MichaelGit-beep/Hello_World.git']]])
            }
        }
        stage(";s"){
            steps{
                sh "ls"
            }
        }
    }
}