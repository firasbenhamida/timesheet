node {
	    
	    stage('Clone and clean Repo') 
	    { // for display purposes
	      git 'https://gitlab.com/firas.benhamida/reservationservice.git'
	      bat "mvn clean"
	    }    
	  
	    stage('Build Project') 
	    {
	      bat "mvn package"
	    }
			
	    stage('Build Docker Image') 
            {
	      bat "docker build -t firasbh/reservationservice ."
	    }

	    stage('Run container') 
            {
	       bat"docker run -p 8082:8082 -t firasbh/reservationservice"
	    }
	   
	    stage('Deploy Docker Image')
	    {
	 	  bat "docker login"
	      bat "docker push firasbh/reservationservice"
	    }  
	 }