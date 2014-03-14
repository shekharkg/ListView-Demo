package ytube.trial;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapterClass extends ArrayAdapter<String>{
  Context context;
  int[] imageArray;
  String[] titleArray;
  String[] descriptionArray;
  
 
  
  ListAdapterClass(Context c,String[] titles,int[] memeImage,String[] memeDescription){
    super(c,R.layout.descsingle_row,R.id.textView1,titles);
    this.context= c;
    this.imageArray = memeImage;
    this.titleArray = titles;
    this.descriptionArray = memeDescription;
  }
  @Override
  public View getView(int position, View convertView, ViewGroup parent){
    
      LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      View row = inflater.inflate(R.layout.descsingle_row, parent,false);
   
    
   
    ImageView myImage = (ImageView) row.findViewById(R.id.imageView1);
    TextView myTitle =  (TextView) row.findViewById(R.id.textView1);
    TextView myDescription =  (TextView) row.findViewById(R.id.textView2);
    
    myImage.setImageResource(imageArray[position]);
    myTitle.setText(titleArray[position]);
    myDescription.setText(descriptionArray[position]);
    
    return row;
    
  }
}
