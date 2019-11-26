package defpackage;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: aemb */
final class aemb extends xto {
    private final /* synthetic */ aema a;

    aemb(aema aema, String str) {
        this.a = aema;
        super(str);
    }

    public final /* synthetic */ Object a() {
        aaje aaje = this.a.g;
        int i = 4;
        if (aaje != null && aaje.b() > 0) {
            i = this.a.g.b();
        }
        return new ScheduledThreadPoolExecutor(i, new xaf(0, "onesie_controller_critical"));
    }
}
