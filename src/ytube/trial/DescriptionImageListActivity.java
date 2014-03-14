package ytube.trial;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class DescriptionImageListActivity extends Activity{
  ListView listDescrip;
  String[] memeTitles;
  String[] memeDescription;
  int[] memeImage = {R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7,R.drawable.meme8,R.drawable.meme9,R.drawable.meme10,R.drawable.meme11,R.drawable.meme12
      ,R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7,R.drawable.meme8,R.drawable.meme9,R.drawable.meme10,R.drawable.meme11,R.drawable.meme12
      ,R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7,R.drawable.meme8,R.drawable.meme9,R.drawable.meme10,R.drawable.meme11,R.drawable.meme12
      ,R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7,R.drawable.meme8,R.drawable.meme9,R.drawable.meme10,R.drawable.meme11,R.drawable.meme12
      ,R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7,R.drawable.meme8,R.drawable.meme9,R.drawable.meme10,R.drawable.meme11,R.drawable.meme12};
   @Override
   protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_descrip);
     Resources res = getResources();
     memeTitles = res.getStringArray(R.array.titles);
     memeDescription = res.getStringArray(R.array.description);
     listDescrip = (ListView) findViewById(R.id.listView1);
     
     ListAdapterClass adapter = new ListAdapterClass(this,memeTitles,memeImage,memeDescription);
     listDescrip.setAdapter(adapter);
   }
  
   
   
}
