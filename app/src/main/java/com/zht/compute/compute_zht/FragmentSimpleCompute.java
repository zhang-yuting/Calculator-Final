package com.zht.compute.compute_zht;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.zht.compute.compute_zht.databinding.FragmentSimplecomputeBinding;

/**
 * Created by anne on 2018/12/10.
 */

public class FragmentSimpleCompute extends Fragment {

    private FragmentSimplecomputeBinding binding;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20;
    private EditText editText;//显示输入的数字
    private String opt = "+";//操作符
    private double n1 = 0.0, n2 = 0.0;//两个操作数
    private TextView textView;//显示算式

    //跟据被选择按钮的id设置监听器
    private View.OnClickListener lisenter = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            editText = binding.editText1;
            textView = binding.textView1;
            String s = editText.getText().toString();//获取字符串
            Button btn =(Button)v;
            try{

                switch(btn.getId())
                {
                    case R.id.button1://1
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 1);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button2://+
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "+";
                        textView.setText(n1 + opt);
                        editText.setText("");
                        break;
                    }
                    case R.id.button3://2
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 2);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button4://操作符=
                    {
                        if(opt == "+")
                        {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 + n2) + "");
                        }
                        else if(opt == "-")
                        {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 - n2) + "");
                        }
                        else if(opt == "*")
                        {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 * n2) + "");
                        }
                        else if(opt == "/")
                        {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            if(n2 == 0)
                            {
                                editText.setText("");
                                textView.setText("除数不能为0");
                                break;
                            }
                            else
                            {
                                textView.setText(n1 + opt + n2 + "=");
                                editText.setText((n1 / n2) + "");
                            }
                        }

                        break;
                    }
                    case R.id.button5://3
                    {
                        editText.setText(editText.getText().toString() + 3);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button6://4
                    {
                        editText.setText(editText.getText().toString() + 4);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button7://5
                    {
                        editText.setText(editText.getText().toString() + 5);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button8://6
                    {
                        editText.setText(editText.getText().toString() + 6);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button9://7
                    {
                        editText.setText(editText.getText().toString() + 7);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button10://8
                    {
                        editText.setText(editText.getText().toString() + 8);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button11://9
                    {
                        editText.setText(editText.getText().toString() + 9);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button12://0
                    {
                        textView.setText(n1 + opt + 10);
                        editText.setText(editText.getText().toString() + 0);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button13://.
                    {
                        String str = editText.getText().toString();
                        if(str.indexOf(".") != -1) //判断字符串中是否已经包含了小数点，如果有就什么也不做
                        {

                        }
                        else //如果没有小数点
                        {
                            if(str.equals("0"))//如果开始为0，
                                editText.setText(("0" + ".").toString());
                            else if(str.equals(""))//如果初时显示为空，就什么也不做
                            {

                            }
                            else
                                editText.setText(str + ".");
                        }
                        break;
                    }
                    case R.id.button14://操作符 /
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "/";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.button15://操作符*
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "*";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.button16://操作符-
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "-";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.button17://genhao
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        if(n1 < 0)
                        {
                            editText.setText("");
                            textView.setText("负数没有平方根");
                        }
                        else
                        {
                            editText.setText(Math.sqrt(n1) + "");
                            textView.setText(n1 + "的平方根是");
                        }

                        break;
                    }
                    case R.id.button18://+/-
                    {
                        String str =editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        if(str.length() > 0)
                            editText.setText(-n1 + "");
                        textView.setText(-n1 + "");
                        break;
                    }
                    case R.id.button19://CE
                    {
                        String str =editText.getText().toString();
                        if(str.length() > 0)
                            editText.setText("");
                        break;
                    }
                    case R.id.button20://<-
                    {
                        String str =editText.getText().toString();
                        if(str.length() > 0)
                            editText.setText(str.substring(0, str.length() - 1));
                        break;
                    }
                    case R.id.buttonSin:{
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(Math.cos(n1) + "");
                        textView.setText("sin"+n1+"是");
                    }
                        break;
                    case R.id.buttonCos:{
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(Math.cos(n1) + "");
                        textView.setText("sin"+n1+"是");
                    }
                        break;
                    case R.id.buttonLog:{
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(Math.log(n1) + "");
                        textView.setText("log"+n1+"是");
                    }
                    break;

                }
            }catch(Exception e){}
        }
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_simplecompute, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //获取按钮的id
        btn1 = binding.button1;
        btn2 =  binding.button2;
        btn3 =  binding.button3;
        btn4 =  binding.button4;
        btn5 =  binding.button5;
        btn6=  binding.button6;
        btn7 =  binding.button7;
        btn8 =  binding.button8;
        btn9 =  binding.button9;
        btn10 =  binding.button10;
        btn11 =  binding.button11;
        btn12 =  binding.button12;
        btn13 =  binding.button13;
        btn14 = binding.button14;
        btn15 =  binding.button15;
        btn16 =  binding.button16;
        btn17 =  binding.button17;
        btn18 =  binding.button18;
        btn19 =  binding.button19;
        btn20 =  binding.button20;

     //为按钮添加监听器
        btn1.setOnClickListener(lisenter);
        btn2.setOnClickListener(lisenter);
        btn3.setOnClickListener(lisenter);
        btn4.setOnClickListener(lisenter);
        btn5.setOnClickListener(lisenter);
        btn6.setOnClickListener(lisenter);
        btn7.setOnClickListener(lisenter);
        btn8.setOnClickListener(lisenter);
        btn9.setOnClickListener(lisenter);
        btn10.setOnClickListener(lisenter);
        btn11.setOnClickListener(lisenter);
        btn12.setOnClickListener(lisenter);
        btn13.setOnClickListener(lisenter);
        btn14.setOnClickListener(lisenter);
        btn15.setOnClickListener(lisenter);
        btn16.setOnClickListener(lisenter);
        btn17.setOnClickListener(lisenter);
        btn18.setOnClickListener(lisenter);
        btn19.setOnClickListener(lisenter);
        btn20.setOnClickListener(lisenter);
        binding.buttonCos.setOnClickListener(lisenter);
        binding.buttonSin.setOnClickListener(lisenter);
        binding.buttonLog.setOnClickListener(lisenter);
    }
}
