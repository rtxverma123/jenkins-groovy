node{
    timestamps{
        stage('Build'){
            echo 'Build stage echo statement printed out with timestamp'
        }
        stage('Deploy'){
            echo 'Deploy stage echo statement printed out with timestamp'
        }
    }
}



node {
    stage('Build'){
        timestamps{
            echo 'echo statement printed with timestamp'
        }
    }
    stage('Deploy'){
        echo 'printed without timestamp'
    }
}