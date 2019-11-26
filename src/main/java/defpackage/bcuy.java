package defpackage;

import java.io.PrintStream;

/* renamed from: bcuy */
final class bcuy extends bcuz {
    private final PrintStream a;

    bcuy(PrintStream printStream) {
        this.a = printStream;
    }

    /* Access modifiers changed, original: final */
    public final Object a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final void a(Object obj) {
        this.a.println(obj);
    }
}
