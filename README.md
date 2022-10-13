# github-actions-practice

1. github repository 생성

```bash
git glone <레포지토리 주소>
git cd <레포지토리명>
## 만약 브랜치 변경하려면 -> git checkout -b <생성할 브랜치 이름>
```

1. spring 파일을 레포지토리에 복제 및 push

```bash
git init
git add .
git commit -m "<커밋 메시지>"

git commit -m "Initi
al Commit Github Actions for GKE"
[main 9d50968] Initial Commit Github Actions for GKE
 58 files changed, 779 insertions(+)
 create mode 100644 HELP.md
 create mode 100644 build.gradle
 create mode 100644 build/classes/java/main/jpa/study/SpringConfig.class
 create mode 100644 build/classes/java/main/jpa/study/StudyApplication.class
 create mode 100644 build/classes/java/main/jpa/study/project1/ApiController.class
 create mode 100644 build/classes/java/main/jpa/study/project1/JpaMemberRepository.class
 create mode 100644 build/classes/java/main/jpa/study/project1/Member.class
 create mode 100644 build/classes/java/main/jpa/study/project1/MemberRepository.class
 create mode 100644 build/classes/java/main/jpa/study/project1/MemberService.class
 create mode 100644 build/classes/java/main/jpa/study/project1/MemberServiceImpl.class
 create mode 100644 build/jib-cache/jib-classpath-file
 create mode 100644 build/jib-cache/jib-main-class-file
 create mode 100644 build/jib-cache/layers/3519da444b957db95137651ea6b81c5c17eb8fa12741e28bcd79a2b30edefca0/80b14830e8e3657bf518780c48e9de6d7560869afac5212dee4367e9e4dbe7f0
 create mode 100644 build/jib-cache/layers/46dcf7b31ae6b7e33dc3292b93c01d64a750fbd234e2598201ff5fa3ff874160/e2f3ee2ed9901ad3e884a3dfe6d8a936ab23918ec454a826fc0fde7f7d7efddd
 create mode 100644 build/jib-cache/layers/4d904d12a12ad023c04f9db23243641a0a8534cb59133167f0765817d2dad750/32df6d48ab0c9bf35972361cec183e074c0d5a9796598a5a781cae7fdba7445c
 create mode 100644 build/jib-cache/layers/755f2fba049cd7cdeac3962d42e1264a7f886d28a3539962bf23d9d0d1a0c7a1/aa43a23cd92479e93e9629eef1941d7b280557db6024e617b141bf54a5208faf
 create mode 100644 build/jib-cache/layers/791d28e5b9b8c499a4e83f84fd966d450c773eb1997af2bba9b2722a43388af3/3ec9a9fc9f080e751f4ad6b011685a9367edf7c67550637e89fecccecffb6c74
 create mode 100644 build/jib-cache/layers/b11079e0ff492dec1af66031ab5a7773283de96a5d741a62b583d9f5abee6927/b22d3e6ed9f3666db585054e741fae934936249ce15da28e511a0fe3ae2599fa
 create mode 100644 build/jib-cache/layers/ec119c20db4efcad5c20e05ab660f5eeb9260335d8b5dc82e6b9fea38a56bedf/863a0545f63fd81fc33cda8743fab0701418d53601f93e8de5d4840474f04f68
 create mode 100644 build/jib-cache/selectors/003f63c86db9f91d477c34b4607e9f57c666eb2cc4691bd236f2bfbee0c0489b
 create mode 100644 build/jib-cache/selectors/584add658834e5cfe8cfac064d4f01bcc0f5af8ed662d2875a315f72f167484f
 create mode 100644 build/jib-cache/selectors/6f4515d75ae718fac3ebf84c96b18ffb392158ab1027b40463b7fc4d37ae9062
 create mode 100644 build/jib-cache/selectors/aec1d602442a88f42bea409f0a0817f2f007725084f7cde9e39de46c8f7a94c9
 create mode 100644 build/jib-cache/selectors/b8af720e96a684d92743e64f3668ef61ffbaafa1d117026180bf2f577112725f
 create mode 100644 build/jib-cache/selectors/cde6aaa3f2a8ad8c11c443835a5933bff1a1dc6c4d4731debc7168e48c015594
 create mode 100644 build/jib-cache/selectors/d28923f337ae3ab6bfbea476b48e338e189722340a6095146f302db51ce32ff3
 create mode 100644 build/jib-image.digest
 create mode 100644 build/jib-image.id
 create mode 100644 build/jib-image.json
 create mode 100644 build/resources/main/application.properties
 create mode 100644 build/tmp/compileJava/previous-compilation-data.bin
 create mode 100644 gradle/wrapper/gradle-wrapper.jar
 create mode 100644 gradle/wrapper/gradle-wrapper.properties
 create mode 100755 gradlew
 create mode 100644 gradlew.bat
 create mode 100644 out/production/classes/jpa/study/SpringConfig.class
 create mode 100644 out/production/classes/jpa/study/StudyApplication.class
 create mode 100644 out/production/classes/jpa/study/project1/ApiController.class
 create mode 100644 out/production/classes/jpa/study/project1/JpaMemberRepository.class
 create mode 100644 out/production/classes/jpa/study/project1/Member.class
 create mode 100644 out/production/classes/jpa/study/project1/MemberRepository.class
 create mode 100644 out/production/classes/jpa/study/project1/MemberService.class
 create mode 100644 out/production/classes/jpa/study/project1/MemberServiceImpl.class
 create mode 100644 out/production/resources/application.properties
 create mode 100644 out/test/classes/jpa/study/StudyApplicationTests.class
 create mode 100644 out/test/classes/jpa/study/project1/MemberServiceImplTest.class
 create mode 100644 settings.gradle
 create mode 100644 src/main/java/jpa/study/SpringConfig.java
 create mode 100644 src/main/java/jpa/study/StudyApplication.java
 create mode 100644 src/main/java/jpa/study/project1/ApiController.java
 create mode 100644 src/main/java/jpa/study/project1/JpaMemberRepository.java
 create mode 100644 src/main/java/jpa/study/project1/Member.java
 create mode 100644 src/main/java/jpa/study/project1/MemberRepository.java
 create mode 100644 src/main/java/jpa/study/project1/MemberService.java
 create mode 100644 src/main/java/jpa/study/project1/MemberServiceImpl.java
 create mode 100644 src/main/resources/application.properties
 create mode 100644 src/test/java/jpa/study/StudyApplicationTests.java
 create mode 100644 src/test/java/jpa/study/project1/MemberServiceImplTest.java
```

```bash
##git push origin <브랜치명>
git push origin main

Enumerating objects: 106, done.
Counting objects: 100% (106/106), done.
Delta compression using up to 8 threads
Compressing objects: 100% (86/86), done.
Writing objects: 100% (105/105), 33.27 MiB | 4.77 MiB/s, done.
Total 105 (delta 10), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (10/10), done.
To https://github.com/xiu0327/github-actions-practice.git
   3ae7a56..9d50968  main -> main
```

3. 클러스터키 생성
    IAM 및 관리자 > 서비스 계정
    작업 > 키관리 > 키 생성
    → 계정당 한번만 생성하면 되기 때문에 키를 잘 보관해두면 됨.

4. Github Actions를 사용하기 위해 GKE key를 등록해줌
    
    레포지토리 > Setting > Actions > New Repository Secret
    
5. 프로젝트 번호 Key 등록
    
    Cloud 개요 > 대시보드 > 프로젝트 ID 복사
    레포지토리 > Setting > Actions > New Repository Secret
    
6. workflow 작성
    - github에서 제공하는 템플릿으로 먼저 셋팅해도 됨
    - 근데 GKE 배포용 workflow면 .. 걍 아래를 바탕으로 조금씩 수정하셈 ^^
    - pull_request: 특정 브랜치에서 테스팅 단계를 완료한 기능을 main(원본 저장소)와 병합 요청
    - pod 생성에 사용될 이미지는 환경변수로 설정하지 않고 걍 yaml에 구체적으로 명시함.
        
        왜냐면 .. jib로 이미지가 push되지 않았기 때문 ..
        
        이유는 모르겠다 ..
        
        아마도 데이터 베이스 때문인 것 같다.
        
        나중에 RDS로 연결한 뒤에 도커 이미지 빌드부분을 추가해야겠다.
        

```bash
name: Build and Deploy to GKE ## Workflow name

on: ## push할 브랜치와 pull_request 등록할 브랜치
  push:
    branches: [ main ]
  pull_request:
    branches: [ main ]
  
env: ## 환경변수 설정. 전역 변수라고 생각하면 됨
  PROJECT_ID: ${{secrets.GKE_PROJECT}}
  GKE_CLUSTER: github-actions-gke ## GKE 클러스터 이름
  GKE_ZONE: asia-south1 ## GKE 클러스터 리전
  DEPLOYMENT_NAME: github-actions-gke ## deployment.yaml에서 설정한 deployment name

jobs:
  setup-build-publish-deploy:
    name: Setup Build Publish Deploy
    runs-on: ubuntu-latest ## 빌드 자동화를 진행할 서버 지정. 대부분 우분투를 사용.

    steps:
    - name: Checkout Repository ## 테스트 및 빌드 단계 이름
      uses: actions/checkout@v2 ## checkout 버전은 다양하나 여기선 딱히 고칠 필요 없음

    - name: Set up JDK 11 ## jib 사용해서 도커 이미지 push 하기 위해 java 환경 세팅
      uses: actions/setup-java@v1
      with:
        java-version: 11
      
    # - name: Build with Gradle
    #   run: ./gradlew jib
		## 데이터베이스 연결 문제로 빌드가 안 되는 것 같음. 나중에 제대로 연결해서 빌드해볼 것.

    - name: Setup Google Cloud CLI ## Google Cloud와 연결
      uses: GoogleCloudPlatform/github-actions/setup-gcloud@0.1.3
      env:
        ACTIONS_ALLOW_UNSECURE_COMMANDS: true
      with:
        service_account_key: ${{secrets.GKE_SA_KEY}} ## json으로 저장했던 key
        project_id: ${{secrets.GKE_PROJECT}} ## secrets 환경 변수에 설정했던 프로젝트 ID

    - name: Set up Kustomize ## Kustomize 설치
      run: |
        curl -o kustomize --location https://github.com/kubernetes-sigs/kustomize/releases/download/v3.1.0/kustomize_3.1.0_linux_amd64
        chmod u+x ./kustomize

    - name: GKE Deploy ## deployment와 service(LoadBalancer) 구축
      run: |
        gcloud container clusters get-credentials $GKE_CLUSTER --zone $GKE_ZONE
        ./kustomize build . | kubectl apply -f -
        kubectl rollout status deployment/$DEPLOYMENT_NAME
        kubectl get services -o wide
```

- `gcloud container clusters get-credentials $GKE_CLUSTER --zone $GKE_ZONE`
    
    → 클러스터 생성하는 명령어
    
    → 기본적으로 4개의 노드가 생성된다.
    
    > 명령어에 지정된 머신 유형, 노드 수, 기타 설정으로 무료 체험 Apigee Hybrid 설치에 적합한 최소 구성 클러스터가 생성됩니다.
    > 

    노드 지정없이 클러스터를 생서하면 무료 버전에 적합한 수만큼 노드가 생성된다고 하니 요금 걱정은 안 해도 될 듯하다.

    ```bash
    gcloud container clusters create cluster-name \
    --machine-type "n1-standard-4" --num-nodes "3" --enable-autoscaling --min-nodes "3" --max-nodes "6"
    ```

    노드 개수를 지정하고 싶으면 위와 같이 `--num-nodes` 로 지정할 수 있다.
    
    
 - `./kustomize build . | kubectl apply -f -`
    
    → yaml 파일로 작성한 deployment와 service 리소스를 생성하는 단계. kustomization으로 리소스를 생성하면 굳이 kubectl apply -f <yaml_파일명>을 손수 쳐주지 않아도 된다. 
    
    ```bash
    apiVersion: kustomize.config.k8s.io/v1beta1
    kind: Kustomization
    
    resources:
      - deployment.yaml
      - service.yaml
    ```
    
- `kubectl rollout status deployment/$DEPLOYMENT_NAME, kubectl get services -o wide`
    
    → 이건 deploy와 service가 잘 생성되었는지 출력해보기 위함이다. rollout은 왜 했는지 좀 찾아봐야겠다. 단순 확인하는 용도라면 `kubectl get deploy`만 해도 되지 않을까.. 싶긴하다.
    

```bash
~ (gitjub-actions-gke)$ kubectl get po,rs,deploy,service

NAME                                      READY   STATUS    RESTARTS   AGE
pod/github-actions-gke-7565497555-8pmqj   1/1     Running   0          6m33s
pod/github-actions-gke-7565497555-xsz6j   1/1     Running   0          6m33s

NAME                                            DESIRED   CURRENT   READY   AGE
replicaset.apps/github-actions-gke-7565497555   2         2         2       6m34s

NAME                                 READY   UP-TO-DATE   AVAILABLE   AGE
deployment.apps/github-actions-gke   2/2     2            2           6m34s

NAME                     TYPE           CLUSTER-IP    EXTERNAL-IP      PORT(S)          AGE
service/kubernetes       ClusterIP      10.26.0.1     <none>           443/TCP          140m
service/spring-service   LoadBalancer   10.26.0.188   <외부IP>   8080:31928/TCP   6m37s
```

## 앞으로 보완해야할 사항

1. Ingress로 포트번호 감추기
2. RDS 연결해서 배포해보기
3. LoadBalancer 공부가 좀 더 필요할 것 같다
    - 엔드 포인트로 접속하니까 api가 안 뜨더라 ..
    - EXTERNAL-IP로 접속해야하는데, 외부 IP는 .. 고정된 IP인가..? 조금 더 알아봐야겠다 ..
    

아무튼 실습 끝 .
