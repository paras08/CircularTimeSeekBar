package demogame.com.circulartimeseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity  extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    TextView start_time,end_time,time_diff;
    String startingtime = "00:00";
    String endtime="00:00";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TimeSeekBar sliderRange = (TimeSeekBar) findViewById(R.id.circular);

        start_time = (TextView) findViewById(R.id.start_time);
        end_time = (TextView) findViewById(R.id.end_time);
        time_diff = (TextView) findViewById(R.id.time_diff);

        sliderRange.setOnSliderRangeMovedListener(new TimeSeekBar.OnSliderRangeMovedListener() {
            @Override
            public void onStartSliderMoved(double pos) {
                startingtime = CalculateValues.starttime((int)pos);
                start_time.setText("Start Time "+startingtime);

                time_diff.setText("Time Differnce "+ CalculateValues.dateTimeDiff(startingtime,endtime));
            }

            @Override
            public void onEndSliderMoved(double pos) {
                endtime = CalculateValues.starttime((int)pos);
                end_time.setText("End Time "+endtime);
                time_diff.setText("Time Differnce "+ CalculateValues.dateTimeDiff(startingtime,endtime));
            }

            @Override
            public void onStartSliderEvent(Thumbevent event) {
                Log.e(TAG, "onStartSliderEvent:" + event);
            }

            @Override
            public void onEndSliderEvent(Thumbevent event) {
                Log.e(TAG, "onEndSliderEvent:" + event);
            }
        });
    }




}
