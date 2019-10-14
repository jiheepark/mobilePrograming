# **mobile programing project1**

개발자 
-------------
#### " 20162772 박지희"
#### 소프트웨어학부

테스트환경
-------------
#### 1. 안드로이드 스튜디오 SDK (Tools -> SDK Manager로 확인)
   - SDK 플랫폼 : Android 10.0(Q), 9.0(Pie), 8.1(Oreo)
   - Android SDK Build-Tools : 29.0.2, 28.0.3, 28.0.2
   - Android Emulator
   - Android SDK Platform-Tools
   - Android SDK Tools
   - Google Play services
   - Intel x86 Emulator Accelerator (HXAM Installer)

#### 2. JDK-10.0.2 (명령어창(cmd)에서 c:\ java -version으로 확인)
   java version "10.0.2" 2018-07-17
   Java(TM) SE Runtime Environment 18.3 (build 10.0.2+13)
   Java HotSpot(TM) 64-Bit Server VM 18.3 (build 10.0.2+13, mixed mode)

#### 3. 안드로이드 스튜디오 실행 환경
   - Windows 10 Home, 64비트 운영체제(x64 기반 프로세서)


Usage
-------------
**1.** app/build.gradle 파일에 아래 구문을 추가해주세요.
```
  repositories {
    jcenter()
  }
  dependencies {
    compile 'com.naver.speech.clientapi:naverspeech-sdk-android:1.1.3'
  }
```
License
==

See [LICENSE](LICENSE) for full license text.

Copyright 2016 Naver Corp.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
