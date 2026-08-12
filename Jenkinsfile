pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                bat 'if not exist deploy mkdir deploy'
                bat 'copy /Y target\\ci-cd-demo-1.0-SNAPSHOT.jar deploy\\'
                echo 'JAR deployed successfully!'
            }
        }

        stage('Run Application') {
            steps {
                bat 'start "" /B java -jar deploy\\ci-cd-demo-1.0-SNAPSHOT.jar'
                echo 'Application started successfully!'
            }
        }
    }

    post {
        success {
            echo 'CI/CD Pipeline completed successfully!'
        }

        failure {
            echo 'CI/CD Pipeline failed!'
        }
    }
}