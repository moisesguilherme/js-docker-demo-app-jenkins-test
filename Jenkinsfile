pipeline {
    
    agent {
        docker { image 'node:16.13.1-alpine' }
    }
    
    stages {
        stage('test') {
            steps {
                sh 'node --version'
            }
        }
        
        stage('build') {
        
            steps {
                echo 'building the application...'
                sh 'cd app'
                sh 'npm install'
              }
        }

        stage('deploy') {
      
              steps {
                  echo 'deplying the application...'
                  sh 'cd app'
                  sh 'node test.js'
              }
         }
      }
    }
}
