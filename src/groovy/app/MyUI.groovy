package app

import com.vaadin.grails.Grails
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout

class MyUI extends UI {

    @Override
    protected void init(VaadinRequest r) {

        VerticalLayout layout = new VerticalLayout()
        layout.setMargin(true)

        Label lbl1 = new Label(Grails.i18n('do.not.exist', Locale.ENGLISH))
        layout.addComponent(new Label(lbl1))

        Label lbl2 = new Label(Grails.i18n('home', Locale.ENGLISH))
        layout.addComponent(new Label(lbl2))

        setContent(layout)
    }
}