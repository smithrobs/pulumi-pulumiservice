# coding=utf-8
# *** WARNING: this file was generated by pulumigen. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .access_token import *
from .provider import *
from .team import *
from .webhook import *

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_pulumi_service.config as __config
    config = __config
else:
    config = _utilities.lazy_import('pulumi_pulumi_service.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "pulumi-service",
  "mod": "index",
  "fqn": "pulumi_pulumi_service",
  "classes": {
   "pulumi-service:index:AccessToken": "AccessToken",
   "pulumi-service:index:Team": "Team",
   "pulumi-service:index:Webhook": "Webhook"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "pulumi-service",
  "token": "pulumi:providers:pulumi-service",
  "fqn": "pulumi_pulumi_service",
  "class": "Provider"
 }
]
"""
)