pipeline {
    agent any
    def app 
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
       docker.withRegistry('https://registry.hub.docker.com', 'dockerHub') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
        }
      }
	}
	}
}