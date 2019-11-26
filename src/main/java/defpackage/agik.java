package defpackage;

import java.util.List;

/* renamed from: agik */
final class agik implements agfa {
    private final /* synthetic */ agif a;

    public final void a(List list) {
        int size = this.a.e().a().size();
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            String str = (String) list.get(i);
            this.a.d(str);
            this.a.b(str);
        }
        if (size > 0 && this.a.a().size() == 0) {
            for (agih b : this.a.h) {
                b.b();
            }
        }
    }

    /* synthetic */ agik(agif agif) {
        this.a = agif;
    }
}
