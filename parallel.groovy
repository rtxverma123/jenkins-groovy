node {
  stage('Running in parallel'){
    parallel 'P1':{
      echo 'First parallel executing'
      sleep 10
    },
      'P2':{
        echo 'second parallel'
        sleep 10
      },
        'P3':{
          echo 'Parallel 3'
          sleep 10
        },
          failFas: true 
  }
}
