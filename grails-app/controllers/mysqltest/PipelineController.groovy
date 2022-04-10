package mysqltest


import grails.rest.*
import grails.converters.*

class PipelineController {
    static  def allowedMethods = [ list : 'GET', create : 'GET']
    PipelineService pipelineService
    def list(){
        def config = grailsApplication.config
        log.info("App")
        render pipelineService.getAll() as JSON
    }

    def create(){
        log.info("App")
        render pipelineService.create() as JSON
    }
}
