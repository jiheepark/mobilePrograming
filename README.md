# **mobile programing project1**

v.1.1.3
-------------
### "소프트에어학부 20162772 박지희"
#### 0. 지원 아키텍쳐 추가
기존에 arm, arm-v7만 지원하던 점을 개선하여 모든 아키텍쳐에 호환되도록 수정하였습니다.

v.1.1.0
-------------
#### 1. [테스트 환경]

1. 안드로이드 스튜디오 SDK (Tools -> SDK Manager로 확인)
   - SDK 플랫폼 : Android 10.0(Q), 9.0(Pie), 8.1(Oreo)
   - Android SDK Build-Tools : 29.0.2, 28.0.3, 28.0.2
   - Android Emulator
   - Android SDK Platform-Tools
   - Android SDK Tools
   - Google Play services
   - Intel x86 Emulator Accelerator (HXAM Installer)
2. JDK-10.0.2 (명령어창(cmd)에서 c:\ java -version으로 확인)
   java version "10.0.2" 2018-07-17
   Java(TM) SE Runtime Environment 18.3 (build 10.0.2+13)
   Java HotSpot(TM) 64-Bit Server VM 18.3 (build 10.0.2+13, mixed mode)
3. 안드로이드 스튜디오 실행 환경
   - Windows 10 Home, 64비트 운영체제(x64 기반 프로세서)


#### 2. 끝점 추출(Endpoint detection) 방식 추가
기존에는 발성을 멈추면 자동으로 인식 결과를 반환해주었습니다. 이는 발성의 끝점 추출(Endpoint detection)을 서버에서 자동으로 수행하는 방식입니다. 이번 업데이트에서는, 끝점 추출 동작에 대해 두 가지 방식을 새롭게 추가했습니다. 아래는 기존 방식을 포함한 세 가지 방식에 대한 설명이며, 자세한 사용 방법은 [Android 예제코드](https://github.com/naver/naverspeech-sdk-android) 또는 [iOS 예제코드](https://github.com/naver/naverspeech-sdk-ios)를 참고하시기 바랍니다.
  * Auto : 기존과 같은 방식입니다. 발성을 멈추면, 자동으로 인식 결과를 반환해줍니다.
  * Manual : 발성의 끝점을 사용자가 명시적으로 알립니다. 따라서 발성을 잠시 멈추어도 인식이 끝나지 않습니다. 이 방식을 이용하여 무전기의 push-to-talk과 유사한 동작을 구현할 수 있습니다.
  * Hybrid : 위의 Auto와 Manual 중 어떤 방식을 선택할 것인지는 빌드 타임에, 즉 코드상에서 개발자가 값을 넣어줌으로써 결정됩니다. 하지만 Hybrid 방식을 선택하면 이를 런타임에 결정할 수 있습니다. 가령, 버튼을 짧게 클릭하면 Auto 방식으로, 길게 누른 상태에서 발성하면 Manual 방식으로 다이나믹하게 결정하도록 구현할 수 있습니다.

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
