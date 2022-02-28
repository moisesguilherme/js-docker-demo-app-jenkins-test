pipeline {    
    agent any
    
    stages {
        stage('run frontend') {
            steps {
                echo 'executing yarn...'
                nodejs('Node-10.17'){
                  sh 'yarn install'
                }
           }
        }
        stage('run backend') {
            steps {
              echo 'executing gradle...'
              withGradle('Gradle-7.3') {
                 sh './gradlew -v'
              }
         }
      }
  }
}
