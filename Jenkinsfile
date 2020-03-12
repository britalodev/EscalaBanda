pipeline {

        agent any    


        
        stages {
                stage('Build'){
                        sh '''
                        echo "PATH = ${PATH}"
                        echo "M3_HOME = ${M3_HOME}"
                        '''
                }
                
            stage('Oi Mundo Pipeline como Codigo') {
                steps {
                    sh 'echo "Oi Mundo"'
                }
            }
        }
    }
