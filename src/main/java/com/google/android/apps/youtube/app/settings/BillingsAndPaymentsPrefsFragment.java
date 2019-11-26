package com.google.android.apps.youtube.app.settings;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.google.android.apps.youtube.app.settings.SettingsActivity.SettingsActivityComponent;
import defpackage.ajqy;
import defpackage.akag;
import defpackage.alcs;
import defpackage.eud;
import defpackage.eue;
import defpackage.euf;
import defpackage.xse;

public class BillingsAndPaymentsPrefsFragment extends PreferenceFragment implements eud {
    public alcs a;

    public final void onCreate(Bundle bundle) {
        ((SettingsActivityComponent) xse.a(getActivity())).inject(this);
        super.onCreate(bundle);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((SettingsActivity) getActivity()).a((eud) this);
    }

    public final void a() {
        if (isAdded()) {
            eue eue = (SettingsActivity) getActivity();
            akag a = eue.a(10048);
            if (a != null) {
                euf.a(eue, ajqy.a(a.a));
                this.a.a((PreferenceFragment) this, a.b);
            }
        }
    }
}
