package ytube.trial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class BaseAdapterActivity extends Activity{
  ListView list;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_descrip);
    list = (ListView) findViewById(R.id.listView1);
    list.setAdapter(new BaseAdapterClass(this));
  }

}
