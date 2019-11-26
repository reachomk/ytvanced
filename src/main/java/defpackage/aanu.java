package defpackage;

import android.content.Intent;

/* renamed from: aanu */
public final class aanu {
    public final Intent a;
    public final Throwable b;

    public static aanu a(Throwable th) {
        return new aanu(null, th);
    }

    public aanu(Intent intent, Throwable th) {
        this.a = intent;
        this.b = th;
    }

    public final boolean a() {
        return this.a != null;
    }
}
