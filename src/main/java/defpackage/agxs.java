package defpackage;

import java.util.Map;

/* renamed from: agxs */
final /* synthetic */ class agxs implements Runnable {
    private final agxp a;
    private final Map b;

    agxs(agxp agxp, Map map) {
        this.a = agxp;
        this.b = map;
    }

    public final void run() {
        agxp agxp = this.a;
        agxp.a.a(this.b);
    }
}
