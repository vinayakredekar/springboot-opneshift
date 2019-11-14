pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                withMaven(maven :'maven'){
                    sh 'mvn clean compile'
                }
            }
        }
        stage('Test'){
            steps{
                withMaven(maven :'maven'){
                    sh 'mvn test'
                }
            }
        }
        stage('install'){
            steps{
                withMaven(maven :'maven'){
                    sh 'mvn deploy'
                }
            }
        }
        
    }
}