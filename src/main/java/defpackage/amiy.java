package defpackage;

import java.util.concurrent.Callable;

/* renamed from: amiy */
final /* synthetic */ class amiy implements Callable {
    private final amir a;
    private final String b;
    private final amip c;
    private final amjc d;

    amiy(amir amir, String str, amip amip, amjc amjc) {
        this.a = amir;
        this.b = str;
        this.c = amip;
        this.d = amjc;
    }

    public final Object call() {
        return this.a.a(this.b, this.c, this.d);
    }
}
