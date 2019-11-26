package defpackage;

import java.util.concurrent.Callable;

/* renamed from: tuh */
final /* synthetic */ class tuh implements Callable {
    private final tuc a;
    private final bcab b;
    private final boolean c = true;

    tuh(tuc tuc, bcab bcab) {
        this.a = tuc;
        this.b = bcab;
    }

    public final Object call() {
        return this.a.a(this.b, this.c);
    }
}
