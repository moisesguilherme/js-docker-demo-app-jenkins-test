pipeline {    
    agent any
    
    stages {
        stage('test') {
           agent{
                docker { image 'node:16.13.1-alpine' } 
            }
        
            steps {
                echo 'teste'
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
