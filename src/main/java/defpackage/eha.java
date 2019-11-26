package defpackage;

import android.net.Uri;

/* renamed from: eha */
public final /* synthetic */ class eha implements Runnable {
    private final egv a;
    private final Uri b;
    private final aule c;

    public eha(egv egv, Uri uri, aule aule) {
        this.a = egv;
        this.b = uri;
        this.c = aule;
    }

    public final void run() {
        egv egv = this.a;
        Uri uri = this.b;
        egv.a(egv.a.b(uri), this.c);
    }
}
