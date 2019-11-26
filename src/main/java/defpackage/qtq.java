package defpackage;

import android.database.ContentObserver;

/* renamed from: qtq */
final class qtq extends ContentObserver {
    qtq() {
        super(null);
    }

    public final void onChange(boolean z) {
        qtn.c.set(true);
    }
}
