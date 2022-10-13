1.(create own package)
helm create deis-workflow ;
helm package deis-workflow ;
helm install deis-workflow ./deis-workflow-0.1.0.tgz ;

2.(adding repos to helm)
hem repo add springboot-helm-app https://github.com/ChaitanyaMM/spring-boot-k8s-helm-application.git ;
helm repo list;

3.helm list ;
  helm ls   ;
  helm ls -all ;


4.helm install springboot-helm-app ;
  helm uninstall springboot-helm-app ;

5.helm rollback [release] [revision] [flag]

   Where:
     [release]: The release name you want to roll back to.
     [revision]: The revision number you want to roll back to.
     [flag]: Optional command flags, such as --dry-run or --force.

  helm rollback springboot-helm-app 1 ;
