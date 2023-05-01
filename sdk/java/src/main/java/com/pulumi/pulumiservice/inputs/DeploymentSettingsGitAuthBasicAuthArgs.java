// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Git source settings for a deployment.
 * 
 */
public final class DeploymentSettingsGitAuthBasicAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentSettingsGitAuthBasicAuthArgs Empty = new DeploymentSettingsGitAuthBasicAuthArgs();

    /**
     * Password for git basic authentication.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Password for git basic authentication.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * User name for git basic authentication.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return User name for git basic authentication.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private DeploymentSettingsGitAuthBasicAuthArgs() {}

    private DeploymentSettingsGitAuthBasicAuthArgs(DeploymentSettingsGitAuthBasicAuthArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentSettingsGitAuthBasicAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentSettingsGitAuthBasicAuthArgs $;

        public Builder() {
            $ = new DeploymentSettingsGitAuthBasicAuthArgs();
        }

        public Builder(DeploymentSettingsGitAuthBasicAuthArgs defaults) {
            $ = new DeploymentSettingsGitAuthBasicAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password Password for git basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for git basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username User name for git basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username User name for git basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public DeploymentSettingsGitAuthBasicAuthArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}