package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);

        list = new ArrayList<>();
        list.add("가");
        list.add("나");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");

        //Header , Footer
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View header = layoutInflater.inflate(R.layout.header_view, null, false);
        View footer = layoutInflater.inflate(R.layout.footer_view, null, false);

        listView.addHeaderView(header);
        listView.addFooterView(footer);

        // Header Footer 넣을시에 무조건 내용이 존재해야 사용 할 수 있음.

        // base Adapter , Array Adapter , Cursor Adapter 3가지 존재
        // base 를 기본으로 나머지 두개를 사용 가능
        // base를 상속받아서 사용하기 때문!


        //Adapter ListView 적용
        final MyAdapter myAdapter = new MyAdapter(MainActivity.this, list);
        listView.setAdapter(myAdapter);

        // Header 클릭하면 두번째 리스트인 나 를 가로 바꾸고 다시 리스트를 불러올 수 있도록 하자!
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.set(1, "가");
                Log.d("list_change", "list:" + list);
                myAdapter.notifyDataSetChanged(); // 변화를 체크하고 변화가 있다면 체인지
            }
        });


    }

    class MyAdapter extends BaseAdapter {

        private ViewHolder viewHolder;
        private LayoutInflater inflater;
        private ArrayList<String> itemList;

        public MyAdapter(Context context, ArrayList<String> itemList) {
            this.itemList = itemList;
            this.inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            // 내가 그릴 리스트 뷰가 몇개인지 설정, 알려주는 기능
            return itemList.size();
        }

        @Override
        public String getItem(int i) {
            // 어댑터가 아이템 리스트로부터 하나씩 빼오는데 getItem을 호출해서 사용
            // i 는 그 중 몇번째인지 index, position
            return itemList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
//        public View getView(int i, View view, ViewGroup viewGroup) { 밑에와 같음
        public View getView(int i, View convertView, ViewGroup parent) {
            //Inflater를 가져와서 xml을 불러오고 텍스트뷰나 이미지뷰를 찾아서 getItem으로 가져온
            // 데이터에서부터 뽑아서 리스트를 채워줌

            View view = convertView;
            if (view == null) {
                Log.d("test", "new");

                viewHolder = new ViewHolder();
                view = inflater.inflate(R.layout.list_item_view, null);
                viewHolder.textView = view.findViewById(R.id.item_view_text);
                view.setTag(viewHolder); // 저장되는 부분
                // inflate 해와서 그중 textView를 찾아서 ViewHolder에 저장
            } else {
                Log.d("test", "recycle");
                viewHolder = (ViewHolder) view.getTag();
            }
            viewHolder.textView.setText(getItem(i));
            return view;
        }

        // 10개나 20개로 한정된 크기만을 그려놓고 그것을 재활용한다
        class ViewHolder {
            public TextView textView = null;
            // 재활용 될 뷰를 저장해 두는 역할
        }
    }
}

