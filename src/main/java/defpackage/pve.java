package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: pve */
final class pve extends pvi {
    private final ArrayList a;
    private final /* synthetic */ puy b;

    public pve(puy puy, ArrayList arrayList) {
        this.b = puy;
        super(puy);
        this.a = arrayList;
    }

    public final void a() {
        Set emptySet;
        puy puy = this.b;
        pvk pvk = puy.a.m;
        pyp pyp = puy.k;
        if (pyp == null) {
            emptySet = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(pyp.b);
            Map map = puy.k.d;
            for (pso pso : map.keySet()) {
                if (!puy.a.g.containsKey(pso.b())) {
                    hashSet.addAll(((pyr) map.get(pso)).a);
                }
            }
            emptySet = hashSet;
        }
        pvk.g = emptySet;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            psw psw = (psw) obj;
            puy puy2 = this.b;
            psw.a(puy2.h, puy2.a.m.g);
        }
    }
}
