package defpackage;

import android.net.Uri;

/* renamed from: vus */
final class vus implements Runnable {
    private final /* synthetic */ Uri a;
    private final /* synthetic */ vut b;

    vus(vut vut, Uri uri) {
        this.b = vut;
        this.a = uri;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
