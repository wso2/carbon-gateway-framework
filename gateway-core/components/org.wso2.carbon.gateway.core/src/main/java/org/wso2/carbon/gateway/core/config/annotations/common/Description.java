package org.wso2.carbon.gateway.core.config.annotations.common;

import org.wso2.carbon.gateway.core.config.ConfigConstants;
import org.wso2.carbon.gateway.core.config.annotations.StringAnnotation;

/**
 * Common annotation @Description used to place a descriptive note.
 */
public class Description extends StringAnnotation {
    public Description() {
        super(ConfigConstants.AN_DESCRIPTION);
    }

    public Description(String value) {
        super(ConfigConstants.AN_DESCRIPTION, value);
    }
}
