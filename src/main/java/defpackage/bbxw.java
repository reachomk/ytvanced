package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bbxw */
public final class bbxw extends AtomicLong implements ThreadFactory {
    public static final long serialVersionUID = -7789753024099756196L;
    private final String a;
    private final int b;
    private final boolean c;

    public bbxw(String str) {
        this(str, 5, false);
    }

    public bbxw(String str, int i) {
        this(str, i, false);
    }

    public bbxw(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final Thread newThread(Runnable runnable) {
        Thread bbxv;
        StringBuilder stringBuilder = new StringBuilder(this.a);
        stringBuilder.append('-');
        stringBuilder.append(incrementAndGet());
        String stringBuilder2 = stringBuilder.toString();
        if (this.c) {
            bbxv = new bbxv(runnable, stringBuilder2);
        } else {
            bbxv = new Thread(runnable, stringBuilder2);
        }
        bbxv.setPriority(this.b);
        bbxv.setDaemon(true);
        return bbxv;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RxThreadFactory[");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
