def call(String url, String branch) {
    echo "Cloning the code from repository: ${url} and branch: ${branch}"
    
    // Checkout code from the Git repository
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: url]]
    ])
    
    echo "Code cloned successfully"
}

// def call(String url, String branch){
//   echo "This is cloning the code" 
//   git url: "${url}", branch: "${branch}"
//   echo "Code clonning Successfully"
// }

