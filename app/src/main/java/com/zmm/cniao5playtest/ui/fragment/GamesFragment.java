package com.zmm.cniao5playtest.ui.fragment;

import com.zmm.cniao5playtest.di.component.AppComponent;
import com.zmm.cniao5playtest.di.component.DaggerAppInfoComponent;
import com.zmm.cniao5playtest.di.module.AppInfoModule;
import com.zmm.cniao5playtest.presenter.AppInfoPresenter;
import com.zmm.cniao5playtest.ui.adapter.AppInfoAdapter;

/**
 * Created by Ivan on 16/9/26.
 */

public class GamesFragment extends BaseAppInfoFragment {




    @Override
    public void setupAcitivtyComponent(AppComponent appComponent) {

        DaggerAppInfoComponent.builder().appComponent(appComponent).appInfoModule(new AppInfoModule(this))
                .build().injectGamesFragment(this);
    }

    @Override
    int type() {
        return AppInfoPresenter.GAME;
    }

    @Override
    AppInfoAdapter buildAdapter() {
        return  AppInfoAdapter.builder().showPosition(false).showBrief(true).showCategoryName(true).build();
    }
}

