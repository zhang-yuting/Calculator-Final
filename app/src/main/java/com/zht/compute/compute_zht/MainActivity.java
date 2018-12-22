package com.zht.compute.compute_zht;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zht.compute.compute_zht.databinding.ActivityMainBinding;
import com.zht.compute.compute_zht.databinding.FragmentBinarysystemBinding;
import com.zht.compute.compute_zht.databinding.FragmentExchangerateBinding;
import com.zht.compute.compute_zht.databinding.FragmentSimplecomputeBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private ActivityMainBinding binding;

private AdapterOfCompute adapterOfCompute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil. setContentView(this,R.layout.activity_main);
        binding.goBinarySystem.setOnClickListener(this);
        binding.goExchangeRate.setOnClickListener(this);
        binding.goSimpleCompute.setOnClickListener(this);
        FragmentSimpleCompute simplecomputeBinding=new FragmentSimpleCompute();
        FragmentExchangeRate fragmentBinarysystemBinding=new FragmentExchangeRate();
        FragmentBinarySystem fragmentExchangerateBinding=new FragmentBinarySystem();

        List data=new ArrayList<Fragment>();
        data.add(simplecomputeBinding);
        data.add(fragmentExchangerateBinding);
        data.add(fragmentBinarysystemBinding);

        adapterOfCompute=new AdapterOfCompute(getSupportFragmentManager(),data);
        binding.vp.setAdapter(adapterOfCompute);


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.goBinarySystem:
                binding.vp.setCurrentItem(2);
                break;
            case R.id.goExchangeRate:
                binding.vp.setCurrentItem(1);
                break;
            case R.id.goSimpleCompute:
                binding.vp.setCurrentItem(0);
                break;
        }
    }
}
