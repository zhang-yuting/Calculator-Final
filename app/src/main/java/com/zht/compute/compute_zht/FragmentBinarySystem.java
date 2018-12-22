package com.zht.compute.compute_zht;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.InputType;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zht.compute.compute_zht.databinding.FragmentBinarysystemBinding;


/**
 * Created by anne on 2018/12/10.
 */

public class FragmentBinarySystem extends Fragment{
private String TAG=getClass().getName();
    private FragmentBinarysystemBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_binarysystem, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //2
        binding.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                if(charSequence==null||TextUtils.isEmpty(charSequence.toString()))
                    return;
                char[] list=new char[]{'0','1'};
                //只允许输入0，1
                //是否获取到焦点
                if( binding.editText.hasFocus()&&considerInRange(charSequence.toString(),list)){

                    String _2Str=Integer.parseInt(charSequence.toString(),2)+"";
//                    binding.editText2.setText(Integer.parseInt(charSequence.toString(),8)+"");
//                    binding.editText3.setText(Integer.parseInt(charSequence.toString(),10)+"");
//                    binding.editText4.setText(Integer.parseInt(charSequence.toString(),16)+"");


                    binding.editText2.setText("" + Integer.toOctalString(Integer.parseInt(_2Str))); //十进制转八进制
                    binding.editText3.setText("" + Integer.parseInt(_2Str)) ;//十进制转十进制
                    binding.editText4.setText(""+Integer.toHexString(Integer.parseInt(_2Str)).toUpperCase()); //十进制转十六进制

                }else{
//                    binding.editText.setText();
                }
                Log.e(TAG, "onTextChanged: "+charSequence );
            }

            @Override
            public void afterTextChanged(Editable editable) {

                Log.e(TAG, "afterTextChanged: "+editable );
            }
        });
        //8
        binding.editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence==null||TextUtils.isEmpty(charSequence.toString()))
                    return;
                char[] list=new char[]{'0','1','2','3','4','5','6','7'};
                //只允许输入0，1，2，3，4，5，6，7，8
                //是否获取到焦点
                if( binding.editText2.hasFocus()&&considerInRange(charSequence.toString(),list)){
                    String _2Str=Integer.parseInt(charSequence.toString(),8)+"";

                    binding.editText.setText("" + Integer.toBinaryString(Integer.parseInt(_2Str))); //十进制转二进制
//                    binding.editText2.setText("" + Integer.toOctalString(Integer.parseInt(_2Str))); //十进制转八进制
                    binding.editText3.setText("" + Integer.parseInt(_2Str)) ;//十进制转十进制
                    binding.editText4.setText(""+Integer.toHexString(Integer.parseInt(_2Str)).toUpperCase()); //十进制转十六进制

                }
                Log.e(TAG, "onTextChanged: "+charSequence );
            }

            @Override
            public void afterTextChanged(Editable editable) {

                Log.e(TAG, "afterTextChanged: "+editable );
            }
        });

        //10
        binding.editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence==null||TextUtils.isEmpty(charSequence.toString()))
                    return;
                char[] list=new char[]{'0','1','2','3','4','5','6','7','8',
                        '9'};
                //只允许输入0，1，2，3，4，5，6，7，8，9
                //是否获取到焦点
                if( binding.editText3.hasFocus()&&considerInRange(charSequence.toString(),list)){
                    String _2Str=Integer.parseInt(charSequence.toString(),10)+"";

                    binding.editText.setText("" + Integer.toBinaryString(Integer.parseInt(_2Str))); //十进制转二进制
                    binding.editText2.setText("" + Integer.toOctalString(Integer.parseInt(_2Str))); //十进制转八进制
//                    binding.editText3.setText("" + Integer.parseInt(_2Str)) ;//十进制转十进制
                    binding.editText4.setText(""+Integer.toHexString(Integer.parseInt(_2Str)).toUpperCase()); //十进制转十六进制

                }
                Log.e(TAG, "onTextChanged: "+charSequence );
            }

            @Override
            public void afterTextChanged(Editable editable) {

                Log.e(TAG, "afterTextChanged: "+editable );
            }
        });
        //16
        binding.editText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence==null||TextUtils.isEmpty(charSequence.toString()))
                    return;
                char[] list=new char[]{'0','1','2','3','4','5','6','7','8',
                        '9','A','B','C','D','E','F'};
                //只允许输入0，1，2，3，4，5，6，7，8，9，a,b,c,d,e
                //是否获取到焦点
                if( binding.editText4.hasFocus()&&considerInRange(charSequence.toString(),list)){
                    String _2Str=Integer.parseInt(charSequence.toString(),16)+"";

                    binding.editText.setText("" + Integer.toBinaryString(Integer.parseInt(_2Str))); //十进制转二进制
                    binding.editText2.setText("" + Integer.toOctalString(Integer.parseInt(_2Str))); //十进制转八进制
                    binding.editText3.setText("" + Integer.parseInt(_2Str)) ;//十进制转十进制
//                    binding.editText4.setText(""+Integer.toHexString(Integer.parseInt(_2Str)).toUpperCase()); //十进制转十六进制

                }
                Log.e(TAG, "onTextChanged: "+charSequence );
            }

            @Override
            public void afterTextChanged(Editable editable) {

                Log.e(TAG, "afterTextChanged: "+editable );
            }
        });
    }


    /**
     * 判断传入的字符串是否每个字符都在传入的列表中存在
     * @param str 传入的字符串
     * @param list 参照的字符列表
     * @return 是否每个字符都在传入的列表中存在
     */
    private boolean considerInRange(String str, char[] list){
        //将字符串str变成字符数组，遍历该字符数组
        char[]  chars=str.toUpperCase().toCharArray();
        for (int i=0;i<chars.length;i++){
            char c=chars[i];
            for (int j=0;j< list.length;j++){
                if(list[j]==c)
                    return true;
            }
        }
        return false;
    }
}
