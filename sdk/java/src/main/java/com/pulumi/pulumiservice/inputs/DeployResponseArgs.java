// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.pulumiservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class DeployResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeployResponseArgs Empty = new DeployResponseArgs();

    @Import(name="consoleUrl", required=true)
    private Output<String> consoleUrl;

    public Output<String> consoleUrl() {
        return this.consoleUrl;
    }

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    @Import(name="status", required=true)
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    @Import(name="version", required=true)
    private Output<Double> version;

    public Output<Double> version() {
        return this.version;
    }

    private DeployResponseArgs() {}

    private DeployResponseArgs(DeployResponseArgs $) {
        this.consoleUrl = $.consoleUrl;
        this.id = $.id;
        this.status = $.status;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeployResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeployResponseArgs $;

        public Builder() {
            $ = new DeployResponseArgs();
        }

        public Builder(DeployResponseArgs defaults) {
            $ = new DeployResponseArgs(Objects.requireNonNull(defaults));
        }

        public Builder consoleUrl(Output<String> consoleUrl) {
            $.consoleUrl = consoleUrl;
            return this;
        }

        public Builder consoleUrl(String consoleUrl) {
            return consoleUrl(Output.of(consoleUrl));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder version(Output<Double> version) {
            $.version = version;
            return this;
        }

        public Builder version(Double version) {
            return version(Output.of(version));
        }

        public DeployResponseArgs build() {
            $.consoleUrl = Objects.requireNonNull($.consoleUrl, "expected parameter 'consoleUrl' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
