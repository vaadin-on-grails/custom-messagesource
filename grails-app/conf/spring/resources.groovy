import app.i18n.JdbcMessageSource
import org.codehaus.groovy.grails.context.support.PluginAwareResourceBundleMessageSource

beans = {

    messageSource(JdbcMessageSource)

    messageBundleMessageSource(PluginAwareResourceBundleMessageSource) {
        basenames = "WEB-INF/grails-app/i18n/messages"
    }
}