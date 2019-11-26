package defpackage;

import android.net.Uri;

/* renamed from: giz */
final /* synthetic */ class giz implements Runnable {
    private final giw a;
    private final Uri b;
    private final bacz c;

    giz(giw giw, Uri uri, bacz bacz) {
        this.a = giw;
        this.b = uri;
        this.c = bacz;
    }

    public final void run() {
        giw giw = this.a;
        giw.a.a(this.b, new gja(giw, this.c));
    }
}
