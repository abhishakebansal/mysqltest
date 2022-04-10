package mysqltest

import grails.gorm.transactions.Transactional

class ProjectService {
    @Transactional
    def getAll() {
        Project.withNewTransaction {
            List<Project> project = Project.findAll()
            return project
        }
    }

    @Transactional
    def create(){
        Project.withNewTransaction {
            Project project = new Project(name: "Abhi" , description: "test")
            return project.insert()
        }
    }
}
