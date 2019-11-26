package defpackage;

import java.util.concurrent.Callable;

/* renamed from: wyk */
final /* synthetic */ class wyk implements Callable {
    private final wyl a;

    wyk(wyl wyl) {
        this.a = wyl;
    }

    public final Object call() {
        wyl wyl = this.a;
        synchronized (wyl) {
            if (wyl.c == null) {
            } else {
                wyl.c();
                if (wyl.b()) {
                    wyl.a();
                    wyl.d = 0;
                }
            }
        }
        return null;
    }
}
