package com.google.android.apps.youtube.app.livechat.settings;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import defpackage.ajqy;
import defpackage.akag;
import defpackage.alcs;
import defpackage.eud;
import defpackage.eue;
import defpackage.euf;
import defpackage.hci;
import defpackage.xse;

public class LiveChatFragment extends PreferenceFragment implements eud {
    public alcs a;

    public final void onCreate(Bundle bundle) {
        ((hci) xse.a(getActivity())).a(this);
        super.onCreate(bundle);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((eue) getActivity()).a((eud) this);
    }

    public final void a() {
        if (isAdded()) {
            eue eue = (eue) getActivity();
            akag a = eue.a(10034);
            if (a != null) {
                euf.a(eue, ajqy.a(a.a));
                this.a.a((PreferenceFragment) this, a.b);
            }
        }
    }
}
