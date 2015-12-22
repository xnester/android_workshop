package vm.demo.spornchai.traffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class DetailActivity extends AppCompatActivity {

    // Exlplicit
    private TextView titleTextView, detailTextView;
    private ImageView bodyImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        bindWidget();

    }

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        bodyImageView = (ImageView) findViewById(R.id.imageView2);

    }

}
