package mysqltest

import grails.gorm.transactions.Transactional
import localdb.Pipeline
class PipelineService {
    def getAll() {
        List<Pipeline> pipeline = null
        Pipeline.withNewTransaction {
            pipeline = Pipeline.getAll()
        }
        return pipeline
    }
    def create(){
        Pipeline.withNewTransaction {
            Pipeline pipeline = new Pipeline(name: "Abhi", description: "test")
            return pipeline.insert()
        }
    }
}
