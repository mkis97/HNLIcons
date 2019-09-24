package hr.ferit.marijokis.orwima_lv5_zadatak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    Button btn_insp;
    Button btn_edit;
    RadioGroup group_one;
    RadioButton rbtn_first;
    RadioButton rbtn_second;
    RadioButton rbtn_third;
    ImageView iv_karic;
    ImageView iv_amigo;
    ImageView iv_brkljaca;
    EditText et_enter;
    TextView tv_karic;
    TextView tv_amigo;
    TextView tv_brkljaca;
    String TOAST_AMIGO="A dragi negdje 80%...";
    String TOAST_KARIC="Hattrick";
    String TOAST_BRKLJACA="Tunel Iniesta?";
    String TOAST_WARNING="Choose one person";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeUI();
    }


    private void initializeUI() {
        this.btn_insp = (Button) findViewById(R.id.btn_insp);
        this.btn_edit = (Button) findViewById(R.id.btn_edit);
        this.group_one = (RadioGroup) findViewById(R.id.group_one);
        this.rbtn_first = (RadioButton) findViewById(R.id.rbtn_first);
        this.rbtn_second = (RadioButton) findViewById(R.id.rbtn_second);
        this.rbtn_third = (RadioButton) findViewById(R.id.rbtn_third);
        this.iv_karic = (ImageView) findViewById(R.id.iv_karic);
        this.iv_amigo = (ImageView) findViewById(R.id.iv_amigo);
        this.iv_brkljaca = (ImageView) findViewById(R.id.iv_brkljaca);
        this.tv_karic = (TextView) findViewById(R.id.tv_karic);
        this.tv_amigo = (TextView) findViewById(R.id.tv_amigo);
        this.tv_brkljaca = (TextView) findViewById(R.id.tv_brkljaca);
        this.et_enter=(EditText)findViewById(R.id.et_enter);
    }


    public void toast(View v) {
            int random = (int)(Math.random() * 3 + 1);
            if(random==1){
                Toast.makeText(MainActivity.this, TOAST_KARIC,
                        Toast.LENGTH_LONG).show();
            }
            else if(random==2){
                Toast.makeText(MainActivity.this, TOAST_AMIGO,
                        Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(MainActivity.this, TOAST_BRKLJACA,
                        Toast.LENGTH_LONG).show();
            }

    }

    public void newDesc(View v){
        if(this.rbtn_first.isChecked()){
            this.tv_karic.setText(et_enter.getText().toString());
        }
        else if(this.rbtn_second.isChecked()){
            this.tv_amigo.setText(et_enter.getText().toString());
        }
        else if(this.rbtn_third.isChecked()){
            this.tv_brkljaca.setText(et_enter.getText().toString());
        }
        else{
            Toast.makeText(this,TOAST_WARNING,Toast.LENGTH_LONG).show();
        }
    }

    public void gone_karic(View v){
        iv_karic.setVisibility(View.GONE);
    }

    public void gone_amigo(View v){
        iv_amigo.setVisibility(View.GONE);
    }

    public void gone_brkljaca(View v){
        iv_brkljaca.setVisibility(View.GONE);
    }

    public void back_karic(View v){
        iv_karic.setVisibility(View.VISIBLE);
    }

    public void back_amigo(View v){
        iv_amigo.setVisibility(View.VISIBLE);
    }

    public void back_brkljaca(View v){
        iv_brkljaca.setVisibility(View.VISIBLE);
    }

}







