package defpackage;

import android.content.Context;

/* renamed from: agbm */
final /* synthetic */ class agbm implements Runnable {
    private final agbk a;
    private final afpt b;

    agbm(agbk agbk, afpt afpt) {
        this.a = agbk;
        this.b = afpt;
    }

    public final void run() {
        agbk agbk = this.a;
        afpt afpt = this.b;
        Context context = agbk.a;
        xmc xmc = agbk.b;
        String a = afpt.a();
        context.deleteDatabase(agak.c(a));
        agpi.a(context, xmc, a);
    }
}
