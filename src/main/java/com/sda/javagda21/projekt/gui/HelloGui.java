package com.sda.javagda21.projekt.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route("hello-world")
public class HelloGui extends VerticalLayout {

    public HelloGui() {
        TextField labelField = new TextField("Your name");
        Button button = new Button("Say Hello");
        Label label = new Label();

        button.addClickListener(clicEvent -> {
            label.setText("Hello " + labelField.getValue());

        });



        add(labelField, button, label);
    }
}
