package techkids.mad3.animationcartoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnStart, btnStop;
    private ImageView imgDisplayFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    private void initComponent()
    {
        imgDisplayFrame = (ImageView) this.findViewById(R.id.imgDisplayFrame);

        btnStart = (Button) this.findViewById(R.id.btnStart);
        btnStop = (Button) this.findViewById(R.id.btnStop);

        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id)
        {
            case R.id.btnStart:
                break;
            case R.id.btnStop:
                break;
        }
    }
}
