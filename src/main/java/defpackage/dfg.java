package defpackage;

import java.util.List;

/* renamed from: dfg */
public final class dfg implements dfa {
    private final dfa a;

    public dfg(dfa dfa) {
        this.a = dfa;
    }

    public final List a(der der) {
        return this.a.a(der);
    }

    public final List a(dfc dfc) {
        return this.a.a(dfc);
    }

    public static void a(List list) {
        if (list != null) {
            throw new dfj("JobParameters is invalid", list);
        }
    }
}
