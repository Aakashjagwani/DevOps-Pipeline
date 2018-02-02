pipeline {
    agent any

    tools {
        maven 'Maven' 
    }
    stages{
	   stage('checkout project') {
	            steps {
	                git 'https://github.com/Aakashjagwani/DevOps-Pipeline'
	           }
	   }
	   stage ('Build') {
	   		steps{
	   		sh 'mvn clean package -DskipTests=true'    
	   		}
	   }
	   stage ('test') {
	            steps { 
	             sh 'mvn test' 
	            }
	   }
	   stage('Build Docker Image') {
	        steps{
				sh 'docker build -t aakash007/devops:latest .'
            }
	   }
	   stage('Docker Push') {
	       steps {
		   		withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
		          sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
		          sh 'docker push aakash007/devops:latest'      
		        }	
			}
	   }
	   stage('AWS Push'){
		   steps{
					sh "aws ecr get-login"
 	    			sh "docker tag aakash007/devops:latest 299857441992.dkr.ecr.us-east-1.amazonaws.com/devops:latest"
    				sh "docker push 299857441992.dkr.ecr.us-east-1.amazonaws.com/devops:latest"       
		   }	     
	   }
	}
}