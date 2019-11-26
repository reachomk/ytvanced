package defpackage;

import java.util.Locale;

/* renamed from: aflz */
public final class aflz implements bqk {
    private final bqk a;
    private final afmh b;

    public aflz(bqk bqk, afmh afmh) {
        this.a = (bqk) amqw.a((Object) bqk);
        this.b = (afmh) amqw.a((Object) afmh);
    }

    public final void a(bqn bqn) {
        if (this.b.a() && bqn.b != null) {
            xtl.e(String.format(Locale.US, "Full response from error: %s", new Object[]{new String(r0.b)}));
        }
        this.a.a(bqn);
    }
}
