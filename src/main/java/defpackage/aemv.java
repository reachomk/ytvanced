package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aemv */
public final class aemv {
    public static final aahr a;
    public final afgz b;
    public final aeqo c;
    public final xhv d;
    public final aeeu e;
    public final zzl f;
    public final afgs g;
    public final afjc h;
    public final afjv i;
    public final bcaa j;

    public aemv(afgz afgz, aeqo aeqo, xhv xhv, aeeu aeeu, afjv afjv, zzl zzl, afgs afgs, afjc afjc, bcaa bcaa) {
        this.b = (afgz) amqw.a((Object) afgz);
        this.c = (aeqo) amqw.a((Object) aeqo);
        this.d = (xhv) amqw.a((Object) xhv);
        this.e = (aeeu) amqw.a((Object) aeeu);
        this.i = (afjv) amqw.a((Object) afjv);
        this.f = (zzl) amqw.a((Object) zzl);
        this.g = (afgs) amqw.a((Object) afgs);
        this.h = (afjc) amqw.a((Object) afjc);
        this.j = (bcaa) amqw.a((Object) bcaa);
    }

    public static Set a(Set set, Set set2) {
        if (set2.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet(set);
        hashSet.retainAll(set2);
        return hashSet;
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
        for (aahr b : list) {
            arrayList.add(Integer.valueOf(b.b()));
        }
        return arrayList;
    }

    public static List a(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    static {
        aaht aaht = new aaht();
        aaht.a.a(aahv.O);
        a = aaht.a();
    }
}
