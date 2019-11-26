package defpackage;

import java.util.concurrent.Callable;

/* renamed from: svf */
final /* synthetic */ class svf implements Callable {
    private final svd a;
    private final String b;

    svf(svd svd, String str) {
        this.a = svd;
        this.b = str;
    }

    public final Object call() {
        return this.a.b(this.b);
    }
}
