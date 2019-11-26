package defpackage;

import java.util.Set;

/* renamed from: aacw */
public final /* synthetic */ class aacw implements Runnable {
    private final aacx a;
    private final int b;

    public aacw(aacx aacx, int i) {
        this.a = aacx;
        this.b = i;
    }

    public final void run() {
        aacx aacx = this.a;
        int i = this.b;
        for (aacy a : (Set) aacx.a.get()) {
            a.a(new aacu(i));
        }
    }
}
