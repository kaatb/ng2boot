## Introduction
This repo serves as a walking skeleton for a single gradle project containing a frontend with its backend. Just so you can get kickstarted in setting up a similar project, and don't have to mess about too much.

It contains a [jenkinsfile](ohana.jenkinsfile) so you can create a Jenkins 2 pipeline job to get CI running.

This will build both UI and backend projects and package test run results from both JUnit and Karma.

## Deliverables
On successful build, you'll have one ohana-0.0.1-SNAPSHOT.ear file, containing an ohana-rest.war and an ohana-ui.war.

It's safely deployable to a WildFly application server, because of the `jboss-deployment-structure`'s exclusions in the main projects [build.gradle](build.gradle).

## Stack
### UI
The UI is an Angular 2 SPA, initially generated with Angular-CLI.

### Backend
The backend is SpringBoot 1.4.2, using Jersey instead of Spring-MVC, AssertJ for improved assertions, Mockito as mock framework and component based packaging.

## Database provisioning (and batteries) not included
This project was lazily scaffolded from a project that had an Oracle XE locally installed on dev machines and Jenkins. I'm gonna assume that you're wise enough to provision your own database using docker or also locally install your required database everywhere you need.


## Stuff you'll need to change
Change or remove nexus credentials in [ohana-rest/gradle.properties](ohana-rest/gradle.properties). These are used in [ohana-rest/build.gradle](ohana-rest/build.gradle).

Change or remove `your-nexusurl.com` in [ohana-rest/build.gradle](ohana-rest/build.gradle).

Change the jenkins credentials (*github_jenkins_key*) to access your github repository in [ohana.jenkinsfile](ohana.jenkinsfile).

Add/uncomment and change the jdbc driver in [ohana-rest/build.gradle](ohana-rest/build.gradle).

