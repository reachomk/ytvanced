package defpackage;

import java.util.Map;

/* renamed from: hps */
public final /* synthetic */ class hps implements Runnable {
    private final hpt a;
    private final Map b;
    private final Map c;
    private final wxg d;

    public hps(hpt hpt, Map map, Map map2, wxg wxg) {
        this.a = hpt;
        this.b = map;
        this.c = map2;
        this.d = wxg;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d);
    }
}
