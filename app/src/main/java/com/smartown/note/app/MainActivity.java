package com.smartown.note.app;

import com.smartown.library.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void init() {
        jump(R.string.app_name, MainFragment.class);
        finish();
    }

    @Override
    protected void findViews() {

    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void registerViews() {

    }

}
