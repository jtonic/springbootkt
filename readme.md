The goal of this project is to use it as the playground for testing the fix:
KT-14478 Add APT / KAPT support to the maven plugin

- I tried to use either a kotlin or java @ConfigurationProperties class (ServerProperties) and the outcome was the same 
NoSuchBeanDefinitionException: No qualifying bean of type 'jtonic.tmp.springbootkt.ServerProperties' available: expected at least 1 bean which qualifies as autowire candidate.

I suppose I didn't configured properly the KAPT kotlin plugin.
