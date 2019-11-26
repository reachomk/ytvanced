package defpackage;

import java.io.PrintStream;
import java.util.Queue;

/* renamed from: bdch */
public final class bdch implements bcuo {
    public static final int c;
    public final Queue a;
    public volatile Object b;

    public static bdch a() {
        if (bddx.a()) {
            return new bdch(c);
        }
        return new bdch();
    }

    public final synchronized void d() {
    }

    private bdch(int i) {
        this.a = new bddj(i);
    }

    public final void b() {
        d();
    }

    bdch() {
        this.a = new bdcu(c);
    }

    public final boolean e() {
        Queue queue = this.a;
        return queue == null || queue.isEmpty();
    }

    public final boolean c() {
        return this.a == null;
    }

    static {
        int i = !bdce.b ? 128 : 16;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                PrintStream printStream = System.err;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to set 'rx.buffer.size' with value ");
                stringBuilder.append(property);
                stringBuilder.append(" => ");
                stringBuilder.append(e.getMessage());
                printStream.println(stringBuilder.toString());
            }
        }
        c = i;
    }
}
