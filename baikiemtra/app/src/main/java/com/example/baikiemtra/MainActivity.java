package com.example.baikiemtra;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.baikiemtra.sv.sinhvien;

public class MainActivity extends AppCompatActivity {
EditText txthoten,txtemail,txtdienthoai,txthocphi,txtgiamgia;
RadioButton ra_1,ra_2,ra_3;
Button btndangki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();

        btndangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hoten = txthoten.getText().toString();
                String dienthoai = txtdienthoai.getText().toString();
                String email = txtemail.getText().toString();
                String lich = "";
                String giamgia = txtgiamgia.getText().toString();
                if (ra_1.isChecked()){
                    lich = "thứ 2,4,6";
                }else if(ra_2.isChecked()){
                    lich = "thứ 3,5";
                }else {
                    lich = "thứ 7, CN";
                }
                String hocphi = txthocphi.getText().toString();
                int hp= Integer.valueOf(hocphi);
                if(giamgia.equals("cdct"))
                giamgia = String.valueOf(hp - 500000);
                else giamgia = String.valueOf(hp);
                sinhvien sv = new  sinhvien(hoten,email,dienthoai,lich,hocphi,giamgia);
                laydulieu(sv);
            }
        });
    }

    private void Anhxa() {
        txthoten = findViewById(R.id.am_edt_hoten);
        txtemail = findViewById(R.id.am_edt_email);
        txtdienthoai = findViewById(R.id.am_txt_dienthoai);
        txthocphi = findViewById(R.id.am_edt_hocphi);
        txtgiamgia = findViewById(R.id.am_edt_giamgia);

        ra_1 = findViewById(R.id.am_ra_101);
        ra_2 = findViewById(R.id.am_ra_102);
        ra_3 = findViewById(R.id.am_ra_103);

        btndangki = findViewById(R.id.am_btn_dangki);
    }

    public void laydulieu(sinhvien sv1) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("data",sv1);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode){
            case 1:
            if(data != null){
                sinhvien sv1 = (sinhvien) data.getSerializableExtra("data");
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}