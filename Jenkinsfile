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

                stage("Artifact Upload To Nexus") {
            steps {
                script {
                    nexusArtifactUploader artifacts: [
                        [
                            artifactId: 'maven-jenkins', 
                            classifier: '', 
                            file: 'target/maven-jenkins-1.0.jar', 
                            type: 'jar'
                        ]
                    ], 
                    credentialsId: 'nexus', 
                    groupId: 'org.example', 
                    nexusUrl: '54.160.156.229:8081', 
                    nexusVersion: 'nexus3', 
                    protocol: 'http', 
                    repository: 'nexus-maven', 
                    version: '1.0.0'
                }
            }
        }
    }
}