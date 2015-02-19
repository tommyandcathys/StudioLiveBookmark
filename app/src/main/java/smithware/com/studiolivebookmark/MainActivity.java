package smithware.com.studiolivebookmark;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private ArrayList verses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        verses = new ArrayList<verse>();
        verses.add(new verse("Love is patient, love is kind",
                "1 Corinthians 13:4a",
                "This is the main theme of the Gospel series.  It teaches us that to be like God, we need to love others."));
        verses.add(new verse(
                    "So God created human beings in His own likeness.  He created them to be like Himself.  He created them as male and female.",
                    "Genesis 1:27",
                    "This week we learn that God created us and loves us. He loved us so much that he sent us a valentine (the Bible) and invites us to have a relationship with Him."));
        verses.add(new verse(
                "Everyone has sinned.  No one measures up to God's glory.",
                "Romans 3:23",
                "This week we learn that we all make mistakes.  These mistakes, called sin, separate us from God and keep us from having a relationship with Him."));
        verses.add(new verse(
                "But here is how God has shown his love for us. While we were still sinners, Christ died for us",
                "Romans 5:8",
                "This week we learn that God uses Jesus' death on the cross to forgive our sins and bridge the gap that separates us from Him."));
        verses.add(new verse(
                "Jesus answered, “I am the way and the truth and the life. No one comes to the Father except through me.”",
                "John 14:6",
                "This week we learn that the only way to have a relationship with God is to accept the gift that he gave us. Jesus' death on the cross was the payment for sin and believing in Him is the only way we can have a relationship with God."));
   setContentView(R.layout.activity_main_list);

   ListView v = (ListView) findViewById(R.id.verseListView);
    v.setAdapter(new VerseListAdapter(this,verses));

        v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                 TextView desc = (TextView) findViewById(R.id.txtDescription);
                 if(desc != null){
                     verse v1 = (verse) verses.get(position);
                     desc.setText(v1.getDescription());

                 }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
