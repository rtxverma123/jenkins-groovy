node{
    stage('Build'){
        timeout(time: 1, unit: 'SECONDS'){
            sleep 2
        }
    }
}



timeout(time: 1, unit: 'SECONDS'){
    node{
        sleep 2
    }
}