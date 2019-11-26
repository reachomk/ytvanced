package defpackage;

import java.util.concurrent.Callable;

/* renamed from: afzr */
final /* synthetic */ class afzr implements Callable {
    private final afzs a;

    afzr(afzs afzs) {
        this.a = afzs;
    }

    public final Object call() {
        return this.a.c();
    }
}
