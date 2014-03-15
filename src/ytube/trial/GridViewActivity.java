package ytube.trial;

import ytube.trial.GridViewAdapter.MyViewHolder1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridViewActivity extends Activity implements AdapterView.OnItemClickListener{
  
  GridView gridView;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_gridview);
    gridView = (GridView) findViewById(R.id.gridView);
    gridView.setAdapter(new GridViewAdapter(this));
    gridView.setOnItemClickListener(this);
  }
  @Override
  public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
    // TODO Auto-generated method stub
    Intent i = new Intent(this, MyDialog.class);
    
    MyViewHolder1 holder = (MyViewHolder1) arg1.getTag();
    BaseAdapterRow temp = (BaseAdapterRow) holder.myImage.getTag();
    
    i.putExtra("myImage",temp.image );
    i.putExtra("myTitle",temp.title );
    i.putExtra("myDescription",temp.descripton );
    startActivity(i);
  }
}
