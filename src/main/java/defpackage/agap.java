package defpackage;

import android.os.Looper;

/* renamed from: agap */
final /* synthetic */ class agap implements Runnable {
    private final agak a;

    agap(agak agak) {
        this.a = agak;
    }

    public final void run() {
        agak agak = this.a;
        xak.a();
        Looper.myQueue().addIdleHandler(new agao(agak));
    }
}
