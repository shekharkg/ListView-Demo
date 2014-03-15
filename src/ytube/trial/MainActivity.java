package ytube.trial;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements CompoundButton.OnCheckedChangeListener, OnClickListener{
  
  RelativeLayout r;
  ToggleButton t;
  Button b,b1,b2,b3,b4;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    r = (RelativeLayout) findViewById(R.id.layout);
    t = (ToggleButton) findViewById(R.id.toggleButton);
    b = (Button) findViewById(R.id.button_list);
    b1 = (Button) findViewById(R.id.button_imageList);
    b2 = (Button) findViewById(R.id.button_descList);
    b3 = (Button) findViewById(R.id.button1);
    b4 = (Button) findViewById(R.id.button2);
    b.setOnClickListener(this);
    b1.setOnClickListener(this);
    b2.setOnClickListener(this);
    b3.setOnClickListener(this);
    b4.setOnClickListener(this);
    t.setOnCheckedChangeListener(this);
  }


  @Override
  public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
    // TODO Auto-generated method stub
    if(isChecked)
    {
      r.setBackgroundColor(Color.BLACK);
    }
    else
    {
      r.setBackgroundColor(Color.WHITE);
    }
  }


  @Override
  public void onClick(View v) {
    // TODO Auto-generated method stub
    switch (v.getId()) {
    case R.id.button_list:
      Intent i = new Intent(MainActivity.this, ListActivity.class);
      startActivity(i);
      break;
    case R.id.button_imageList:
      Intent j = new Intent(MainActivity.this, ImageListActivity.class);
      startActivity(j);
      break;
    case R.id.button_descList:
      Intent k = new Intent(MainActivity.this, DescriptionImageListActivity.class);
      startActivity(k);
      break;
    case R.id.button1:
      Intent l = new Intent(MainActivity.this, BaseAdapterActivity.class);
      startActivity(l);
      break;
    case R.id.button2:
      Intent m = new Intent(MainActivity.this, GridViewActivity.class);
      startActivity(m);
      break;
    }
  }
}