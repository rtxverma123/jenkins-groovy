node {
    def name = "jeff"
    def isgroovy = false
    withEnv(['DEPLOY_TO=production']){
        stage('Build'){
            if (env.DEPLOY_TO == 'production'){
                println "Deploying"
            }
            if (name == "jeff"){
                println "name is ${name}"
            }
            if (name != "jeff"){
                println "name is not jeff"
            }
            if (name == "jeff" && !isgroovy){
                println "name is ${name} or groovy is ok"
            }
        }
    }
}
