package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

/* renamed from: wyu */
final class wyu extends wyt {
    private static wyu b;

    private wyu() {
        super();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(BufferedInputStream bufferedInputStream) {
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Object obj, BufferedOutputStream bufferedOutputStream) {
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public static wyt c() {
        if (b == null) {
            wyu wyu = new wyu();
            wyu.a(wyx.a);
            b = wyu;
        }
        return b;
    }
}
