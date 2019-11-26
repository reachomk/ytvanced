package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: stj */
public class stj {
    public static final byte[] a = new byte[0];

    public static bbmi a(baos baos, swm swm, svc svc) {
        return bbmi.a(new stm(baos, swm, svc));
    }

    public static bbmi a(azsx azsx, swm swm) {
        return bbmi.a(new stl(azsx, swm));
    }

    public static bbmi b(azsx azsx, swm swm) {
        anvf anvf = azsx.c;
        if (anvf == null) {
            anvf = azth.a;
        }
        sxq sxq = new sxq(anvf.toByteArray());
        if ((azsx.a & 16) == 0) {
            return bbzp.e(sxq);
        }
        aztd aztd;
        azun azun;
        int i;
        anxp anxp = azsx.d;
        if (anxp == null) {
            anxp = azsz.a;
        }
        anxr access$000 = anxl.checkIsLite(aztd.e);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(aztd.e);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            aztd = (aztd) obj;
        } else {
            aztd = null;
        }
        anxr access$0002 = anxl.checkIsLite(azun.e);
        anxp.a(access$0002);
        if (anxp.h.a(access$0002.d)) {
            access$0002 = anxl.checkIsLite(azun.e);
            anxp.a(access$0002);
            Object b2 = anxp.h.b(access$0002.d);
            if (b2 == null) {
                b2 = access$0002.b;
            } else {
                b2 = access$0002.a(b2);
            }
            azun = (azun) b2;
        } else {
            azun = null;
        }
        amuu e = amur.e();
        if (aztd == null) {
            i = 0;
        } else {
            i = aztd.c;
            amuu e2 = amur.e();
            for (aztf aztf : aztd.b) {
                e2.b(aztf.b, Integer.valueOf(aztf.c));
            }
            e.a(e2.b());
        }
        if (azun != null) {
            if (i != 0) {
                int i2 = azun.b;
                if (i != i2) {
                    int i3 = aztd.c;
                    StringBuilder stringBuilder = new StringBuilder(108);
                    stringBuilder.append("ComponentType localEntitiesConfig.resultField=");
                    stringBuilder.append(i3);
                    stringBuilder.append(", environmentEntitiesConfig.resultField=");
                    stringBuilder.append(i2);
                    throw new sxf(stringBuilder.toString());
                }
            }
            i = azun.b;
            e.a(amur.a("/environment", Integer.valueOf(azun.c)));
        }
        return stj.a(sts.a(sxq), i, e.b(), swm, null);
    }

    static bbmi a(sts sts, int i, amur amur, swm swm, svc svc) {
        if (amur.isEmpty()) {
            return bbzp.e(sts.a(i));
        }
        try {
            amuu e = amur.e();
            HashMap hashMap = new HashMap();
            anwf a = anwf.a(sts.a);
            while (!a.u()) {
                int a2 = a.a();
                int b = aobj.b(a2);
                if (aobj.a(a2) == 2) {
                    hashMap.put(Integer.valueOf(b), a.m());
                } else {
                    a.b(a2);
                }
            }
            amxo amxo = (amxo) ((amuw) amur.entrySet()).iterator();
            while (amxo.hasNext()) {
                Entry entry = (Entry) amxo.next();
                String str = (String) entry.getKey();
                Object obj = (byte[]) hashMap.get(Integer.valueOf(((Integer) entry.getValue()).intValue()));
                if (obj == null) {
                    obj = a;
                }
                e.b(str, obj);
            }
            amur b2 = e.b();
            amuw<String> amuw = (amuw) amur.keySet();
            Iterable arrayList = new ArrayList(amuw.size());
            for (String str2 : amuw) {
                bbnv sto = new sto(str2);
                if (svc == null || !svc.a(str2)) {
                    arrayList.add(swm.b(str2).c(sto));
                } else if (svc.a(str2)) {
                    sxt sxt = (sxt) svc.a.get(str2);
                    bbmi a3 = sxt.a();
                    AtomicReference atomicReference = new AtomicReference();
                    bbmi b3 = new bbvq(new bbvm(new bbvn(atomicReference), a3, atomicReference)).b(bbmi.a(new sxw(sxt)));
                    Object obj2 = sxv.a;
                    bbow.a(obj2, "comparer is null");
                    arrayList.add(new bbtq(b3, bbod.a, obj2).c(sxy.a).c(sto));
                } else {
                    throw new sxf(String.format("Tried to get a non-existent synthetic entity: %s", new Object[]{str2}));
                }
            }
            return bbmi.a(arrayList, new str(b2)).c(new stp(i, amur, sts));
        } catch (IOException e2) {
            throw new sxf("Failed to process default model", e2);
        }
    }
}
