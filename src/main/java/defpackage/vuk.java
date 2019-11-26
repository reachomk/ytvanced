package defpackage;

import android.net.Uri;

/* renamed from: vuk */
final /* synthetic */ class vuk implements Runnable {
    private final vul a;
    private final Uri b;
    private final afqy c;
    private final aojo d;

    vuk(vul vul, Uri uri, afqy afqy, aojo aojo) {
        this.a = vul;
        this.b = uri;
        this.c = afqy;
        this.d = aojo;
    }

    public final void run() {
        vul vul = this.a;
        Uri uri = this.b;
        afqy afqy = this.c;
        aojo aojo = this.d;
        String.valueOf(uri).length();
        afqy.a(new vuj(aojo.d));
        afqy.e = aojo.e;
        aage aage = vul.b;
        if (aage != null) {
            afqy.f = aage.b();
        }
        vui vui = vul.a;
        bqk bqk = aftp.a;
        if (afqy.j.a(aulc.VISITOR_ID)) {
            vui.a.a(afqy, bqk);
        } else {
            vui.a(afqy, bqk);
        }
    }
}
