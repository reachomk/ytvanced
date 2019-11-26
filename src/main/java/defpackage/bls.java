package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bls */
public final class bls {
    public final List a;
    public final List b;
    public final List c;

    public bls(List list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(((bng) list.get(i)).a.a());
            this.b.add(((bng) list.get(i)).b.a());
        }
    }
}
