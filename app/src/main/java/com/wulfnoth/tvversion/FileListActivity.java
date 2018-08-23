package com.wulfnoth.tvversion;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileListActivity extends Activity {

    private List<Map<String, Object>> getGridListData() {
        List<Map<String, Object>> dataList = new ArrayList<>();
        HashMap<String, Object> map = new HashMap<>();
        map.put("img", R.drawable.folder);
        map.put("text", "folder");
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("img", R.drawable.video);
        map1.put("text", "video");
        dataList.add(map);
        dataList.add(map1);
        return dataList;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filelist);

        GridView gridView = findViewById(R.id.gridview);

        String[] from = {"img", "text"};
        int[] to = {R.id.img, R.id.text};

        SimpleAdapter adapter = new SimpleAdapter(this, getGridListData(), R.layout.detail_filelist, from, to);
        gridView.setAdapter(adapter);
    }
}
