pipeline {
    agent any
    tools {
        maven "maven"
    }
    stages {
        
        stage("Build") {
            steps {
                script {
                    'mvn clean install'
                }
            }
        }
    }
}