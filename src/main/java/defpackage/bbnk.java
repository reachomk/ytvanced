package defpackage;

import java.io.PrintStream;

/* renamed from: bbnk */
final class bbnk extends bbnh {
    private final PrintStream a;

    bbnk(PrintStream printStream) {
        this.a = printStream;
    }

    /* Access modifiers changed, original: final */
    public final void a(Object obj) {
        this.a.println(obj);
    }
}
