package mysqltest

import grails.converters.*

class ProjectController {
    static  def allowedMethods = [ list : 'GET', create : 'GET']
    ProjectService projectService

    def list(){
        def config = grailsApplication.config
        log.info("App")
        render projectService.getAll() as JSON
    }

    def create(){
        log.info("App")
        render projectService.create() as JSON
    }
}
