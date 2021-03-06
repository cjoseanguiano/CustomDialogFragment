package dialogfragment.custom.anguiano.carlos.customdialogfragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button", Toast.LENGTH_SHORT).show();
                FullScreenDialog dialog = new FullScreenDialog();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                dialog.show(getFragmentManager(), "");
            }
        });
    }
}
