package com.zht.compute.compute_zht;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zht.compute.compute_zht.databinding.FragmentExchangerateBinding;

/**
 * Created by anne on 2018/12/10.
 */

public class FragmentExchangeRate extends Fragment implements View.OnClickListener{


    private double _2ac=6.8918;
    private double _2cn=0.1451;

    private FragmentExchangerateBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_exchangerate, container, false);
        return binding.getRoot();
    }



    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.b.setOnClickListener(this);
        binding.textView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Editable sour=binding.exchangeSour.getText();
        if(TextUtils.isEmpty(sour)){
            binding.exchangeResult.setText("别闹，填数啊");
            return;
        }

        double sourD=Double.parseDouble(sour.toString());
        switch(view.getId()){
            case R.id.b:
                //美元 转  人民币
                binding.exchangeResult.setText(sourD*_2ac+"");
                break;
            case R.id.textView2:
                //人民币 转  美元
                binding.exchangeResult.setText(sourD*_2cn+"");
                break;
        }
    }
}
