package defpackage;

import java.util.ArrayList;

/* renamed from: ent */
public final class ent implements apz {
    private final ArrayList a = new ArrayList(2);

    public final void a(aqj aqj) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((apz) arrayList.get(i)).a(aqj);
        }
    }

    public final void a(apz apz) {
        this.a.add(apz);
    }

    public final void b(apz apz) {
        this.a.remove(apz);
    }
}
