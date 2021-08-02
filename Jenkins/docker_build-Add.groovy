node{
    stage('Build'){
        checkout([$class: 'GitSCM',
            branches: [[name: "main"]],
            userRemoteConfigs: [[
                url: 'https://github.com/rtxverma123/jenkins_scripting.git']]
        ])
        def mycustomImage = docker.build("rtxverma123ubuntu:my-latest","--tag mydockerfile:example .")
        mycustomImage.inside{
            sh 'cat /etc/lsb-release'
        }

    }
}