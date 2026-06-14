pipeline {

    agent any

    stages {

        stage('GitHub Checkout') {
            steps {
                echo '================================='
                echo 'FETCHING SOURCE CODE FROM GITHUB'
                echo 'Repository: https://github.com/aaradhya177/aaradhyaselenium1'
                echo '================================='
            }
        }

        stage('Build') {
            steps {
                echo '================================='
                echo 'SAUCEDEMO AUTOMATION PIPELINE'
                echo '================================='

                sh 'mvn clean'
            }
        }

        stage('Run Selenium Test') {
            steps {
                echo 'Launching SauceDemo Test'
                echo 'Website: https://www.saucedemo.com'

                sh 'mvn test'
            }
        }
    }

    post {

        success {
            echo '================================='
            echo 'GITHUB REPOSITORY CONNECTED'
            echo 'Repository: https://github.com/aaradhya177/aaradhyaselenium1'
            echo ''
            echo 'SAUCEDEMO'
            echo 'Website: https://www.saucedemo.com'
            echo 'Title: Swag Labs'
            echo ''
            echo 'PIPELINE EXECUTED SUCCESSFULLY'
            echo '================================='
        }

        failure {
            echo '================================='
            echo 'GITHUB REPOSITORY CONNECTED'
            echo 'Repository: https://github.com/aaradhya177/aaradhyaselenium1'
            echo ''
            echo 'SAUCEDEMO'
            echo 'Website: https://www.saucedemo.com'
            echo ''
            echo 'PIPELINE FAILED'
            echo '================================='
        }

        always {
            echo 'Build Finished'
        }
    }
}
