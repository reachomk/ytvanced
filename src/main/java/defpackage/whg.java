package defpackage;

import android.net.Uri;

/* renamed from: whg */
final /* synthetic */ class whg implements Runnable {
    private final whd a;
    private final String b;
    private final String c;
    private final Uri d;

    whg(whd whd, String str, String str2, Uri uri) {
        this.a = whd;
        this.b = str;
        this.c = str2;
        this.d = uri;
    }

    public final void run() {
        this.a.b(this.b, this.c, this.d);
    }
}
