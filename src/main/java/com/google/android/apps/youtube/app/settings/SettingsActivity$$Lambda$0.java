package com.google.android.apps.youtube.app.settings;

import defpackage.xao;
import defpackage.xtl;

final /* synthetic */ class SettingsActivity$$Lambda$0 implements xao {
    public static final xao $instance = new SettingsActivity$$Lambda$0();

    private SettingsActivity$$Lambda$0() {
    }

    public final void accept(Object obj) {
        xtl.b("Failed to load get_settings response", (Throwable) obj);
    }

    public final void accept(Throwable th) {
        xtl.b("Failed to load get_settings response", th);
    }
}
