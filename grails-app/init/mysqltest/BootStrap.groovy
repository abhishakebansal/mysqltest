package mysqltest

class BootStrap {
    def init = { servletContext ->
    log.info("App starting");
    }
    def destroy = {
    }
}
