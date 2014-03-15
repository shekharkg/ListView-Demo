package ytube.trial;

import java.util.ArrayList;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GridViewAdapter extends BaseAdapter{

  ArrayList<BaseAdapterRow> listRow;
  Context c;
  
  public GridViewAdapter(Context context) {
    // TODO Auto-generated constructor stub
    this.c = context;
    listRow = new ArrayList<BaseAdapterRow>();
    
    Resources res = context.getResources();
    String[]titles = res.getStringArray(R.array.titles);
    String[]description = res.getStringArray(R.array.description);
    int[] image = {R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7,R.drawable.meme8,R.drawable.meme9,R.drawable.meme10,R.drawable.meme11,R.drawable.meme12
        ,R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7,R.drawable.meme8,R.drawable.meme9,R.drawable.meme10,R.drawable.meme11,R.drawable.meme12
        ,R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7,R.drawable.meme8,R.drawable.meme9,R.drawable.meme10,R.drawable.meme11,R.drawable.meme12
        ,R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7,R.drawable.meme8,R.drawable.meme9,R.drawable.meme10,R.drawable.meme11,R.drawable.meme12
        ,R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7,R.drawable.meme8,R.drawable.meme9,R.drawable.meme10,R.drawable.meme11,R.drawable.meme12};
     
    for(int i=0;i<60;i++)
     {
       listRow.add(new BaseAdapterRow(titles[i], description[i], image[i]));
     }
  }
  
  
  @Override
  public int getCount() {
    // TODO Auto-generated method stub
    return listRow.size();
  }

  @Override
  public Object getItem(int arg0) {
    // TODO Auto-generated method stub
    return listRow.get(arg0);
  }

  @Override
  public long getItemId(int arg0) {
    // TODO Auto-generated method stub
    return arg0;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    // TODO Auto-generated method stub
    return null;
  }

}
