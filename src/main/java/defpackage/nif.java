package defpackage;

import android.text.TextUtils;

/* renamed from: nif */
final class nif implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ int b;
    private final /* synthetic */ nid c;

    nif(nid nid, String str, int i) {
        this.c = nid;
        this.a = str;
        this.b = i;
    }

    public final void run() {
        mmv mmv = this.c.b;
        String str = this.a;
        int i = this.b;
        mmv.a();
        if (TextUtils.isEmpty(str)) {
            mmv.a(3);
            return;
        }
        mmv.e = new mna(mmv, str, i);
        mmv.e.g();
    }
}
