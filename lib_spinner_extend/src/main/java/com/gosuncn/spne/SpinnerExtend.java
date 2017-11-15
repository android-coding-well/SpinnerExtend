package com.gosuncn.spne;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

/**
 * Created by HuWeiJian on 2017/11/15.
 */

public class SpinnerExtend extends android.support.v7.widget.AppCompatSpinner {
    private boolean enableRepeatSelected=true;//是否开启重复选择开关


    public SpinnerExtend(Context context) {
        super(context);
    }

    public SpinnerExtend(Context context, int mode) {
        super(context, mode);
    }

    public SpinnerExtend(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SpinnerExtend(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SpinnerExtend(Context context, AttributeSet attrs, int defStyleAttr, int mode) {
        super(context, attrs, defStyleAttr, mode);
    }

    public SpinnerExtend(Context context, AttributeSet attrs, int defStyleAttr, int mode, Resources.Theme popupTheme) {
        super(context, attrs, defStyleAttr, mode, popupTheme);
    }


    @Override
    public void setSelection(int position, boolean animate) {
        boolean sameSelected = position == getSelectedItemPosition();
        super.setSelection(position, animate);
        if (sameSelected&&enableRepeatSelected&& getOnItemSelectedListener()!=null) {
            // 如果选择项是Spinner当前已选择的项,则 OnItemSelectedListener并不会触发,因此这里手动触发回调
            getOnItemSelectedListener().onItemSelected(this, getSelectedView(), position, getSelectedItemId());
        }
    }

    @Override
    public void setSelection(int position) {
        boolean sameSelected = position == getSelectedItemPosition();
        super.setSelection(position);
        if (sameSelected&&enableRepeatSelected&& getOnItemSelectedListener()!=null) {
            getOnItemSelectedListener().onItemSelected(this, getSelectedView(), position, getSelectedItemId());
        }
    }

    //-----------------------------------------扩展接口--------------------------------------------

    /**
     * 是否开启重复选择监听，默认为true
     * @param repeat
     */
    public void enableRepeatSelected(boolean repeat){
        this.enableRepeatSelected=repeat;
    }


}

