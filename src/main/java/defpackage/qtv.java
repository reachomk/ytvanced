package defpackage;

import android.database.ContentObserver;

/* renamed from: qtv */
final class qtv extends ContentObserver {
    private final /* synthetic */ qtw a;

    qtv(qtw qtw) {
        this.a = qtw;
        super(null);
    }

    public final void onChange(boolean z) {
        qtw qtw = this.a;
        synchronized (qtw.e) {
            qtw.f = null;
        }
        qtw = this.a;
        synchronized (qtw.g) {
            for (qty a : qtw.h) {
                a.a();
            }
        }
    }
}
