pipeline {

        agent any    


        
        stages {
                stage('Build'){
                        steps {
                        sh '''
                        export PATH=/user/share/maven/bin:${PATH}
                        sudo mvn clean install
                        '''
                        }
                }
                
            stage('Oi Mundo Pipeline como Codigo') {
                steps {
                    sh 'echo "Oi Mundo"'
                }
            }
        }
    }
