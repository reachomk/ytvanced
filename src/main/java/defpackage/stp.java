package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: stp */
final class stp implements bbnv {
    private final int a;
    private final amur b;
    private final sts c;

    public stp(int i, amur amur, sts sts) {
        this.a = i;
        this.b = amur;
        this.c = sts;
    }

    public final /* synthetic */ Object a(Object obj) {
        amur amur = (amur) obj;
        amur amur2 = this.b;
        HashMap hashMap = new HashMap();
        amxo amxo = (amxo) ((amuw) amur.entrySet()).iterator();
        while (amxo.hasNext()) {
            Entry entry = (Entry) amxo.next();
            hashMap.put(Integer.valueOf(((Integer) amqw.a((Integer) amur2.get(entry.getKey()))).intValue()), new stn((byte[]) entry.getValue()));
        }
        anwf a = anwf.a(this.c.a);
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        anwm a2 = anwm.a(byteArrayOutputStream);
        while (!a.u()) {
            int a3 = a.a();
            int b = aobj.b(a3);
            int a4 = aobj.a(a3);
            if (a4 == 0) {
                a2.a(b, a.d());
            } else if (a4 == 1) {
                a2.c(b, a.g());
            } else if (a4 == 2) {
                stq stq = (stq) hashMap.remove(Integer.valueOf(b));
                if (stq == null) {
                    a2.a(b, a.l());
                } else {
                    a.b(a3);
                    stq.a(a3, a2);
                }
            } else if (a4 == 5) {
                a2.f(b, a.h());
            }
        }
        for (Entry entry2 : hashMap.entrySet()) {
            ((stq) entry2.getValue()).a((((Integer) entry2.getKey()).intValue() << 3) | 2, a2);
        }
        a2.i();
        return new sts(byteArrayOutputStream.toByteArray()).a(this.a);
    }
}
