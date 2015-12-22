package vm.demo.spornchai.traffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView trafficListView;
    private Button aboutMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget
        bindWidget();

        // Button Controller
        buttonController();

        // Listview Controller
        listViewController();


    } //Main Method

    private void listViewController() {
        //#1
        final int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10,
                R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20,};
        //#2
        final String[] strTitle = new String[20];
        strTitle[0] = "title#1";
        strTitle[1] = "title#2";
        strTitle[2] = "title#3";
        strTitle[3] = "title#4";
        strTitle[4] = "title#5";
        strTitle[5] = "title#6";
        strTitle[6] = "title#7";
        strTitle[7] = "title#8";
        strTitle[8] = "title#9";
        strTitle[9] = "title#10";
        strTitle[10] = "title#11";
        strTitle[11] = "title#12";
        strTitle[12] = "title#13";
        strTitle[13] = "title#14";
        strTitle[14] = "title#15";
        strTitle[15] = "title#16";
        strTitle[16] = "title#17";
        strTitle[17] = "title#18";
        strTitle[18] = "title#19";
        strTitle[19] = "title#20";

        //#3
        String[] strDetail = getResources().getStringArray(R.array.detail_short);

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, strTitle, strDetail, intIcon);
        trafficListView.setAdapter(objMyAdapter);

        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent objIntent = new Intent(MainActivity.this, DetailActivity.class);
                objIntent.putExtra("Title", strTitle[position]);
                objIntent.putExtra("Image", intIcon[position]);
                objIntent.putExtra("Index", position);
                startActivity(objIntent);

            }//event
        });
    }

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Play media
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.bird_maxican);
                buttonMediaPlayer.start();

                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("http://www.beenets.com"));
                startActivity(objIntent);

            } //event
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);


    }
} //Main Class