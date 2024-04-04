// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pulumiservice

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-pulumiservice/sdk/go/pulumiservice/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Access tokens allow a user to authenticate against the Pulumi Cloud
type AccessToken struct {
	pulumi.CustomResourceState

	// Description of the access token.
	Description pulumi.StringOutput `pulumi:"description"`
	// The token identifier.
	TokenId pulumi.StringOutput `pulumi:"tokenId"`
	// The token's value.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewAccessToken registers a new resource with the given unique name, arguments, and options.
func NewAccessToken(ctx *pulumi.Context,
	name string, args *AccessTokenArgs, opts ...pulumi.ResourceOption) (*AccessToken, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"value",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessToken
	err := ctx.RegisterResource("pulumiservice:index:AccessToken", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessToken gets an existing AccessToken resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessToken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessTokenState, opts ...pulumi.ResourceOption) (*AccessToken, error) {
	var resource AccessToken
	err := ctx.ReadResource("pulumiservice:index:AccessToken", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessToken resources.
type accessTokenState struct {
}

type AccessTokenState struct {
}

func (AccessTokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessTokenState)(nil)).Elem()
}

type accessTokenArgs struct {
	// Description of the access token.
	Description string `pulumi:"description"`
}

// The set of arguments for constructing a AccessToken resource.
type AccessTokenArgs struct {
	// Description of the access token.
	Description pulumi.StringInput
}

func (AccessTokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessTokenArgs)(nil)).Elem()
}

type AccessTokenInput interface {
	pulumi.Input

	ToAccessTokenOutput() AccessTokenOutput
	ToAccessTokenOutputWithContext(ctx context.Context) AccessTokenOutput
}

func (*AccessToken) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessToken)(nil)).Elem()
}

func (i *AccessToken) ToAccessTokenOutput() AccessTokenOutput {
	return i.ToAccessTokenOutputWithContext(context.Background())
}

func (i *AccessToken) ToAccessTokenOutputWithContext(ctx context.Context) AccessTokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessTokenOutput)
}

// AccessTokenArrayInput is an input type that accepts AccessTokenArray and AccessTokenArrayOutput values.
// You can construct a concrete instance of `AccessTokenArrayInput` via:
//
//	AccessTokenArray{ AccessTokenArgs{...} }
type AccessTokenArrayInput interface {
	pulumi.Input

	ToAccessTokenArrayOutput() AccessTokenArrayOutput
	ToAccessTokenArrayOutputWithContext(context.Context) AccessTokenArrayOutput
}

type AccessTokenArray []AccessTokenInput

func (AccessTokenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessToken)(nil)).Elem()
}

func (i AccessTokenArray) ToAccessTokenArrayOutput() AccessTokenArrayOutput {
	return i.ToAccessTokenArrayOutputWithContext(context.Background())
}

func (i AccessTokenArray) ToAccessTokenArrayOutputWithContext(ctx context.Context) AccessTokenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessTokenArrayOutput)
}

// AccessTokenMapInput is an input type that accepts AccessTokenMap and AccessTokenMapOutput values.
// You can construct a concrete instance of `AccessTokenMapInput` via:
//
//	AccessTokenMap{ "key": AccessTokenArgs{...} }
type AccessTokenMapInput interface {
	pulumi.Input

	ToAccessTokenMapOutput() AccessTokenMapOutput
	ToAccessTokenMapOutputWithContext(context.Context) AccessTokenMapOutput
}

type AccessTokenMap map[string]AccessTokenInput

func (AccessTokenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessToken)(nil)).Elem()
}

func (i AccessTokenMap) ToAccessTokenMapOutput() AccessTokenMapOutput {
	return i.ToAccessTokenMapOutputWithContext(context.Background())
}

func (i AccessTokenMap) ToAccessTokenMapOutputWithContext(ctx context.Context) AccessTokenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessTokenMapOutput)
}

type AccessTokenOutput struct{ *pulumi.OutputState }

func (AccessTokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessToken)(nil)).Elem()
}

func (o AccessTokenOutput) ToAccessTokenOutput() AccessTokenOutput {
	return o
}

func (o AccessTokenOutput) ToAccessTokenOutputWithContext(ctx context.Context) AccessTokenOutput {
	return o
}

// Description of the access token.
func (o AccessTokenOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessToken) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The token identifier.
func (o AccessTokenOutput) TokenId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessToken) pulumi.StringOutput { return v.TokenId }).(pulumi.StringOutput)
}

// The token's value.
func (o AccessTokenOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessToken) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

type AccessTokenArrayOutput struct{ *pulumi.OutputState }

func (AccessTokenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessToken)(nil)).Elem()
}

func (o AccessTokenArrayOutput) ToAccessTokenArrayOutput() AccessTokenArrayOutput {
	return o
}

func (o AccessTokenArrayOutput) ToAccessTokenArrayOutputWithContext(ctx context.Context) AccessTokenArrayOutput {
	return o
}

func (o AccessTokenArrayOutput) Index(i pulumi.IntInput) AccessTokenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessToken {
		return vs[0].([]*AccessToken)[vs[1].(int)]
	}).(AccessTokenOutput)
}

type AccessTokenMapOutput struct{ *pulumi.OutputState }

func (AccessTokenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessToken)(nil)).Elem()
}

func (o AccessTokenMapOutput) ToAccessTokenMapOutput() AccessTokenMapOutput {
	return o
}

func (o AccessTokenMapOutput) ToAccessTokenMapOutputWithContext(ctx context.Context) AccessTokenMapOutput {
	return o
}

func (o AccessTokenMapOutput) MapIndex(k pulumi.StringInput) AccessTokenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessToken {
		return vs[0].(map[string]*AccessToken)[vs[1].(string)]
	}).(AccessTokenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessTokenInput)(nil)).Elem(), &AccessToken{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessTokenArrayInput)(nil)).Elem(), AccessTokenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessTokenMapInput)(nil)).Elem(), AccessTokenMap{})
	pulumi.RegisterOutputType(AccessTokenOutput{})
	pulumi.RegisterOutputType(AccessTokenArrayOutput{})
	pulumi.RegisterOutputType(AccessTokenMapOutput{})
}
