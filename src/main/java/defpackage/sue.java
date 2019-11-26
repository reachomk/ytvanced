package defpackage;

import java.util.concurrent.Callable;

/* renamed from: sue */
final /* synthetic */ class sue implements Callable {
    private final baos a;
    private final swm b;

    sue(baos baos, swm swm) {
        this.a = baos;
        this.b = swm;
    }

    public final Object call() {
        return sub.b(this.a, this.b);
    }
}
