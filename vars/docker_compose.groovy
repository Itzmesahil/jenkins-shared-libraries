def call(){
  echo "This is Deploying the code"
  sh "docker-compose down && docker-compose up -d"
}
