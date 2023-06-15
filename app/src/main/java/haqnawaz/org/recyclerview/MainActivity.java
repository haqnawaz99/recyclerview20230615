package haqnawaz.org.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Friends> friendsList = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Friends f0 = new Friends(1,"Asad", 1980, "Giglgit",R.drawable.d);
        Friends f1 = new Friends(2,"Zubair", 1981, "Lahore",R.drawable.c);
        Friends f2 = new Friends(3,"Musa", 1980, "Quetta",R.drawable.b);
        Friends f3 = new Friends(4,"Nadeem",1987,"Peshawar",R.drawable.a);
        Friends f4 = new Friends(5,"Shahid", 1980, "Karachi",R.drawable.c);
        Friends f5 = new Friends(6,"Zia",1987,"Faisalabad ",R.drawable.a);
        Friends f6 = new Friends(7,"Badar", 1980, "Rawalpindi",R.drawable.d);
        Friends f7 = new Friends(8,"Hashim",1997,"Karachi",R.drawable.b);
        Friends f8 = new Friends(9,"Salman",1980,"Quetta",R.drawable.c);
        Friends f9 = new Friends(10,"Rizwan",1982,"Kasur",R.drawable.d);
        Friends f10 = new Friends(11,"Junaid",1977,"Islamabad",R.drawable.a);
        Friends f11 = new Friends(12,"Waseem",1967,"Rawalpindi",R.drawable.b);

        friendsList.addAll(Arrays.asList(new Friends[]{f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11}));
        recyclerView = findViewById(R.id.recylerViewStudent);


        recyclerView.setHasFixedSize(true);

        //LinearLayoutManager GridLayoutManager
        layoutManager = new LinearLayoutManager(MainActivity.this);
//        layoutManager = new LinearLayoutManager(MainActivity.this,
//                LinearLayoutManager.HORIZONTAL,
//                false);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new myRecyclerViewAdapter(friendsList) ;
        recyclerView.setAdapter(adapter);
        //adapter.notifyDataSetChanged();


    }
}