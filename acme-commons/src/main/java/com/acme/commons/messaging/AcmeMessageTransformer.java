package com.acme.commons.messaging;

import com.acme.commons.entities.AcmeMessage;
import org.apache.commons.collections4.Transformer;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * Transformer to translate a JMS {@link TextMessage} to a {@link AcmeMessage}
 *
 * @author ajorritsma
 */
public class AcmeMessageTransformer implements Transformer<TextMessage, AcmeMessage> {

    public AcmeMessage transform(TextMessage input) {
        try {
            AcmeMessage output = new AcmeMessage();
            output.setMessageHeaderId(input.getJMSMessageID());
            output.setType(input.getJMSType());
            output.setPayload(input.getText());
            return output;
        } catch (JMSException e) {
            throw new RuntimeException("Unable to read JMS Message");
        }
    }
}
