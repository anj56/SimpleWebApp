pipeline {
    agent any

    stages {
        stage('checkout') {
            steps {
                echo 'checkingout'
            }
        }
         stage('package') {
            steps {
                echo 'mvn clean package'
            }
        }
         
         stage('publishing') {
            steps {
                echo 'publishing'
            }
        }
        stage('JaCoCo Report') {
            steps {
                jacoco()
            }
        }
    }
}

