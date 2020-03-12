pipeline {

        agent any    


        
        stages {
                stage('Build'){
                        steps {
                        sh '''
                        export M3_HOME=/user/share/maven
                        export PATH=${M3_HOME}/bin:${PATH}
                        mvn clean install
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
