pipeline {
    agent any
    tools {
        go 'go1.14'
    }
    stages {
        stage('Pre Test') {
            steps {
                echo 'Installing depencies'
                sh 'go version'
                sh 'go get -u golang.org/x/lint/golint'
           }
        }
        stage('Build') {
            steps {
                echo 'Compiling and building'
                sh 'go build hello-world.go'
            }
        }
        stage('Test') {
            steps {
                    echo 'Running command to run appication'
                    sh 'ls -ltr'
            }
        }
    }
}