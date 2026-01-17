def call(String ProjectName, String ImageTag, String dockerHubUser){
  echo "Pushing the code..."
    withCredentials([usernamePassword(credentialsId:"dockerHubCred", passwordVariable:"dockerHubPass", usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                sh "docker image tag ${ProjectName}:${ImageTag} ${dockerHubUser}/${ProjectName}:${ImageTag}"
                sh "docker push  ${dockerHubUser}/${ProjectName}:${ImageTag}"
                echo "images pushed"
    }
}
