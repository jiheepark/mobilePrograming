# **mobile programing project1**

개발자 
-------------
#### " 20162772 박지희"
#### 소프트웨어학부

회원가입페이지(JoinActivity.class, layout_join.xml)<로그인화면으로 가기> 버튼 -> 테스트 버튼 
-------------


회원가입 페이지에 <로그인화면으로 가기>  버튼이 있는데 이것은 파일 입출력에서 회원가입이 잘 되었는지 확인하는 버튼입니다.
회원가입 페이지에서 아이디를 입력하면 해당 아이디.txt의 파일을 toast로 보여줍니다. 

만약 로그인화면으로 돌아가게 구현하고 싶다면
before코드를 after코드로 수정하면 됩니다. 

#### before
'''

        Button joinText =(Button) findViewById(R.id.beforeButton);

        joinText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try{
                    BufferedReader br = new BufferedReader(new FileReader(getFilesDir()+(editID.getText()+".txt")));
                    String readStr = "";
                    String str = null;
                    while(((str = br.readLine()) != null)){
                        readStr += str +"\n";
                    }
                    br.close();

                    Toast.makeText(getApplicationContext(), readStr.substring(0, readStr.length()-1), Toast.LENGTH_SHORT).show();

                }catch (FileNotFoundException e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "File not Found", Toast.LENGTH_SHORT).show();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
'''

#### after
'''

        Button joinText =(Button) findViewById(R.id.beforeButton);

        joinText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                 Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                  startActivity(intent);
            }

        });
'''

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

코드 설명
-------------
**1.** MainActivity.java  - 두번째 페이지(회원가입 화면) 회원가입 함수 
```
  //버튼 정의 및 xml 연결
  Button writeButton = (Button)findViewById(R.id.joinButton);
  
  writeButton.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View v){
         if(!idCheckBox.isChecked()){
               //아이디 중복검사가 안되어 있는 경우(idcheckbox 체크가 풀려 있는 경우) 알림 토스트 띄우기
              Toast.makeText(getApplicationContext(), "아이디 중복검사를 해주세요.", Toast.LENGTH_SHORT).show();
          } 
          if(!passwordCheckBox.isChecked()){
             //비밀번호가 조건에 안맞는 경우(passwordcheckbox 체크가 풀려있는 경우) 알림 토스트 띄우기
              Toast.makeText(getApplicationContext(), "비밀번호 조건을 확인해주세요.", Toast.LENGTH_SHORT).show();
          }
          else if(editID.getText().length()==0 || editPassword.getText().length()==0 || editCallNumber.getText().length()==0 ||
              //아이디 중복검사가 안되어 있는 경우(checkbox가 꺼져 있는 경우, 아이디 중복검사를 요구)
              editName.getText().length()==0 || editAddress.getText().length()==0){
              Toast.makeText(getApplicationContext(), "모든 정보를 입력해주세요.", Toast.LENGTH_SHORT).show();
          }
         else if(!radioButton1.isChecked()){
               //개인정보 약관에 동의가 안되어 있는 경우
              Toast.makeText(getApplicationContext(), "개인정보약관에 동의해주세요.", Toast.LENGTH_SHORT).show();
          }
          else {
              try {
                  //만약 모두 완료했다면, 입력된 아이디 값으로 파일생성 후 데이터 저장
                  String idText = editID.getText() + ".txt";
                  BufferedWriter bw = new BufferedWriter(new FileWriter(getFilesDir() + idText, false));
                  bw.write(editPassword.getText() + "");
                  bw.close();
                  Toast.makeText(getApplicationContext(), editID.getText() + "님 환영합니다.", Toast.LENGTH_LONG).show();
                  Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                  startActivity(intent);
              } catch (Exception e) {
                  e.printStackTrace();
                  Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
              }
          }

      }

  });
```
**2.** MainActivity.java  - 첫번째 페이지(로그인화면) 로그인 함수 
```
  loginButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                try{
                    BufferedReader br = new BufferedReader(new FileReader(getFilesDir()+(inputID.getText()+".txt")));
                    //입력된 아이디의 값과 일치하는 파일을 오픈한다. 
                    String readStr = "";
                    String str = null;
                    while(((str = br.readLine()) != null)){
                        readStr += str +"\n";
                    }
                    br.close();

                    if(readStr.substring(0, readStr.length()-1).equals(inputPW.getText()+"")){
                        //읽은 파일에 적힌 데이터와 비밀번호가 일치하면 다음화면(HomeActivity)로 넘어간다.  
                        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                        startActivity(intent);
                    }
                    else
                    {
                         //비밀번호가 다르면 toast로 알린다.
                        Toast.makeText(getApplicationContext(), "비밀번호가 틀렸습니다.", Toast.LENGTH_SHORT).show();
                    }
                }catch (FileNotFoundException e){
                    //같은 이름의 파일을 찾지 못한다면 toast로 알린다.
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "아이디를 찾을 수 없습니다.", Toast.LENGTH_SHORT).show();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

```
**2.** JoinActivity.java  - 두번째 페이지(회원가입화면) 아이디중복검사 함수와 비밀번호 조건확인 함수 


## 비밀번호 조건확인 함수 
```
editPassword.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // 입력되는 텍스트에 변화가 있을 때
                String password = editPassword.getText()+"";
                //비밀번호 유효성 검사식1 : 숫자와 특수문자가 포함되어야 한다.
                String val_symbol = "([0-9].*[!,@,#,^,&,*,(,)])|([!,@,#,^,&,*,(,)].*[0-9])";
                // 비밀번호 유효성 검사식2 : 영문자 대소문자가 적어도 하나씩은 포함되어야 한다.
                String val_alpha = "([a-z].*[A-Z])|([A-Z].*[a-z])";
                // 정규표현식 컴파일
                Pattern pattern_symbol = Pattern.compile(val_symbol);
                Pattern pattern_alpha = Pattern.compile(val_alpha);

                Matcher matcher_symbol = pattern_symbol.matcher(password);
                Matcher matcher_alpha = pattern_alpha.matcher(password);

                if (matcher_symbol.find() && matcher_alpha.find() && password.length()>=8) {
                    // email과 password로 회원가입 진행
                    passwordCheckBox.setChecked(true);
                }else {
                    passwordCheckBox.setChecked(false);
                }
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                // 입력이 끝났을 때
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 입력하기 전에
            }
        });
```
