package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: agup */
final /* synthetic */ class agup implements Runnable {
    private final wxg a;
    private final agvz b;
    private final String c;

    agup(wxg wxg, agvz agvz, String str) {
        this.a = wxg;
        this.b = agvz;
        this.c = str;
    }

    public final void run() {
        int i;
        agqp agqp;
        wxg wxg = this.a;
        agvz agvz = this.b;
        aguu aguu = new aguu(this.c, new agun());
        ArrayList arrayList = new ArrayList();
        for (agqy agqy : agvz.k().a()) {
            if (!agqy.i()) {
                arrayList.add(agqy.a);
            }
        }
        ArrayList arrayList2 = aguu.c;
        arrayList2.ensureCapacity(arrayList2.size() + arrayList.size());
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            agqp = (agqp) arrayList.get(i);
            if (!aguu.e.containsKey(agqp)) {
                aguu.e.put(agqp, Integer.valueOf(aguu.b.a(aguu.a, agqp)));
                aguu.c.add(agqp);
            }
        }
        aguu.c.trimToSize();
        List<agqi> d = agvz.n().d();
        arrayList = aguu.d;
        arrayList.ensureCapacity(arrayList.size() + d.size());
        for (agqi agqi : d) {
            if (!aguu.e.containsKey(agqi)) {
                aguu.e.put(agqi, Integer.valueOf(aguu.b.a(aguu.a, agqi)));
                aguu.d.add(agqi);
            }
        }
        aguu.d.trimToSize();
        Object arrayList3 = new ArrayList(aguu.c.size() + aguu.d.size());
        arrayList = aguu.c;
        size = arrayList.size();
        for (i = 0; i < size; i++) {
            agqp = (agqp) arrayList.get(i);
            if (((Integer) aguu.e.get(agqp)).intValue() > 0) {
                arrayList3.add(agqp);
            }
        }
        arrayList = aguu.d;
        size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            agqi agqi2 = (agqi) arrayList.get(i2);
            if (((Integer) aguu.e.get(agqi2)).intValue() > 0) {
                arrayList3.add(agqi2);
            }
        }
        arrayList3.trimToSize();
        Collections.sort(arrayList3, aguu.f);
        wxg.a(null, arrayList3);
    }
}
