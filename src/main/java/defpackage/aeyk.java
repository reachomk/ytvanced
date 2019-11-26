package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aeyk */
final /* synthetic */ class aeyk implements Callable {
    private final aeyi a;

    aeyk(aeyi aeyi) {
        this.a = aeyi;
    }

    public final Object call() {
        aeyi aeyi = this.a;
        boolean z = false;
        if (aeyi.c == null) {
            return Boolean.valueOf(false);
        }
        if (aeyi.b.c == null) {
            z = true;
        }
        amqw.b(z);
        aeyi.a(aeyi.b);
        aeyi.b = aeyi.c;
        aeyi.c = null;
        aeyi.b.a(0);
        return Boolean.valueOf(true);
    }
}
