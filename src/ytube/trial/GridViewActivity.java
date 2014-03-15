package ytube.trial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class GridViewActivity extends Activity{
  
  GridView gridView;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_gridview);
    gridView = (GridView) findViewById(R.id.gridView);
    gridView.setAdapter(new GridViewAdapter(this));
  }
}
