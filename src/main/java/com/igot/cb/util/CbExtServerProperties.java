package com.igot.cb.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Getter
@Setter
public class CbExtServerProperties {

    @Value("${cb-plan.update.publish.authorized.roles}")
    private String cbPlanUpdatePublishAuthorizedRoles;

    @Value("${cb.plan.v2.index}")
    private String cpPlanIndex;

    @Value("${cbplan.allowed.fields.update}")
    private String cbPlanUpdateAllowedFields;

    @Value("${elastic.required.field.cb.plan.json.path}")
    private String elasticCbPlanJsonPath;

    @Value("${non.text.fields}")
    private String nonTextFields;

    public List<String> getCbPlanUpdatePublishAuthorizedRoles() {
        return Arrays.asList(cbPlanUpdatePublishAuthorizedRoles.split(",", -1));
    }

    public void setCbPlanUpdatePublishAuthorizedRoles(String cbPlanUpdatePublishAuthorizedRoles) {
        this.cbPlanUpdatePublishAuthorizedRoles = cbPlanUpdatePublishAuthorizedRoles;
    }

    public List<String> getCbPlanUpdateAllowedFields() {
        return Arrays.asList(cbPlanUpdateAllowedFields.split(",", -1));
    }
}
