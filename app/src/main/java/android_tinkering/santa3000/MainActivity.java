package android_tinkering.santa3000;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    SegmentLayout hats = (SegmentLayout) findViewById(R.id.sl_hat);
    hats.setImages(new int[]{
        R.drawable.hat_01,
        R.drawable.hat_02,
        R.drawable.hat_03}
    );

    SegmentLayout face = (SegmentLayout) findViewById(R.id.sl_face);
    face.setImages(new int[]{
        R.drawable.face_01,
        R.drawable.face_02,
        R.drawable.face_03}
    );
  }
}
