package defpackage;

import java.util.Map;

/* renamed from: afpk */
final class afpk implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ afpf b;
    private final /* synthetic */ String c;
    private final /* synthetic */ afpi d;
    private final /* synthetic */ int e;

    public final void run() {
        Map a = this.d.a(this.a);
        xvo a2 = this.d.a(this.e, this.b, null);
        a.put("stacktrace.c++", this.c);
        a.put("stacktrace.java", "");
        this.d.a(a2, a);
    }

    afpk(afpi afpi, String str, int i, afpf afpf, String str2) {
        this.d = afpi;
        this.a = str;
        this.e = i;
        this.b = afpf;
        this.c = str2;
    }
}
