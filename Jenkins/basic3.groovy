*********************Dosent Run*************************
*********************Reference**************************



def jsonParseData(jsonObj) {

    def slurObj=new groovy.json.JsonSlurper().parseText(jsonObj)
    return slurObj

}

// create gitlab group if not present already

def createGitLabGroup(gitlabToken, gitlabUrl, parentGroupId, groupName){

 stage('Create GitLab group'){

   script{

     def parentGroupId

     def groupName
     grpId=getSubGroupDetails(parentGroupId, groupName)

     if (grpId.equals(null)){     

     def subgrpCreate= sh script: """curl -X POST -H "PRIVATE-TOKEN: ${gitlabToken}" -H 'Content-Type: application/json' \

                 ${gitlabUrl}/groups \

                -d '{ "web_url":"${gitlabUrl}${grpfullpath}",

                      "name":"${groupName}", 

                      "path":"${groupName}", 

                      "description":"${groupName}", 

                      "visibility":"private", 

                      "request_access_enabled":"false",

                      "parent_id":${parentGroupId}}'""", returnStdout: true

      return jsonParseData(subgrpCreate).id

     }

     else{

        return grpId

     }

   }

  }

}

// get parent gitlab group information under subgroup will be created

def getParentGroupObject(){

  stage('Get Parent Details'){

        script{

          def groupdDetails=sh script: """curl --request GET --header "PRIVATE-TOKEN: ${gitlabToken}" ${gitlabUrl}groups/${gitlabGroupId}""", returnStdout: true

          return jsonParseData(groupdDetails)

        }

   }

}

// search gitlab group already exist or not

def getGitGroupObject(gitParentId){

 stage('Git Group Object'){

    script{

        def grpObj=sh script: """curl --request GET --header "PRIVATE-TOKEN: ${gitlabToken}" ${gitlabUrl}groups/${parentGroupId}/subgroups?search=${groupName}""", returnStdout: true

        return jsonParseData(grpObj)

        }

   }

 }


def getSubGroupDetails(parentGroupId, groupName){

    if (getParentGroupObject()==~/(.*)404(.*)/){

        println("group not found")

    }

    else{

        grpfullpath=getParentGroupObject().full_path+"/"+groupName

        def gitgrpdetails=getGitGroupObject(parentGroupId)

        def grpId=0

         for (i=0; i<gitgrpdetails.size(); i++){

          if ((gitgrpdetails.full_path[i]).equals(grpfullpath)){              

                   grpId=gitgrpdetails.id[i]

                   return grpId

          }

       }

    }

}


return this
