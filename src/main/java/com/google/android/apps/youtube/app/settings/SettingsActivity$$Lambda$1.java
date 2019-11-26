package com.google.android.apps.youtube.app.settings;

import defpackage.abif;
import defpackage.xar;

final /* synthetic */ class SettingsActivity$$Lambda$1 implements xar {
    public final SettingsActivity arg$1;

    SettingsActivity$$Lambda$1(SettingsActivity settingsActivity) {
        this.arg$1 = settingsActivity;
    }

    public final void accept(Object obj) {
        SettingsActivity settingsActivity = this.arg$1;
        abif abif = (abif) obj;
        settingsActivity.e.a(abif);
        if (!abif.equals(settingsActivity.u)) {
            settingsActivity.u = abif;
            settingsActivity.invalidateHeaders();
            abif = settingsActivity.u;
            if (abif != null) {
                settingsActivity.v.a(abif.a.d);
            }
            settingsActivity.t.a();
            settingsActivity.e();
        }
    }
}
