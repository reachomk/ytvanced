package defpackage;

import android.net.Uri;

/* renamed from: fzp */
final class fzp implements afsw {
    private final /* synthetic */ boolean a = true;
    private final /* synthetic */ bdfi b;
    private final /* synthetic */ Uri c;
    private final /* synthetic */ fzm d;

    fzp(fzm fzm, bdfi bdfi, Uri uri) {
        this.d = fzm;
        this.b = bdfi;
        this.c = uri;
    }

    public final void a(bqn bqn) {
        xtl.a("Error loading video", (Throwable) bqn);
        this.d.c.c(bqn);
        this.b.e_(fzv.a(1, this.d.c.a((Throwable) bqn)));
        this.b.bM_();
    }
}
