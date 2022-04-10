package mysqltest

class Project {
    String name
    String description
    static mapping = {
        datasource 'project'
        table 'project'
        version false
        id column:'projectId'
        grailsName column: 'name'
    }
}
