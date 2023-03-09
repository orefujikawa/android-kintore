package com.example.kintore;

import android.content.Context;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    List<String> hairetu = new ArrayList<String>();
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.btn1);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.pop);
        builder.setMessage(R.string.pop1);
        AlertDialog dialog = builder.create();

        Button buttono = findViewById(R.id.btno);
        Button buttono1 = findViewById(R.id.btno1);
        Button buttono2 = findViewById(R.id.btno2);
        Button buttono3 = findViewById(R.id.btno3);
        Button buttono4 = findViewById(R.id.btno4);
        Button buttono5 = findViewById(R.id.btno5);
        Button buttono6 = findViewById(R.id.btno6);
        Button buttono7 = findViewById(R.id.btno7);
        Button buttono8 = findViewById(R.id.btno8);
        Button buttono9 = findViewById(R.id.btno9);

        TextView texta = findViewById(R.id.text1);
        TextView textb = findViewById(R.id.text2);
        TextView textc = findViewById(R.id.text3);
        TextView textd = findViewById(R.id.text4);
        TextView texte = findViewById(R.id.text5);
        TextView textf = findViewById(R.id.text6);
        TextView textg = findViewById(R.id.text7);
        TextView texth = findViewById(R.id.text8);
        TextView texti = findViewById(R.id.text9);
        TextView textj = findViewById(R.id.text10);

        TextView texta1 = findViewById(R.id.text11);
        TextView texta2 = findViewById(R.id.text12);
        TextView texta3 = findViewById(R.id.text13);
        TextView texta4 = findViewById(R.id.text14);
        TextView texta5 = findViewById(R.id.text15);
        TextView texta6 = findViewById(R.id.text16);
        TextView texta7 = findViewById(R.id.text17);
        TextView texta8 = findViewById(R.id.text18);
        TextView texta9 = findViewById(R.id.text19);
        TextView texta10 = findViewById(R.id.text20);

        EditText edito = findViewById(R.id.edit1);
        EditText edito1 = findViewById(R.id.edit2);
        EditText edito2 = findViewById(R.id.edit3);
        EditText edito3 = findViewById(R.id.edit4);
        EditText edito4 = findViewById(R.id.edit5);
        EditText edito5 = findViewById(R.id.edit6);
        EditText edito6 = findViewById(R.id.edit7);
        EditText edito7 = findViewById(R.id.edit8);
        EditText edito8 = findViewById(R.id.edit9);
        EditText edito9 = findViewById(R.id.edit10);

        EditText nanbero = findViewById(R.id.nanber1);
        EditText nanbero1 = findViewById(R.id.nanber2);
        EditText nandero2 = findViewById(R.id.nanber3);
        EditText nandero3 = findViewById(R.id.nanber4);
        EditText nandero4 = findViewById(R.id.nanber5);
        EditText nandero5 = findViewById(R.id.nanber6);
        EditText nandero6 = findViewById(R.id.nanber7);
        EditText nandero7 = findViewById(R.id.nanber8);
        EditText nandero8 = findViewById(R.id.nanber9);
        EditText nandero9 = findViewById(R.id.nanber10);

        CharSequence moji = edito.getText();
        CharSequence moji1 = edito1.getText();
        CharSequence moji2 = edito2.getText();
        CharSequence moji3 = edito3.getText();
        CharSequence moji4 = edito4.getText();
        CharSequence moji5 = edito5.getText();
        CharSequence moji6 = edito6.getText();
        CharSequence moji7 = edito7.getText();
        CharSequence moji8 = edito8.getText();
        CharSequence moji9 = edito9.getText();

        CharSequence nan = nanbero.getText();
        CharSequence nan1 = nanbero1.getText();
        CharSequence nan2 = nandero2.getText();
        CharSequence nan3 = nandero3.getText();
        CharSequence nan4 = nandero4.getText();
        CharSequence nan5 = nandero5.getText();
        CharSequence nan6 = nandero6.getText();
        CharSequence nan7 = nandero7.getText();
        CharSequence nan8 = nandero8.getText();
        CharSequence nan9 = nandero9.getText();

        LinearLayout[] haire = new LinearLayout[10];
        LinearLayout li = findViewById(R.id.laya);
        haire[0] = li;
        LinearLayout li1 = findViewById(R.id.laya1);
        haire[1] = li1;
        LinearLayout li2 = findViewById(R.id.laya2);
        haire[2] = li2;
        LinearLayout li3 = findViewById(R.id.laya3);
        haire[3] = li3;
        LinearLayout li4 = findViewById(R.id.laya4);
        haire[4] = li4;
        LinearLayout li5 = findViewById(R.id.laya5);
        haire[5] = li5;
        LinearLayout li6 = findViewById(R.id.laya6);
        haire[6] = li6;
        LinearLayout li7 = findViewById(R.id.laya7);
        haire[7] = li7;
        LinearLayout li8 = findViewById(R.id.laya8);
        haire[8] = li8;
        LinearLayout li9 = findViewById(R.id.laya9);
        haire[9] = li9;
//
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
//                startActivity(intent);
//            }
//        });

        button1.setOnClickListener(new View.OnClickListener() {
            int i = 0;

            public void onClick(View v) {
                if (i < 9) {
                    i++;
                    System.out.println("クリック");
                    haire[i].setVisibility(View.VISIBLE);
                    System.out.println(haire[i]);
                    System.out.println(i);
                } else {
                    dialog.show();
                }

            }
        });

        buttono.setOnClickListener(new View.OnClickListener() {

            public void onClick(View a) {
                texta.setText(moji);
                texta1.setText(nan);
                String kiroku1 = texta.getText().toString();
                String kirokunannber1 = texta1.getText().toString();
                hairetu.add(kiroku1);
                hairetu.add(kirokunannber1);
//                new files(kiroku1,kirokunannber1);
                System.out.println("これは今日の日付(re)"+re());//これは今日の日付
                System.out.println("これは昨日の日付(re1)"+re1());//これは昨日の日付
                System.out.println("これは二日前の日付(re2)"+re2());//これは二日前の日付
//                System.out.println("これはyomikomiの値"+yomikomi("daydeta1"));
                //今日の日付けとファイル
                if (!re1().equals(re())){

//                    System.out.println("これは？"+yomikomi("daydeta1"));
                    List<String> i=yomikomi("daydeta1");
                    try (
                            PrintWriter pip = new PrintWriter(
                                    new OutputStreamWriter(openFileOutput(
                                            "daydeta1",MODE_PRIVATE)))){




//                        pip.print(i.get(kazu));

                        for (String lis:i){
                            pip.print(",");
                            pip.print(re());
                            pip.print(":");
                            pip.print(kiroku1);
                            pip.print(kirokunannber1);
                            pip.print(lis);
                            pip.print(".");}
//                        ++kazu;
                        System.out.println("メインクラスの"+i);
                        System.out.println("こちらが動いている１");
                        System.out.println("これは数"+kazu);
                    } catch (IOException e) {
                        e.printStackTrace();}
                }else {
                    try (
                            BufferedWriter pip = new BufferedWriter(
                                    new OutputStreamWriter(openFileOutput(
                                            "daydeta1", Context.MODE_APPEND)))) {
                    pip.append(LINE_SEPARATOR).append(",");
                    pip.append(re()).append(":");
                    pip.append(kiroku1);
                    pip.append(kirokunannber1);
                    pip.flush();
//                    System.out.println(yomikomi("daydeta1"));
                    System.out.println("こちらが動いている２");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        buttono1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                textb.setText(moji1);
                texta2.setText(nan1);
                String kiroku2 = textb.getText().toString();
                String kirokunannber2 = texta2.getText().toString();
                hairetu.add(kiroku2);
                hairetu.add(kirokunannber2);
                try (
                        BufferedWriter pip = new BufferedWriter(
                                new OutputStreamWriter(openFileOutput(
                                        "daydeta1", Context.MODE_APPEND)))) {
                    pip.append(",");
                    pip.append(re()).append(":");
                    pip.append(kiroku2);
                    pip.append(kirokunannber2);
                    pip.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                yomikomi("daydeta1");
            }

        });
        buttono2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                textc.setText(moji2);
                texta3.setText(nan2);
                String kiroku3 = textc.getText().toString();
                String kirokunannber3 = texta3.getText().toString();
                hairetu.add(kiroku3);
                hairetu.add(kirokunannber3);
                try (
                        BufferedWriter pip = new BufferedWriter(
                                new OutputStreamWriter(openFileOutput(
                                        "daydeta1", Context.MODE_APPEND)))) {
                    pip.append(",");
                    pip.append(re()).append(":");
                    pip.append(kiroku3);
                    pip.append(kirokunannber3);
                    pip.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                yomikomi("daydeta1");
            }

        });
        buttono3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                textd.setText(moji3);
                texta4.setText(nan3);
                String kiroku4 = textd.getText().toString();
                String kirokunannber4 = texta4.getText().toString();
                hairetu.add(kiroku4);
                hairetu.add(kirokunannber4);
                try (
                        BufferedWriter pip = new BufferedWriter(
                                new OutputStreamWriter(openFileOutput(
                                        "daydeta1", Context.MODE_APPEND)))) {
                    pip.append(",");
                    pip.append(re()).append(":");
                    pip.append(kiroku4);
                    pip.append(kirokunannber4);
                    pip.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                yomikomi("daydeta1");
            }

        });
        buttono4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                texte.setText(moji4);
                texta5.setText(nan4);
                String kiroku5 = texte.getText().toString();
                String kirokunannber5 = texta5.getText().toString();
                hairetu.add(kiroku5);
                hairetu.add(kirokunannber5);
                try (
                        BufferedWriter pip = new BufferedWriter(
                                new OutputStreamWriter(openFileOutput(
                                        "daydeta1", Context.MODE_APPEND)))) {
                    pip.append(",");
                    pip.append(re()).append(":");
                    pip.append(kiroku5);
                    pip.append(kirokunannber5);
                    pip.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                yomikomi("daydeta1");
            }

        });
        buttono5.setOnClickListener(new View.OnClickListener() {
            private CharArrayWriter pip;

            public void onClick(View a) {
                textf.setText(moji5);
                texta6.setText(nan5);
                String kiroku6 = textf.getText().toString();
                String kirokunannber6 = texta6.getText().toString();
                hairetu.add(kiroku6);
                hairetu.add(kirokunannber6);
                System.out.println(hairetu);
                try (
                        BufferedWriter pip = new BufferedWriter(
                                new OutputStreamWriter(openFileOutput(
                                        "daydeta1", Context.MODE_APPEND)))) {
                    pip.append(",");
                    pip.append(re()).append(":");
                    pip.append(kiroku6);
                    pip.append(kirokunannber6);
                    pip.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                yomikomi("daydeta1");
            }

        });
        buttono6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                textg.setText(moji6);
                texta7.setText(nan6);
                String kiroku7 = textg.getText().toString();
                String kirokunannber7 = texta7.getText().toString();
                hairetu.add(kiroku7);
                hairetu.add(kirokunannber7);
                try (
                        BufferedWriter pip = new BufferedWriter(
                                new OutputStreamWriter(openFileOutput(
                                        "daydeta1", Context.MODE_APPEND)))) {
                    pip.append(",");
                    pip.append(re()).append(":");
                    pip.append(kiroku7);
                    pip.append(kirokunannber7);
                    pip.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                yomikomi("daydeta1");
            }

        });
        buttono7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                texth.setText(moji7);
                texta8.setText(nan7);
                String kiroku8 = texth.getText().toString();
                String kirokunannber8 = texta8.getText().toString();
                hairetu.add(kiroku8);
                hairetu.add(kirokunannber8);
                try (
                        BufferedWriter pip = new BufferedWriter(
                                new OutputStreamWriter(openFileOutput(
                                        "daydeta1", Context.MODE_APPEND)))) {
                    pip.append(",");
                    pip.append(re()).append(":");
                    pip.append(kiroku8);
                    pip.append(kirokunannber8);
                    pip.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                yomikomi("daydeta1");
            }

        });
        buttono8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                texti.setText(moji8);
                texta9.setText(nan8);
                String kiroku9 = texti.getText().toString();
                String kirokunannber9 = texta9.getText().toString();
                hairetu.add(kiroku9);
                hairetu.add(kirokunannber9);
                try (
                        BufferedWriter pip = new BufferedWriter(
                                new OutputStreamWriter(openFileOutput(
                                        "daydeta1", Context.MODE_APPEND)))) {
                    pip.append(",");
                    pip.append(re()).append(":");
                    pip.append(kiroku9);
                    pip.append(kirokunannber9);
                    pip.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        });
        buttono9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                textj.setText(moji9);
                texta10.setText(nan9);
                String kiroku10 = textj.getText().toString();
                String kirokunannber10 = texta10.getText().toString();
                hairetu.add(kiroku10);
                hairetu.add(kirokunannber10);
                try (
                        BufferedWriter pip = new BufferedWriter(
                                new OutputStreamWriter(openFileOutput(
                                        "daydeta1", Context.MODE_APPEND)))) {
                    pip.append(",");
                    pip.append(re()).append(":");
                    pip.append(kiroku10);
                    pip.append(kirokunannber10);
                    pip.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
    }


    public static String re() {//時間表示メソッド
        Calendar calen=Calendar.getInstance();
        calen.get(Calendar.YEAR);
        calen.get(Calendar.MONTH);
        calen.get(Calendar.DATE);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd",Locale.JAPAN);
        df.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        return df.format(calen.getTime());
    }
    public static String re1() {//時間表示メソッド
        Calendar cal=Calendar.getInstance();
        cal.get(Calendar.YEAR);
        cal.get(Calendar.MONTH);
        cal.add(Calendar.DATE,-1);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd",Locale.JAPAN);
        df.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        return df.format(cal.getTime());
    }
    public static String re2() {//時間表示メソッド
        Calendar calen=Calendar.getInstance();
        calen.get(Calendar.YEAR);
        calen.get(Calendar.MONTH);
        calen.add(Calendar.DATE,-2);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd",Locale.JAPAN);
        df.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        return df.format(calen.getTime());
    }
    int kazu=0;
    public List<String> yomikomi(String file) {
        List<String> array = new ArrayList<String>();
//        String regex="\\d{4}.\\d\\d.\\d\\d";
//        String regex="^(?!.*"+re2()+").*$";
        String regex=",("+re()+".*?)\\.";
        String i = "";
        try {
            System.out.println(regex);
            Pattern p =Pattern.compile(regex);
            FileInputStream fileInput = openFileInput(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInput, StandardCharsets.UTF_8));
            String lineBuffer;
            System.out.println("到達");
            while ((lineBuffer = reader.readLine()) != null) {
                System.out.println("1ーーーーーーーーーーーーーーーーーーーーーー");
//               line = lineBuffer.split(",[0-9]{4}-[0-9]{4}-[0-9]{2}:");
//               System.out.println(Arrays.toString(line));
                Matcher m = p.matcher(lineBuffer);
                System.out.println("これはこれ" + m);
                System.out.println("これはlineBufferのあたい" + lineBuffer);
                while (m.find()){
                    System.out.println("これはsplitからforかけた部分" + m.group());
                    System.out.println("2ーーーーーーーーーーーーーーーーーーーーーー");
                    array.add((m.group()));
                    System.out.println("マッチングしました");
                    System.out.println("これはマッチングした値" + array);
                    System.out.println("これはmの値1" + m.group());
                    System.out.println("3ーーーーーーーーーーーーーーーーーーーーーー");


//                }else{
//                   System.out.println("マッチングない");
//                   System.out.println("これはelseのiの値2"+i);
//                   System.out.println("4ーーーーーーーーーーーーーーーーーーーーーー");
//                   array.clear();

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("これは最後のアレイクラス"+array);
        System.out.println("これはおわりのi"+i);
        return array;
    }
}
////////////////////////
//一旦中止1/18
//これからすることは前日の記録を常時表示するもの（方法動的にレイアウトを作製してIDを付与して
//yomikomiメソッドを実行
//IDを付与する理由はリムーブを今後で追加するかもしれないから
//データーの保存方法（データーベース等も要検討）