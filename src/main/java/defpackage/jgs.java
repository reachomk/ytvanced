package defpackage;

import android.content.ContentResolver;
import android.provider.Settings.System;

/* renamed from: jgs */
final class jgs implements exv {
    private final /* synthetic */ ContentResolver a;
    private final /* synthetic */ jgp b;

    jgs(jgp jgp, ContentResolver contentResolver) {
        this.b = jgp;
        this.a = contentResolver;
    }

    public final void a() {
        this.a.registerContentObserver(System.CONTENT_URI, true, this.b);
        this.b.a();
    }

    public final void b() {
        this.a.unregisterContentObserver(this.b);
    }
}
