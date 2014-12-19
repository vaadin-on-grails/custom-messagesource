package app.i18n

import app.Message
import org.codehaus.groovy.grails.context.support.PluginAwareResourceBundleMessageSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.support.AbstractMessageSource

import java.text.MessageFormat

class JdbcMessageSource extends AbstractMessageSource {

    @Autowired
    PluginAwareResourceBundleMessageSource messageBundleMessageSource

    @Override
    protected MessageFormat resolveCode(String code, Locale l) {
        Message message = Message.findByKeyAndLocale(code, l)

        MessageFormat format
        if (message) {
            format = new MessageFormat(message.value, message.locale)
        } else {
            format = messageBundleMessageSource.resolveCode(code, l)
            if (!format) {
                format = new MessageFormat("[$code]", l)
            }
        }
        return format
    }
}