pipeline {

    agent any

    stages {

        stage('GitHub Checkout') {
            steps {
                echo '================================='
                echo 'FETCHING SOURCE CODE FROM GITHUB'
                echo '================================='
            }
        }

        stage('Build') {
            steps {
                echo 'SAUCEDEMO AUTOMATION PIPELINE'
                sh 'mvn clean'
            }
        }

        stage('Run Selenium Test') {
            steps {
                echo 'Website: https://www.saucedemo.com'
                sh 'mvn test'
            }
        }

    }

    post {

        success {

            echo '================================='
            echo 'SAUCEDEMO'
            echo 'Website: https://www.saucedemo.com'
            echo 'PIPELINE EXECUTED SUCCESSFULLY'
            echo '================================='
        }

        failure {

            echo '================================='
            echo 'SAUCEDEMO'
            echo 'Website: https://www.saucedemo.com'
            echo 'PIPELINE FAILED'
            echo '================================='
        }
    }
}

