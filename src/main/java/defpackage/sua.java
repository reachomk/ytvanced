package defpackage;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

/* renamed from: sua */
final /* synthetic */ class sua implements Callable {
    private final bdgm a;
    private final swm b;

    sua(bdgm bdgm, swm swm) {
        this.a = bdgm;
        this.b = swm;
    }

    public final Object call() {
        bdgv bdgv;
        bdgm bdgm = this.a;
        swm swm = this.b;
        bdgt bdgt = bdgm.d;
        if (bdgt == null) {
            bdgv = stx.a;
        } else {
            bdgv = (bdgv) szb.a(bdgt, bdgv.a);
        }
        if (bdgv == null) {
            bdgv = stx.a;
        }
        bdgs bdgs = bdgm.c;
        if (bdgs == null) {
            return bbzp.e(bdgv);
        }
        String str;
        amuu e = amur.e();
        for (bdgo bdgo : bdgs.a) {
            e.b(bdgo.b, bdgo.c);
        }
        amur b = e.b();
        e = amur.e();
        amxo amxo = (amxo) ((amuw) b.entrySet()).iterator();
        while (amxo.hasNext()) {
            Object obj;
            Entry entry = (Entry) amxo.next();
            str = (String) entry.getKey();
            bdgu a = stx.a(bdgv, (String) entry.getValue());
            if (a != null) {
                bdgx bdgx = a.c;
                if (bdgx.a == 4) {
                    obj = bdgx.b;
                } else {
                    obj = aock.c;
                }
            } else {
                obj = stx.b;
            }
            e.b(str, obj);
        }
        amur b2 = e.b();
        amuw<String> amuw = (amuw) b.keySet();
        Iterable arrayList = new ArrayList(amuw.size());
        for (String str2 : amuw) {
            arrayList.add(swm.b(str2).c(new stz(str2)));
        }
        return bbmi.a(arrayList, new str(b2)).c(new suc(b, bdgv));
    }
}
