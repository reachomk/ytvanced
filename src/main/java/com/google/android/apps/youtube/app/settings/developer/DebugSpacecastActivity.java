package com.google.android.apps.youtube.app.settings.developer;

import android.os.Bundle;
import defpackage.dvg;
import defpackage.dvk;
import defpackage.jcg;
import defpackage.xfc;

public class DebugSpacecastActivity extends dvg {
    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        ((jcg) ((xfc) getApplication()).n()).a(new dvk(this)).a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onResume() {
        super.onResume();
        g().a((CharSequence) "Spacecast Debugging");
    }
}
