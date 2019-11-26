package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.application.Shell$SettingsActivity;

/* renamed from: dst */
public abstract class dst extends dse {
    private boolean h = false;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        h();
        super.onCreate(bundle);
    }

    /* Access modifiers changed, original: protected|final */
    public final void h() {
        if (!this.h) {
            this.h = true;
            ((dsl) b()).a((Shell$SettingsActivity) this);
        }
    }
}
