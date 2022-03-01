pipeline {    
    agent any
    parameters {
        //string(name: 'VERSION', defaultValue: '', description: 'version to deploy on prod')
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    environment {
        NEW_VERSION = '1.3.0'
        SERVER_CREDENTIALS = credentials('server-credentials')
    }
    /*tools {
       maven "Maven"
       gradle "Gradle-7.3"
    }*/
    stages {
        stage('build') {            
            steps {
                echo 'building the application...'
                echo "building version ${NEW_VERSION}"
                //sh "mvn install"
            }
        }
      
      stage('test') {
           when {
               expression {
                   params.executeTests == true
               }
           }
           steps {
                echo 'testing the applicaiont...'
            }
        }
      
      stage('deploy') {
            steps {
                echo 'deploying the applicaiton...'
                echo "deploying version ${params.VERSION}"
                //echo "deploying with ${SERVER_CREDENTIALS}"
                //sh  "${SERVER_CREDENTIALS}"
                /*withCredentials([
                    usernamePassword(credentialsId: 'server-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')
                ]) {
                    sh "echo some script ${USERNAME} ${PASSWORD}"
                }*/
            }
        }       
     }
}
