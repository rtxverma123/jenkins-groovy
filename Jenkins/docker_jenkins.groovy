node {
    stage('Build'){
        node{
            echo 'This is a node stage'
        }
    }
    stage('Docker'){
        def mavenImage = docker.image('maven')
        
        mavenImage.inside{
            sh 'mvn -v'
        }
    }
}