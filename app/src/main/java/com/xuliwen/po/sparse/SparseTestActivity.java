package com.xuliwen.po.sparse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.View;

import com.xuliwen.po.R;
import com.xuliwen.po.utils.L;

import java.util.HashMap;

public class SparseTestActivity extends AppCompatActivity {

    private static final int MAX = 100000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sparse_test);
    }

    public void putHashMap(View view) {
        long start_memory = Runtime.getRuntime().totalMemory();
        long start = System.currentTimeMillis();
        HashMap<Integer, String> hash = new HashMap<>();
        for (int i = 0; i < MAX; i++) {
            //正序插入
           // hash.put(i, String.valueOf(i));

            //倒序插入
            hash.put(MAX - i -1, String.valueOf(i));
        }
        long ts = System.currentTimeMillis() - start;
        long hashMap_memory = Runtime.getRuntime().totalMemory()-start_memory;
        L.l("HashMap put time :"+String.valueOf(ts));
        L.l("HashMap put memory :"+String.valueOf(hashMap_memory));
    }


    public void putSparseArray(View view) {
        long start_memory = Runtime.getRuntime().totalMemory();
        long start = System.currentTimeMillis();
        SparseArray<String> sparse = new SparseArray<>();
        for (int i = 0; i < MAX; i++) {
            //正序插入
           // sparse.put(i, String.valueOf(i));

            //倒序插入
            sparse.put(MAX - i -1, String.valueOf(i));
        }
        long ts = System.currentTimeMillis() - start;
        long sparseArray_memory = Runtime.getRuntime().totalMemory()-start_memory;
        L.l("SparseArray put time :"+String.valueOf(ts));
        L.l("SparseArray put memory :"+String.valueOf(sparseArray_memory));
    }
}
