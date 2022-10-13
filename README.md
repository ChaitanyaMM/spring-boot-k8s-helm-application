============================
(create own package)
helm create deis-workflow
helm package deis-workflow
helm install deis-workflow ./deis-workflow-0.1.0.tgz
============================================================
 (adding repos to helm)
hem repo add springboot-helm-app https://github.com/ChaitanyaMM/spring-boot-k8s-helm-application.git
helm repo list

helm list 
helm ls
helm ls -all


helm install springboot-helm-app
helm uninstall springboot-helm-app



===========================================================
helm rollback [release] [revision] [flag]

Where:

[release]: The release name you want to roll back to.
[revision]: The revision number you want to roll back to.
[flag]: Optional command flags, such as --dry-run or --force.
helm rollback springboot-helm-app 1
=============================================================
