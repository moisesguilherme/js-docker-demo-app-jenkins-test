def buildApp() {
    echo 'building the application, print from Groovy script'
}

def testApp() {
    echo 'Testing the application, print from Groovy script'
}

def deployApp() {
    echo 'deploying the application, print from Groovy script'
    echo "deploying version ${params.VERSION}"
}

return this