package com.google.android.apps.youtube.app.settings;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.view.View;
import android.widget.ListView;
import com.google.android.apps.youtube.app.settings.SettingsActivity.SettingsActivityComponent;
import defpackage.acwa;
import defpackage.acwl;
import defpackage.ajxl;
import defpackage.alcs;
import defpackage.eud;
import defpackage.eue;
import defpackage.euf;
import defpackage.xci;
import defpackage.xse;

public class NotificationPrefsFragment extends PreferenceFragment implements eud {
    public acwa a;
    public alcs b;
    public xci c;
    private ajxl d;

    public final void onCreate(Bundle bundle) {
        ((SettingsActivityComponent) xse.a(getActivity())).inject(this);
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("youtube");
        this.a.t().a(acwl.Z, null, null);
    }

    public final void onDestroy() {
        super.onDestroy();
        a("daily_digest_notification_preference");
        a("quiet_hours_notification_preference");
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((eue) getActivity()).a((eud) this);
    }

    public final void a() {
        if (isAdded()) {
            eue eue = (SettingsActivity) getActivity();
            this.d = eue.f();
            if (this.d != null) {
                euf.a(eue, eue.g());
                this.b.a((PreferenceFragment) this, this.d.b);
                if (this.d.c) {
                    View view = getView();
                    if (view != null) {
                        ListView listView = (ListView) view.findViewById(16908298);
                        if (listView != null) {
                            listView.setDivider(null);
                        }
                    }
                }
            }
        }
    }

    private final void a(CharSequence charSequence) {
        Preference findPreference = findPreference(charSequence);
        if (findPreference != null) {
            getPreferenceScreen().removePreference(findPreference);
        }
    }
}
