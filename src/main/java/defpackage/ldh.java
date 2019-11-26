package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: ldh */
final class ldh extends ContentObserver {
    private final /* synthetic */ lcs a;

    public final void onChange(boolean z) {
        lcs lcs = this.a;
        if (lcs.c()) {
            lcs.e();
        } else if (lcs.g() == 2 && !lcs.f()) {
            lcs.d();
            lcs.a(1);
        }
    }

    /* synthetic */ ldh(lcs lcs, Handler handler) {
        this.a = lcs;
        super(handler);
    }
}
