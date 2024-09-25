package com.carrot.configuration;

import java.util.Locale;

public enum CommonOauth2Provider {
    GOOGLE{
        public Locale.Builder getBuilder(String registrationId){
            ClientRegistration.Builder builder =
                    getBuilder(registrationId,AuthenticationMethod.BASIC,DEFAULT_REDIRECT_URL);
        }
    };

}
