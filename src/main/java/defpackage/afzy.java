package defpackage;

import java.util.concurrent.Callable;

/* renamed from: afzy */
final /* synthetic */ class afzy implements Callable {
    private final afzs a;
    private final String b;

    afzy(afzs afzs, String str) {
        this.a = afzs;
        this.b = str;
    }

    public final Object call() {
        return this.a.d(this.b);
    }
}
