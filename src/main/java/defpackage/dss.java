package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.application.Shell$LiveCreationActivity;

/* renamed from: dss */
public abstract class dss extends dse {
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
            ((dsk) b()).a((Shell$LiveCreationActivity) this);
        }
    }
}
