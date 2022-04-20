package com.example.baikiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.baikiemtra.sv.sinhvien;

public class MainActivity2 extends AppCompatActivity {
    EditText edthoten,edtemail,edtsodienthoai,edthocphi,edtmagiamgia;
    EditText ra_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Anhxa();
        laydulieu();
    }

    private void Anhxa() {
        edthoten = findViewById(R.id.am2_tv_hoten);
        edtemail = findViewById(R.id.am2_tv_email);
        edtsodienthoai  =findViewById(R.id.am2_tv_dienthoai);
        edthocphi = findViewById(R.id.am2_tv_hocphi);
        edtmagiamgia = findViewById(R.id.am2_tv_giamgia);

        ra_1 = findViewById(R.id.am2_tv_lichhoc);
    }

    public void laydulieu() {
        Intent intent = getIntent();
        sinhvien sv1 = (sinhvien) intent.getSerializableExtra("data");
        edthoten.setText(sv1.getHoten());
        edtemail.setText(sv1.getEmail());
        edtsodienthoai.setText(sv1.getDienthoai());
        ra_1.setText(sv1.getLich());
        edthocphi.setText(sv1.getHocphi());
        edtmagiamgia.setText(sv1.getMagiamgia());
    }
}