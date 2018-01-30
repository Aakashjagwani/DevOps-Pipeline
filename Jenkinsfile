node {

   stage('Clone Repository') {
        // Get some code from a GitHub repository
        git 'https://github.com/Aakashjagwani/DevOps-Pipeline.git'
    
   }
   stage('Build Maven Image') {
        docker.build("devops1")
   }
   
   stage('Run Maven Container') {
       
        //Remove devops-container if it exisits
        sh " docker rm -f devops1-container"
        
        //Run maven image
        sh "docker run --rm --name devops1-container devops1"
   }
   
   stage('Deploy Spring Boot Application') {
        
         //Remove devops1-container if it exisits
        sh " docker rm -f java-deploy-container"
       
        sh "docker run --name java-deploy-container --volumes-from devops1-container -d -p 8085:8085 aakash007/devops"
   }

}