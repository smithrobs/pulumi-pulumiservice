// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.PulumiService.Outputs
{

    [OutputType]
    public sealed class OperationContextOptions
    {
        /// <summary>
        /// Whether the stack should be deleted after it is destroyed.
        /// </summary>
        public readonly bool? DeleteAfterDestroy;
        /// <summary>
        /// The shell to use to run commands during the deployment. Defaults to 'bash'.
        /// </summary>
        public readonly string? Shell;
        /// <summary>
        /// Skip the default dependency installation step - use this to customize the dependency installation (e.g. if using yarn or poetry)
        /// </summary>
        public readonly bool? SkipInstallDependencies;
        /// <summary>
        /// Skip intermediate deployments (Consolidate multiple deployments of the same type into one deployment)
        /// </summary>
        public readonly bool? SkipIntermediateDeployments;

        [OutputConstructor]
        private OperationContextOptions(
            bool? deleteAfterDestroy,

            string? shell,

            bool? skipInstallDependencies,

            bool? skipIntermediateDeployments)
        {
            DeleteAfterDestroy = deleteAfterDestroy;
            Shell = shell;
            SkipInstallDependencies = skipInstallDependencies;
            SkipIntermediateDeployments = skipIntermediateDeployments;
        }
    }
}