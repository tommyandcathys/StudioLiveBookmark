package smithware.com.studiolivebookmark;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tommy on 2/18/2015.
 * ArrayAdapter for verses.
 */
public class VerseListAdapter extends BaseAdapter {
    ArrayList<verse> verses;
    LayoutInflater layoutinflater;
    public VerseListAdapter(Context context, ArrayList<verse> verses){
        this.verses = verses;
        this.layoutinflater = LayoutInflater.from(context);

    }
    @Override
    public int getCount() {
        return verses.size();
    }

    @Override
    public Object getItem(int position) {
        return verses.get(position);
    }

    @Override
    public long getItemId(int position) {
        return (long) position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
ViewHolder viewholder;
        if(convertView == null){
    convertView = layoutinflater.inflate(R.layout.verse_list_view,null);
            viewholder = new ViewHolder();
            //set the textviews
            viewholder.verse =  (TextView) convertView.findViewById(R.id.verse);
            viewholder.address = (TextView) convertView.findViewById(R.id.address);
            convertView.setTag(viewholder);
        }
        else
        {
            viewholder = (ViewHolder) convertView.getTag();
        }
        viewholder.verse.setText(verses.get(position).getText());
        viewholder.address.setText(verses.get(position).getAddress());
        return convertView;
    }

    static class ViewHolder{
        //view holder class for activity_main_list
        TextView verse;
        TextView address;

    }
}
