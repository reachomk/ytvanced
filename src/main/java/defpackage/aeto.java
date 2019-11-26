package defpackage;

import java.util.Map;

/* renamed from: aeto */
final /* synthetic */ class aeto implements Runnable {
    private final aetp a;
    private final int b;
    private final Map c;

    aeto(aetp aetp, int i, Map map) {
        this.a = aetp;
        this.b = i;
        this.c = map;
    }

    public final void run() {
        aetp aetp = this.a;
        int i = this.b;
        Map map = this.c;
        if (i == aetp.b.get()) {
            aetp.a.a(map);
        }
    }
}
