// def call(String url, String branch){
//   echo "This is cloning the code" 
//   git url: "${url}", branch: "${branch}"
//   echo "Code clonning Successfully"
// }

def call(String url, String branch) {
    echo "This is cloning the code"
    
    // Using the 'git' step to clone the repository
    checkout([$class: 'GitSCM', 
              branches: [[name: "*/${branch}"]], 
              userRemoteConfigs: [[url: url]]])
    
    echo "Code cloning successfully"
}
