package defpackage;

import java.util.Queue;

/* renamed from: bzn */
public final class bzn {
    private static final Queue a = chv.a(0);
    private int b;
    private int c;
    private Object d;

    public static bzn a(Object obj) {
        bzn bzn;
        synchronized (a) {
            bzn = (bzn) a.poll();
        }
        if (bzn == null) {
            bzn = new bzn();
        }
        bzn.d = obj;
        bzn.c = 0;
        bzn.b = 0;
        return bzn;
    }

    private bzn() {
    }

    public final void a() {
        synchronized (a) {
            a.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bzn) {
            if (this.d.equals(((bzn) obj).d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
