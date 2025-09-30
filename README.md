# UserManageAction

쇼핑몰 사용자 행동 분석 플랫폼

## 사전 준비

### 1. JAVA 21 설치
### 2. Postgresql 로컬 설치
- database: usermanagement
- password: {별도 공유}

## 실행 방법
### 패키징 -> JAR 실행
1. 프로젝트 경로에서 `./gradlew clean build` 실행
2. 빌드가 끝나면 `build/libs/{프로젝트명}-{버전}-SNAPSHOT.jar` 파일 실행

** 실행 종료 **<br/>
`cmd : netstat -a -o` 명령어로 8080포트 PID 검색 <br/>
`taskkill {PID}` 실행