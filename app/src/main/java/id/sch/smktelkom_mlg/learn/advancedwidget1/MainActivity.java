package id.sch.smktelkom_mlg.learn.advancedwidget1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llmain  = (LinearLayout) findViewById(R.id.linearLayoutMain);

        final EditText etNama = new EditText(this);
        llmain.addView(etNama);
        etNama.setHint("Isikan Nama Anak");

        final EditText etUmur = new EditText(this);
        llmain.addView(etUmur);
        etUmur.setHint("Isikan Umur Anak");
        etUmur.setInputType(InputType.TYPE_CLASS_NUMBER);

        Button bProses = new Button(this);
        bProses.setText("Proses");
        llmain.addView(bProses);
        final TextView tvhasil = new TextView(this);
        llmain.addView(tvhasil);
        bProses.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String nama = etNama.getText().toString();
                String umur = etUmur.getText().toString();

                tvhasil.setText(nama + " umur " + umur + " tahun ");

            }
        });
    }
}
