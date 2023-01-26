def buildFrontend() {
    echo 'Building the frontend'
    sh   'cd frontend'
    sh   'npm install'
    sh   'npm run build'
}

def buildBackend() {
    echo 'Building the backend'
    sh   'cd backend'
    sh   'npm install'
    sh   'npm run build'
}

def testFrontend() {
    echo 'Testing the frontend'
    sh   'cd frontend'
    sh   'npm install'
    sh   'npm run test'
}

def testBackend() {
    echo 'Testing the Backend'
    sh   'cd backend'
    sh   'npm install'
    sh   'npm run test'
}

def scanFrontend() {
    echo 'Scanning the Frontend'
    sh   'cd frontend'
    sh   'npm install'
    sh   'npm audit fix --audit-level=critical --force'
    sh   'npm audit --audit-level=critical'
}

def scanBackend() {
    echo 'Scanning the Backend'
    sh   'cd backend'
    sh   'npm install'
    sh   'npm audit fix --audit-level=critical --force'
    sh   'npm audit --audit-level=critical'
}


return this
