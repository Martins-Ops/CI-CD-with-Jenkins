#!/usr/bin/env groovy
pipeline {
    stages {
        stage('init') {
            steps {
                script {
                    gv = load 'script.groovy'
                }
            }
        }
        stage('Build-Frontend') {
            agent {
                docker { image 'node:16.17.1-alpine' }
            }
            steps {
                script {
                    gv.buildFrontend()
                }
            }
        }

        stage('Build-Backend') {
            agent {
                docker { image 'node:16.17.1-alpine' }
            }
            steps {
                script {
                    gv.buildBackend()
                }
            }
        }

        stage('Test-Frontend') {
            agent {
                docker { image 'node:16.17.1-alpine' }
            }
            steps {
                script {
                    gv.testFrontend()
                }
            }
        }
        stage('Test-Backend') {
            agent {
                docker { image 'node:16.17.1-alpine' }
            }
            steps {
                script {
                    gv.testBackend()
                }
            }
        }

        stage('Scan-Frontend') {
            agent {
                docker { image 'node:16.17.1-alpine' }
            }
            steps {
                script {
                    gv.scanFrontend()
                }
            }
        }

        stage('Scan-Backend') {
            agent {
                docker { image 'node:16.17.1-alpine' }
            }
            steps {
                script {
                    gv.scanBackend()
                }
            }
        }
    }
}
        
      

