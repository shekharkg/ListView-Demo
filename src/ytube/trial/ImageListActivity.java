package ytube.trial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ImageListActivity extends Activity implements OnItemClickListener{
  String[] data={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
  ListView imageListView;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_image_list);
    imageListView = (ListView) findViewById(R.id.listView1);
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.single_row,R.id.textView1,data);
    imageListView.setAdapter(adapter);
  }

  @Override
  public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
    // TODO Auto-generated method stub
    int mnth = arg2+1;
    TextView txt = (TextView) arg1;
    Toast.makeText(this, txt.getText()+"-"+mnth+"th month", Toast.LENGTH_SHORT).show();
  }

 
}
