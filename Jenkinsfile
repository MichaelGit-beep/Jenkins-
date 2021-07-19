pipeline {
  agent any
  stages {
    stage('Step 1') {
      parallel {
        stage('Step 1') {
          steps {
            sh 'echo "Step 1"'
          }
        }

        stage('Step 2') {
          steps {
            sh 'sleep 10'
          }
        }

        stage('Step 3') {
          steps {
            sleep 1
          }
        }

      }
    }

    stage('sleep') {
      steps {
        sleep 10
      }
    }

  }
}