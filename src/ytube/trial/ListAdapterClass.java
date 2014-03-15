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
  
  class MyViewHolder{
   ImageView myImage;
   TextView myTitle;
   TextView  myDescription;
   
   MyViewHolder(View v){
     myImage = (ImageView) v.findViewById(R.id.imageView1);
     myTitle =  (TextView) v.findViewById(R.id.textView1);
     myDescription =  (TextView) v.findViewById(R.id.textView2);
   }
   
  }
  @Override
  public View getView(int position, View convertView, ViewGroup parent){
      View row = convertView;
      MyViewHolder holder = null;
      if(row==null){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row = inflater.inflate(R.layout.descsingle_row, parent,false);
        holder = new MyViewHolder(row);
        row.setTag(holder);
      }
      else{
        holder = (MyViewHolder) row.getTag();
      }
      
    holder.myImage.setImageResource(imageArray[position]);
    holder.myTitle.setText(titleArray[position]);
    holder.myDescription.setText(descriptionArray[position]);
    
    return row;
    
  }
}
