package dialogfragment.custom.anguiano.carlos.customdialogfragment;

import android.support.v4.app.FragmentManager;
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
                showEditDialog();
            }
        });
    }


    private void showEditDialog() {
        FragmentManager fm = getSupportFragmentManager();
        FullScreenDialog editNameDialogFragment = FullScreenDialog.newInstance("Some Title");
        editNameDialogFragment.show(getFragmentManager(), "fragment_edit_name");
    }
}
