#!/usr/bin/env groovy

pipeline {
    agent any
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
                docker { 
                    image 'node:16.17.1-alpine'
                    // args '-v "$PWD":/frontend/node_modules -w /frontend/node_modules'
                    // reuseNode true
                }
            }
            steps {
                script {
                    gv.buildFrontend()
                }
            }
         }
        


        // stage('Build-Frontend') {
        //     steps {
        //         node('docker') {
        //             def image = 'node:16.17.1-alpine'        
        //             docker.image(image).inside {
        //                 script {
        //                     gv.buildFrontend()
        //                 }
        //             }
        //         }
        //     }
        // }

        // stage('Build-Backend') {
        //     steps {
        //         node('docker') {
        //             def image = 'node:16.17.1-alpine'
        //             docker.image(image).inside {
        //                 script {
        //                     gv.buildBackend()
        //                 }
        //             }
        //         }
        //     }
        // }

        // stage('Test-Frontend') {
        //     steps {
        //         node('docker') {
        //             def image = 'node:16.17.1-alpine'
        //             docker.image(image).inside {
        //                 script {
        //                     gv.testFrontend()
        //                 }
        //             }
        //         }
        //     }
        // }

        // stage('Test-Backend') {
        //     steps {
        //         node('docker') {
        //             def image = 'node:16.17.1-alpine'
        //             docker.image(image).inside {
        //                 script {
        //                     gv.testBackend()
        //                 }
        //             }
        //         }
        //     }
        // }

        // stage('Scan-Frontend') {
        //     steps {
        //         node('docker') {
        //             def image = 'node:16.17.1-alpine'
        //             docker.image(image).inside {
        //                 script {
        //                     gv.scanFrontend()
        //                 }
        //             }
        //         }
        //     }
        // }

        // stage('Scan-Backend') {
        //     steps {
        //         node('docker') {
        //             def image = 'node:16.17.1-alpine'
        //             docker.image(image).inside {
        //                 script {
        //                     gv.scanBackend()
        //                 }
        //             }
        //         }
        //     }
        // }
    }
}
