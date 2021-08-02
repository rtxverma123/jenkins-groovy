node {
    stage('Build'){
        def mavenImage = docker.withRegistry('xyz(registry url)', 'credentials id'){
            docker.image('image name in registry').inside{
                sh 'printenv'
            }
        }
    }
}