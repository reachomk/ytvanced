package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: anbe */
public final class anbe implements Closeable {
    private static final anbf a;
    private final anbf b;
    private final Deque c = new ArrayDeque(4);
    private Throwable d;

    public static anbe a() {
        return new anbe(a);
    }

    private anbe(anbf anbf) {
        this.b = (anbf) amqw.a((Object) anbf);
    }

    public final Closeable a(Closeable closeable) {
        if (closeable != null) {
            this.c.addFirst(closeable);
        }
        return closeable;
    }

    public final RuntimeException a(Throwable th) {
        amqw.a((Object) th);
        this.d = th;
        amrs.a(th, IOException.class);
        throw new RuntimeException(th);
    }

    public final void close() {
        Throwable th = this.d;
        while (!this.c.isEmpty()) {
            Closeable closeable = (Closeable) this.c.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th != null) {
                    this.b.a(closeable, th, th2);
                } else {
                    th = th2;
                }
            }
        }
        if (this.d == null && th != null) {
            amrs.a(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    static {
        anbf anbf;
        if (anbg.b == null) {
            anbf = anbd.a;
        } else {
            anbf = anbg.a;
        }
        a = anbf;
    }
}
