# Chaeking (Web)

Chaeking Website with Spring Boot 2

<a href="https://www.chaeking.com" target="_blank">Go To Site - Chaeking</a>

<p>
    <img src="https://img.shields.io/static/v1?label=OpenJDK&message=17.0.2&color=007396&logo=java" alt="OpenJDK 17.0.2">
    <img src="https://img.shields.io/static/v1?label=Spring%20Boot&message=2.7.1&color=6DB33F&logo=springboot&logoColor=fff" alt="Spring Boot 2.7.1">
    <img src="https://img.shields.io/static/v1?label=Thymeleaf&message=3.0.15.RELEASE&color=005F0F&logo=Thymeleaf&logoColor=fff" alt="Thymeleaf 3.0.15.RELEASE">
    <img src="https://img.shields.io/static/v1?label=Bootstrap&message=5.1.3&color=7952B3&logo=Bootstrap&logoColor=fff" alt="Bootstrap 5.1.3">
    <img src="https://img.shields.io/static/v1?label=Apache%20Maven&message=3.10.1&color=C71A36&logo=ApacheMaven" alt="Apache Maven 3.10.1">
</p>

***

## Tech Stacks

- JDK 17
- Spring Boot 2
- HTML 5
- CSS 3
- Vanilla Javascript
- View Template
  - Thymeleaf
  - Thymeleaf Page Layouts
- BootStrap 5
- CSS pre-processor
  - SCSS
- HTTP Client Library
  - Axios

***

## 참고사항

### 1. SCSS to CSS 실시간 transpiling

sass 명령어를 이용하여 SCSS 파일을 CSS로 트랜스 파일링합니다. ( **ruby 설치 필수** )

사용중인 OS가  ruby가 설치되어있지 않다면 먼저 ruby를 설치합니다. 

Mac OS, Linux의 경우 기본적으로 Ruby가 설치되어있어 별도로 ruby를 설치하지 않아도 됩니다.

Windows OS를 사용중이라면 아래의 링크에 들어가 ruby를 설치하면 됩니다.
> [RubyInstaller for Windows](https://rubyinstaller.org/) 

<br>

루비젬 명령어로 sass 를 설치합니다.
```shell
gem install sass
```
<br>

basic.scss 파일을 basic.css 파일로 트랜스파일링합니다.
만일 현재 UI를 수정중이라 SCSS 수정사항을 실시간으로 반영하고 싶다면 `--watch` 옵션을 사용하면 됩니다.

```shell
sass --watch src/main/resources/static/css/basic.scss:src/main/resources/static/css/basic.css
```

