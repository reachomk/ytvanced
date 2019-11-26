package com.google.android.apps.youtube.app.application;

import android.content.Intent;
import defpackage.acjm;
import defpackage.dss;
import defpackage.eih;
import defpackage.xtl;

public class Shell$LiveCreationActivity extends dss {
    public eih h;

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        return 500;
    }

    /* Access modifiers changed, original: protected|final */
    public final Class d() {
        return this.h.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(boolean z) {
        Intent intent = getIntent();
        if (acjm.a(intent)) {
            return true;
        }
        String valueOf = String.valueOf(intent);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 15);
        stringBuilder.append("Invalid intent ");
        stringBuilder.append(valueOf);
        xtl.c(stringBuilder.toString());
        return false;
    }
}
