// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.PulumiService.Inputs
{

    public sealed class DeployResponse : global::Pulumi.InvokeArgs
    {
        [Input("consoleUrl", required: true)]
        public string ConsoleUrl { get; set; } = null!;

        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        [Input("status", required: true)]
        public string Status { get; set; } = null!;

        [Input("version", required: true)]
        public double Version { get; set; }

        public DeployResponse()
        {
        }
        public static new DeployResponse Empty => new DeployResponse();
    }
}
