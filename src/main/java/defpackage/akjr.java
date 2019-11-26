package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: akjr */
final class akjr extends ContentObserver {
    private final /* synthetic */ bbmh a;
    private final /* synthetic */ akjn b;

    akjr(akjn akjn, Handler handler, bbmh bbmh) {
        this.b = akjn;
        this.a = bbmh;
        super(handler);
    }

    public final void onChange(boolean z) {
        this.a.a(this.b.c());
    }
}
