# spring-boot-k8s-helm-application

1.create spring boot application.
2.write some code /webservice to test.
3.create docker images for the same
4.helm create <give the name u want for the poroject> ex: hello-world
5.check the folder below would be skeleton looks like
    hello-world /
    Chart.yaml
    values.yaml
    templates /
    charts /
    .helmignore

6. Chart.yaml: This is the main file that contains the description of our chart
   values.yaml: this is the file that contains the default values for our chart
   templates: This is the directory where Kubernetes resources are defined as templates
   charts: This is an optional directory that may contain sub-charts
   .helmignore: This is where we can define patterns to ignore when packaging 
    (similar in concept to .gitignore)
7.everything is built in please verify the deployment & service .yaml
8. provide the images name and version details in values.yaml
9. helm lint ./hello-world (give this cmnd),below would be the response looks like if everything goes smooth
   ==> Linting ./hello-world
   1 chart(s) linted, no failures
10.helm template ./hello-world (useful for template to render locally for qucik feedback)
11. verify all the ymls 
12. helm install --name hello-world ./hello-world (to deploy the application),below would the response looks like 
    NAME:   hello-world
    LAST DEPLOYED: Mon Feb 25 15:29:59 2019
    NAMESPACE: default
    STATUS: DEPLOYED
13.helm ls --all (to view the deployed application).
14.helm upgrade hello-world ./hello-world (for any upgrades)
15.helm rollback hello-world 1 (1 is the version which we would like to roll back)
16.helm uninstall hello-world (for deleting/uninstalling the applicaion)
