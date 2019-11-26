package com.google.android.apps.youtube.app.settings;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.google.android.apps.youtube.app.settings.SettingsActivity.SettingsActivityComponent;
import defpackage.aaey;
import defpackage.akag;
import defpackage.alcs;
import defpackage.eud;
import defpackage.iyy;
import defpackage.iyz;
import defpackage.xcx;
import defpackage.xse;

public class AboutPrefsFragment extends PreferenceFragment implements eud, iyz {
    public xcx a;
    public alcs b;
    public iyy c;
    public aaey d;

    public final void onCreate(Bundle bundle) {
        ((SettingsActivityComponent) xse.a(getActivity())).inject(this);
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
    }

    public final void onStart() {
        super.onStart();
        this.a.a();
        this.c.a = this;
    }

    public final void onStop() {
        super.onStop();
        this.a.b();
        this.c.a = null;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((SettingsActivity) getActivity()).a((eud) this);
    }

    public final void a() {
        if (isAdded()) {
            akag a = ((SettingsActivity) getActivity()).a(10009);
            if (a != null) {
                this.b.a((PreferenceFragment) this, a.b);
            }
        }
    }

    public final void b() {
        this.c.a = null;
        this.d.a(getActivity(), "yt_android_settings");
    }
}
