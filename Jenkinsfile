pipeline {    
    agent any
    environment {
        NEW_VERSION = '1.3.0'
        SERVER_CREDENTIALS = credentials('server-credentials')
    }
    stages {
        stage('build') {            
            steps {
                echo 'building the application...'
                echo "building version ${NEW_VERSION}"
            }
        }
      
      stage('test') {
           steps {
                echo 'testing the applicaiont...'
            }
        }
      
      stage('deploy') {
            steps {
                echo 'deploying the applicaiton...'
                //echo "deploying with ${SERVER_CREDENTIALS}"
                //sh  "${SERVER_CREDENTIALS}"
                withCredentils([
                    usernamePassword(credentials: 'server-credentials', usernameVariable: USER, passwordVariable: PWD)
                ]) {
                    sh "echo some script ${USER} ${PWD}"

                }
            }
        }       
     }
}
