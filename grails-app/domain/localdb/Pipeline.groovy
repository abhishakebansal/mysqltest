package localdb

class Pipeline {
    String name
    String description
    static mapping = {
        datasource 'pipeline'
        table 'pipeline'
        version false
        id column:'pipelineId'
        grailsName column: 'name'
    }
}
