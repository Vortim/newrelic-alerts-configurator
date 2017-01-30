package com.ocado.panda.newrelic.api.internal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ocado.panda.newrelic.api.model.users.User;
import lombok.Value;

@Value
public class UserWrapper {
    @JsonProperty
    User user;
}
