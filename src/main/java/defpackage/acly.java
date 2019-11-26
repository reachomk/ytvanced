package defpackage;

import android.net.Uri;

/* renamed from: acly */
final /* synthetic */ class acly implements Runnable {
    private final aclq a;
    private final Uri b;

    acly(aclq aclq, Uri uri) {
        this.a = aclq;
        this.b = uri;
    }

    public final void run() {
        aclq aclq = this.a;
        aclq.ad.a(aclq.am, aclq.ae, this.b, acea.a, new acme(aclq));
    }
}
