pipeline {

        agent any    


        
        stages {
                stage('Build'){
                        steps {
                        sh '''
                        export M3_HOME=/user/share/maven
                        export PATH=${M3_HOME}/bin:${PATH}
                        echo "PATH = ${PATH}"
                        echo "M3_HOME = ${M3_HOME}"
                        mvn -v
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
