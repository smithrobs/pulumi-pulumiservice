// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.PulumiService
{
    /// <summary>
    /// Deployment settings configure Pulumi Deployments for a stack.
    /// 
    /// ### Import
    /// 
    /// Deployment settings can be imported using the `id`, which for deployment settings is {org}/{project}/{stack} e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import pulumiservice:index:DeploymentSettings my_settings `my-org/my-project/my-stack`
    /// ```
    /// </summary>
    [PulumiServiceResourceType("pulumiservice:index:DeploymentSettings")]
    public partial class DeploymentSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Organization name.
        /// </summary>
        [Output("organization")]
        public Output<string?> Organization { get; private set; } = null!;

        /// <summary>
        /// Project name.
        /// </summary>
        [Output("project")]
        public Output<string?> Project { get; private set; } = null!;

        /// <summary>
        /// Stack name.
        /// </summary>
        [Output("stack")]
        public Output<string?> Stack { get; private set; } = null!;


        /// <summary>
        /// Create a DeploymentSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DeploymentSettings(string name, DeploymentSettingsArgs args, CustomResourceOptions? options = null)
            : base("pulumiservice:index:DeploymentSettings", name, args ?? new DeploymentSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DeploymentSettings(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("pulumiservice:index:DeploymentSettings", name, null, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DeploymentSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DeploymentSettings Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new DeploymentSettings(name, id, options);
        }
    }

    public sealed class DeploymentSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Settings related to the deployment executor.
        /// </summary>
        [Input("executorContext")]
        public Input<Inputs.DeploymentSettingsExecutorContextArgs>? ExecutorContext { get; set; }

        /// <summary>
        /// GitHub settings for the deployment.
        /// </summary>
        [Input("github")]
        public Input<Inputs.DeploymentSettingsGithubArgs>? Github { get; set; }

        /// <summary>
        /// Settings related to the Pulumi operation environment during the deployment.
        /// </summary>
        [Input("operationContext")]
        public Input<Inputs.DeploymentSettingsOperationContextArgs>? OperationContext { get; set; }

        /// <summary>
        /// Organization name.
        /// </summary>
        [Input("organization", required: true)]
        public Input<string> Organization { get; set; } = null!;

        /// <summary>
        /// Project name.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Settings related to the source of the deployment.
        /// </summary>
        [Input("sourceContext", required: true)]
        public Input<Inputs.DeploymentSettingsSourceContextArgs> SourceContext { get; set; } = null!;

        /// <summary>
        /// Stack name.
        /// </summary>
        [Input("stack", required: true)]
        public Input<string> Stack { get; set; } = null!;

        public DeploymentSettingsArgs()
        {
        }
        public static new DeploymentSettingsArgs Empty => new DeploymentSettingsArgs();
    }
}
