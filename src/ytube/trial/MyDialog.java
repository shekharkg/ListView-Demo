package ytube.trial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MyDialog extends Activity{
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_mydialog);
}
  public void closeDialog(View v){
    finish();
  }
}