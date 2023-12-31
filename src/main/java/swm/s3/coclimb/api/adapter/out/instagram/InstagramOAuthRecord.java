package swm.s3.coclimb.api.adapter.out.instagram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public record InstagramOAuthRecord(String clientId, String clientSecret, String redirectUri) {
    public InstagramOAuthRecord(@Value("${oauth.instagram.client_id}") String clientId,
                                @Value("${oauth.instagram.client_secret}") String clientSecret,
                                @Value("${oauth.instagram.redirect_uri}") String redirectUri) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUri = redirectUri;
    }
}

