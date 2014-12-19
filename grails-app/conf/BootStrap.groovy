import app.Message

class BootStrap {

    def init = { servletContext ->

        Message home = new Message(key: 'home', value: 'Home', locale: Locale.ENGLISH)
        home.save(failOnError: true)
    }
    def destroy = {
    }
}
