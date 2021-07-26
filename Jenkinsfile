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
            sh 'sleep 1'
          }
        }

        stage('Step 222222') {
          steps {
            sh 'sleep 1'
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
      parallel {
        stage('sleep') {
          steps {
            sleep 1
          }
        }

        stage('ttt') {
          steps {
            sleep 1
          }
        }

        stage('sadfasdfasdf') {
          steps {
            sleep 1
          }
        }

      }
    }

    stage('123') {
      parallel {
        stage('123') {
          steps {
            sh 'sleep 1'
          }
        }

        stage('13333') {
          steps {
            sleep 1
          }
        }

        stage('Build') {
          steps {
            sleep 5
          }
        }

      }
    }

    stage('222') {
      parallel {
        stage('222') {
          steps {
            sh 'sleep 1'
          }
        }

        stage('test1') {
          steps {
            sleep 1
          }
        }

      }
    }

    stage('Step 13') {
      parallel {
        stage('Step 14') {
          steps {
            sh 'echo "Step 1"'
          }
        }

        stage('Step 25') {
          steps {
            sh 'sleep 1'
          }
        }

        stage('Step 36') {
          steps {
            sleep 1
          }
        }

        stage('Step 365') {
          steps {
            sleep 1
          }
        }

      }
    }

  }
  parameters {
    string(name: 'TargetMachine', defaultValue: '', description: 'Target Machine Address')
    string(name: 'Username', defaultValue: '', description: 'Target Machine User')
    password(name: 'Password', defaultValue: '', description: 'Target Machine Password')
    string(name: 'GraylogAPI', defaultValue: '', description: 'Graylog Server API URL')
    password(name: 'Token', defaultValue: '', description: 'Graylog\'s API Token for sidecar')
  }
}