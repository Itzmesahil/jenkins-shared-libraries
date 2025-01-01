def call(){
  echo "Cleaning up stopped containers and unused images"
  sh 'docker container prune -f'
  sh 'docker image prune -a -f'
  echo "Cleaning Jenkins workspace..."
  deleteDir() 
}
