package defpackage;

import android.net.Uri;

/* renamed from: ahmm */
public final /* synthetic */ class ahmm implements Runnable {
    private final ahml a;
    private final Uri b;
    private final afsd c;
    private final afpt d;

    public ahmm(ahml ahml, Uri uri, afsd afsd, afpt afpt) {
        this.a = ahml;
        this.b = uri;
        this.c = afsd;
        this.d = afpt;
    }

    public final void run() {
        ahml ahml = this.a;
        Uri uri = this.b;
        afsd afsd = this.c;
        afpt afpt = this.d;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 8);
        stringBuilder.append("Pinging ");
        stringBuilder.append(valueOf);
        xtl.d(stringBuilder.toString());
        afqy a = afqv.a("vss");
        a.a(uri);
        a.e = true;
        a.a(afsd);
        a.h = afpt;
        ahml.b.a(ahml.c, a, ahmp.a);
    }
}
