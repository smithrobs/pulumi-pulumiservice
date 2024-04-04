// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Agent Pool for customer manager deployments
 */
export class AgentPool extends pulumi.CustomResource {
    /**
     * Get an existing AgentPool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, opts?: pulumi.CustomResourceOptions): AgentPool {
        return new AgentPool(name, undefined as any, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pulumiservice:index:AgentPool';

    /**
     * Returns true if the given object is an instance of AgentPool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AgentPool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AgentPool.__pulumiType;
    }

    /**
     * The agent pool identifier.
     */
    public /*out*/ readonly agentPoolId!: pulumi.Output<string>;
    /**
     * Description of the agent pool.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the agent pool.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The organization's name.
     */
    public readonly organizationName!: pulumi.Output<string>;
    /**
     * The agent pool's token's value.
     */
    public /*out*/ readonly tokenValue!: pulumi.Output<string>;

    /**
     * Create a AgentPool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AgentPoolArgs, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (!opts.id) {
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.organizationName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationName'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["organizationName"] = args ? args.organizationName : undefined;
            resourceInputs["agentPoolId"] = undefined /*out*/;
            resourceInputs["tokenValue"] = undefined /*out*/;
        } else {
            resourceInputs["agentPoolId"] = undefined /*out*/;
            resourceInputs["description"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["organizationName"] = undefined /*out*/;
            resourceInputs["tokenValue"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["tokenValue"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(AgentPool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a AgentPool resource.
 */
export interface AgentPoolArgs {
    /**
     * Description of the agent pool.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the agent pool.
     */
    name: pulumi.Input<string>;
    /**
     * The organization's name.
     */
    organizationName: pulumi.Input<string>;
}