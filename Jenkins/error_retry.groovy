node{
    stage('Build'){
        retry(3){
            error 'Error statement just got executed'
        }
    }
}