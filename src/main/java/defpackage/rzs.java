package defpackage;

import android.database.ContentObserver;

/* renamed from: rzs */
final class rzs extends ContentObserver {
    private final /* synthetic */ rzu a;

    rzs(rzu rzu) {
        this.a = rzu;
        super(null);
    }

    public final void onChange(boolean z) {
        this.a.c.set(true);
    }
}
