package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aifn */
final /* synthetic */ class aifn implements Runnable {
    private final aifl a;
    private final ajmv b;
    private final ajjg c;

    aifn(aifl aifl, ajmv ajmv, ajjg ajjg) {
        this.a = aifl;
        this.b = ajmv;
        this.c = ajjg;
    }

    public final void run() {
        aifl aifl = this.a;
        ajmv ajmv = this.b;
        ajjg ajjg = this.c;
        aifi aifi = aifl.a;
        aifi.getClass();
        aifo aifo = new aifo(aifi);
        List arrayList = new ArrayList();
        if (!ajjg.a.isEmpty()) {
            int i = 0;
            while (i < ajjg.a.size() - 1) {
                int i2 = i + 1;
                arrayList.add(new ajit(((Long) ajjg.a.get(i)).longValue(), ((Long) ajjg.a.get(i2)).longValue(), ajjg.a(((Long) ajjg.a.get(i)).longValue()), aifo));
                i = i2;
            }
            List list = ajjg.a;
            arrayList.add(new ajit(((Long) list.get(list.size() - 1)).longValue(), Long.MAX_VALUE, new ArrayList(), aifo));
        }
        ajmv.a(arrayList);
    }
}
