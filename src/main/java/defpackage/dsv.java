package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.application.Shell$UrlActivity;

/* renamed from: dsv */
public abstract class dsv extends dse {
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
            ((dsn) b()).a((Shell$UrlActivity) this);
        }
    }
}
