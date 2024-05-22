// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.pulumiservice.outputs.AWSOIDCConfiguration;
import com.pulumi.pulumiservice.outputs.AzureOIDCConfiguration;
import com.pulumi.pulumiservice.outputs.GCPOIDCConfiguration;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OperationContextOIDC {
    /**
     * @return AWS-specific OIDC configuration.
     * 
     */
    private @Nullable AWSOIDCConfiguration aws;
    /**
     * @return Azure-specific OIDC configuration.
     * 
     */
    private @Nullable AzureOIDCConfiguration azure;
    /**
     * @return GCP-specific OIDC configuration.
     * 
     */
    private @Nullable GCPOIDCConfiguration gcp;

    private OperationContextOIDC() {}
    /**
     * @return AWS-specific OIDC configuration.
     * 
     */
    public Optional<AWSOIDCConfiguration> aws() {
        return Optional.ofNullable(this.aws);
    }
    /**
     * @return Azure-specific OIDC configuration.
     * 
     */
    public Optional<AzureOIDCConfiguration> azure() {
        return Optional.ofNullable(this.azure);
    }
    /**
     * @return GCP-specific OIDC configuration.
     * 
     */
    public Optional<GCPOIDCConfiguration> gcp() {
        return Optional.ofNullable(this.gcp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationContextOIDC defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AWSOIDCConfiguration aws;
        private @Nullable AzureOIDCConfiguration azure;
        private @Nullable GCPOIDCConfiguration gcp;
        public Builder() {}
        public Builder(OperationContextOIDC defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
    	      this.azure = defaults.azure;
    	      this.gcp = defaults.gcp;
        }

        @CustomType.Setter
        public Builder aws(@Nullable AWSOIDCConfiguration aws) {

            this.aws = aws;
            return this;
        }
        @CustomType.Setter
        public Builder azure(@Nullable AzureOIDCConfiguration azure) {

            this.azure = azure;
            return this;
        }
        @CustomType.Setter
        public Builder gcp(@Nullable GCPOIDCConfiguration gcp) {

            this.gcp = gcp;
            return this;
        }
        public OperationContextOIDC build() {
            final var _resultValue = new OperationContextOIDC();
            _resultValue.aws = aws;
            _resultValue.azure = azure;
            _resultValue.gcp = gcp;
            return _resultValue;
        }
    }
}