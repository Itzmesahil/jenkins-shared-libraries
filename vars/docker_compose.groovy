def call(){
  echo "This is Deploying the Application"
  sh "docker-compose down && docker-compose up -d"
}
