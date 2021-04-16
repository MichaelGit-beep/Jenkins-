pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                sh
                #/bin/bash
                x=1
                while [ $x -ne 10 ]
                do
                echo "Valueis is $x"
                x=$((x+1))
                done
            }
        }
        stage('Test') { 
            steps {
                echo "Start Test"
            }
        }
        stage('Deploy') { 
            steps {
                echo "Start Deploy"
            }
        }
    }
}
