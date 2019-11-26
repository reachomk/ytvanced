package defpackage;

import java.util.Map;

/* renamed from: fxj */
final /* synthetic */ class fxj implements Runnable {
    private final fxk a;
    private final aowj b;
    private final Map c;

    fxj(fxk fxk, aowj aowj, Map map) {
        this.a = fxk;
        this.b = aowj;
        this.c = map;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
