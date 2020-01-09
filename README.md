# Inversion Cloud API Engine - Lambda Quick Start Guide

[![](https://travis-ci.org/inversion-api/inversion-quickstart-lambda.svg?branch=master)](https://travis-ci.org/inversion-api/inversion-quickstart-lambda)

Inversion is the fastest way to deliver full featured and secure REST APIs.

See https://github.com/inversion-api/inversion-engine for full documentation.

## Quick Start Instructions

- Have at least Java 8 installed on your system.
- [Use this repo as a template](https://help.github.com/en/github/creating-cloning-and-archiving-repositories/creating-a-repository-from-a-template) or otherwise clone/fork etc.
- Repackage and modify "me.repackage.MyInversionApiGatewayRequestStreamHandler.java" to fit your needs.
- Run 'gradle build'.
- Gradle will produce a build/distributions/${project_folder_name}.zip that you can upload to AWS as your Lambda code archive.
- Identify whaver you renamed "me.repackage.MyInversionApiGatewayRequestStreamHandler".handleRequest as your handler.
- Point an API Gateway proxy endpoint at your Lambda.


Finally, we would love your feedback, bug reports, and best of all PRs!

Thanks & enjoy!
The Inversion team @ [Rocket Partners](http://rocketpartners.io)