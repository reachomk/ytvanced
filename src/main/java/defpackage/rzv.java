package defpackage;

import android.database.ContentObserver;

/* renamed from: rzv */
final class rzv extends ContentObserver {
    rzv() {
        super(null);
    }

    public final void onChange(boolean z) {
        rzt.d.set(true);
    }
}
