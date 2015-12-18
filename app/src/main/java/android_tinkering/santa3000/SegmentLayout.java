package android_tinkering.santa3000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by mario on 17/12/15.
 */
public class SegmentLayout extends LinearLayout {

  private int index;
  private ImageView image;
  private int[] imageIds;

  public SegmentLayout(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public SegmentLayout(Context context) {
    super(context);
  }

  public SegmentLayout(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public SegmentLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  @Override
  protected void onFinishInflate() {
    super.onFinishInflate();
    LayoutInflater inflater = LayoutInflater.from(getContext());
    inflater.inflate(R.layout.layout_segment, this);

    image = (ImageView) findViewById(R.id.segment_image);

    findViewById(R.id.b_left).setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        if (index > 0) {
          index --;
          showImage();
        }
      }
    });

    findViewById(R.id.b_right).setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        if (index < imageIds.length-1) {
          index ++;
          showImage();
        }
      }
    });
  }

  private void showImage() {
    image.setImageResource(imageIds[index]);
  }

  public void setImages(int[] imageIds) {
    this.index = 0;
    this.imageIds = imageIds;

    showImage();
  }
}
