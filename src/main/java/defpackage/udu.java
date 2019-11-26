package defpackage;

import android.database.ContentObserver;

/* renamed from: udu */
final class udu extends ContentObserver {
    private final /* synthetic */ uds a;

    udu(uds uds) {
        this.a = uds;
        super(null);
    }

    public final void onChange(boolean z) {
        uds uds = this.a;
        synchronized (uds.c) {
            uds.d = null;
            uee.a();
        }
        synchronized (uds) {
            for (udx a : uds.e) {
                a.a();
            }
        }
    }
}
