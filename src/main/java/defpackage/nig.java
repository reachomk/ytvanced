package defpackage;

import android.text.TextUtils;

/* renamed from: nig */
final class nig implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ nid b;

    nig(nid nid, String str) {
        this.b = nid;
        this.a = str;
    }

    public final void run() {
        mmv mmv = this.b.b;
        String str = this.a;
        mmv.a();
        if (TextUtils.isEmpty(str)) {
            mmv.a(3);
            return;
        }
        mmv.e = new mnc(mmv, str);
        mmv.e.g();
    }
}
