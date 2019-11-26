package defpackage;

import java.util.List;

/* renamed from: hpf */
final /* synthetic */ class hpf implements Runnable {
    private final wxg a;
    private final String b;
    private final List c;

    hpf(wxg wxg, String str, List list) {
        this.a = wxg;
        this.b = str;
        this.c = list;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
