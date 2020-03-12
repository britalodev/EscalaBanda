pipeline {

        agent any    

        tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk11' 
    }
        
        stages {
                stage('Build'){
                        sh '''
                        echo "PATH = ${PATH}"
                        echo "M2_HOME = ${M3_HOME}"
                        '''
                }
                
            stage('Oi Mundo Pipeline como Codigo') {
                steps {
                    sh 'echo "Oi Mundo"'
                }
            }
        }
    }
