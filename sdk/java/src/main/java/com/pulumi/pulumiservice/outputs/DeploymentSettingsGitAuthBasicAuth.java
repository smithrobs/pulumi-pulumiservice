// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeploymentSettingsGitAuthBasicAuth {
    /**
     * @return Password for git basic authentication.
     * 
     */
    private String password;
    /**
     * @return User name for git basic authentication.
     * 
     */
    private String username;

    private DeploymentSettingsGitAuthBasicAuth() {}
    /**
     * @return Password for git basic authentication.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return User name for git basic authentication.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSettingsGitAuthBasicAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        private String username;
        public Builder() {}
        public Builder(DeploymentSettingsGitAuthBasicAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public DeploymentSettingsGitAuthBasicAuth build() {
            final var o = new DeploymentSettingsGitAuthBasicAuth();
            o.password = password;
            o.username = username;
            return o;
        }
    }
}