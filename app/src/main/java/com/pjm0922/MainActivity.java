package com.pjm0922;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nm;
    EditText kor;
    EditText math;
    EditText eng;
    Button bt;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        nm = (EditText) findViewById(R.id.Edit1);
        kor = (EditText) findViewById(R.id.Edit2);
        math = (EditText) findViewById(R.id.Edit3);
        eng = (EditText) findViewById(R.id.Edit4);
        bt = (Button) findViewById(R.id.button1);
        TextView result11 = findViewById(R.id.result1);
        TextView result22 = findViewById(R.id.result2);
        TextView result33 = findViewById(R.id.result3);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm1 = nm.getText().toString();
                String kor1 = kor.getText().toString();
                String math1 = math.getText().toString();
                String eng1 = eng.getText().toString();

                if (nm1.equals("") || kor1.equals("") || math1.equals("") || eng1.equals("")) {
                    Toast.makeText(MainActivity.this, "내용을 입력해주세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    int kor2 = Integer.parseInt(kor1);
                    int math2 = Integer.parseInt(math1);
                    int eng2 = Integer.parseInt(eng1);

                    String result1 = "";
                    String result2 = "";
                    String result3 = "";

                if (kor2 >= 90) {
                    result1 = "국어 학점: A";
                    result11.setText(result1);
                    } else if (kor2 < 90 && kor2 >= 80) {
                        result1 = "국어 학점: B";
                        result11.setText(result1);
                    } else if (kor2 < 80 && kor2 >= 70) {
                        result1 = "국어 학점: C";
                        result11.setText(result1);
                    } else if (kor2 < 70 && kor2 >= 60) {
                        result1 = "국어 학점: D";
                        result11.setText(result1);
                    } else if (kor2 < 60) {
                        result1 = "국어 학점: F";
                        result11.setText(result1);
                    }


                    if (math2 >= 90) {
                        result2 = "수학 학점: A";
                        result22.setText(result2);
                    } else if (math2 < 90 && math2 >= 80) {
                        result2 = "수학 학점: B";
                        result22.setText(result2);
                    } else if (math2 < 80 && math2 >= 70) {
                        result2 = "수학 학점: C";
                        result22.setText(result2);
                    } else if (math2 < 70 && math2 >= 60) {
                        result2 = "수학 학점: D";
                        result22.setText(result2);
                    } else if (math2 < 60) {
                        result2 = "수학 학점: F";
                        result22.setText(result2);
                    }


                    if (eng2 >= 90) {
                        result3 = "영어 학점: A";
                        result33.setText(result3);
                    } else if (eng2 < 90 && eng2 >= 80) {
                        result3 = "영어 학점: B";
                        result33.setText(result3);
                    } else if (eng2 < 80 && eng2 >= 70) {
                        result3 = "영어 학점: C";
                        result33.setText(result3);
                    } else if (eng2 < 70 && eng2 >= 60) {
                        result3 = "영어 학점: D";
                        result33.setText(result3);
                    } else if (eng2 < 60) {
                        result3 = "영어 학점: F";
                        result33.setText(result3);
                    }

                    if (kor2 >= 80 && math2 >= 80 && eng2 >= 80) {
                        Toast.makeText(getApplicationContext(), nm1 + "님\n" + "잘하셨습니다", Toast.LENGTH_LONG).show();
                    }
                    else if (kor2 < 60 || math2 < 60 || eng2 < 60) {
                        Toast.makeText(getApplicationContext(), nm1 + "님\n" + "좀더 노력하세요\n" + "F과목은 더 노력하세요", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), nm1 + "님\n" + "좀더 노력하세요", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}