package defpackage;

import java.util.List;

/* renamed from: acfw */
final /* synthetic */ class acfw implements Runnable {
    private final askc a;
    private final acfg b;
    private final String c;
    private final String d;
    private final List e;

    acfw(askc askc, acfg acfg, String str, String str2, List list) {
        this.a = askc;
        this.b = acfg;
        this.c = str;
        this.d = str2;
        this.e = list;
    }

    public final void run() {
        askc askc = this.a;
        this.b.a(this.c, this.d, askc.a == 141258672 ? (avbq) askc.b : null, this.e);
    }
}
