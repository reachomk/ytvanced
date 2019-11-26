package defpackage;

import android.util.Pair;

/* renamed from: agrr */
public abstract class agrr implements aixi {
    private final agtl a;

    agrr(agtl agtl) {
        this.a = agtl;
    }

    public abstract anjv b(aiqq aiqq);

    public final Pair a(aiqq aiqq, String str, aiqw aiqw) {
        return new Pair(this.a.a(aiqq), b(aiqq));
    }

    public final anjv a(aiqq aiqq) {
        return b(aiqq);
    }

    public final anjv a(String str, aiqq aiqq, aiqw aiqw) {
        return this.a.a(aiqq);
    }

    public final anjv a(aiqq aiqq, String str, int i, aiqw aiqw) {
        return this.a.b(aiqq);
    }
}
