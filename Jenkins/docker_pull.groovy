node{
    def mavenImage = docker.image('maven')
    stage('Pull'){
        mavenImage.pull()
        echo 'Maven image pulled successfully'
    }
    stage('Inside Image'){
        mavenImage.inside('-e someEnv=dev',{
            sh 'echo $someEnv'
            })
    }
}