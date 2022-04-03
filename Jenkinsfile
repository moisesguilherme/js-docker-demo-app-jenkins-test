pipeline {
    agent any
    stages {

        stage('Build') {
              steps {
                echo 'executing gradle...'
                sh '''
                cd demo
                ./gradlew clean build
                '''
              }
        }

        stage('SonarQube analysis') {
        //def scannerHome = tool 'SonarScanner 4.0';
          steps{
            withSonarQubeEnv(installationName: 'sq1'){ 
              // If you have configured more than one global server connection, you can specify its name
              //sh "${scannerHome}/bin/sonar-scanner"
                sh '''
                echo $SONAR_LOGIN_KEY
                echo $SONAR_URL_KEY
                cd demo
                ./gradlew sonarqube
                '''
             }
          }
        }

        stage('Quality gate') {
          steps{
            waitForQualityGate abortPipeline: true
          }
        }
    }
}