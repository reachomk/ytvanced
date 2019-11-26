package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: agcz */
final class agcz implements agfa {
    private final /* synthetic */ agci a;

    public final void a(List list) {
        agfi agfi = (agfi) this.a.m.get();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            this.a.n(str);
            agfi.a(str, Collections.emptySet());
        }
    }

    /* synthetic */ agcz(agci agci) {
        this.a = agci;
    }
}
