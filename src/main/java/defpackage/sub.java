package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map.Entry;

/* renamed from: sub */
public final class sub {
    private static final byte[] a = new byte[0];

    public static bbmi a(baos baos, swm swm) {
        return bbmi.a(new sue(baos, swm));
    }

    public static bbmi b(baos baos, swm swm) {
        aztl aztl;
        if (baos.c() > 0) {
            byte[] bArr = new byte[baos.c()];
            baos.d().get(bArr);
            try {
                azth azth = (azth) anxl.parseFrom(azth.a, bArr, anxa.c());
                anxr access$000 = anxl.checkIsLite(aztl.c);
                azth.a(access$000);
                Object b = azth.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                aztl = (aztl) b;
            } catch (anyg e) {
                throw new sxf("Invalid ComponentType.model", e);
            }
        }
        aztl = aztl.b;
        if (baos.b() == null) {
            return bbzp.e(sxq.a(aztl));
        }
        amur amur;
        amuu e2;
        String str;
        bapl b2 = baos.b();
        if (b2 == null) {
            amur = amwm.a;
        } else {
            e2 = amur.e();
            int i = 0;
            while (true) {
                int a = b2.a(4);
                if (i >= (a != 0 ? b2.d(a) : 0)) {
                    break;
                }
                anrc baoy = new baoy();
                int a2 = b2.a(4);
                if (a2 != 0) {
                    a2 = b2.b(b2.e(a2) + (i << 2));
                    ByteBuffer byteBuffer = b2.b;
                    baoy.a = a2;
                    baoy.b = byteBuffer;
                    a2 -= baoy.b.getInt(a2);
                    baoy.c = a2;
                    baoy.d = baoy.b.getShort(a2);
                } else {
                    baoy = null;
                }
                int a3 = baoy.a(4);
                Object c = a3 != 0 ? baoy.c(a3 + baoy.a) : null;
                a2 = baoy.a(6);
                e2.b(c, a2 != 0 ? baoy.c(a2 + baoy.a) : null);
                i++;
            }
            amur = e2.b();
        }
        e2 = amur.e();
        amxo amxo = (amxo) ((amuw) amur.entrySet()).iterator();
        while (amxo.hasNext()) {
            Entry entry = (Entry) amxo.next();
            String str2 = (String) entry.getKey();
            str = (String) entry.getValue();
            if (str != null) {
                Object d;
                anyy anyy = aztl.a;
                aztm aztm = anyy.containsKey(str) ? (aztm) anyy.get(str) : null;
                if (aztm != null) {
                    anvu anvu;
                    if (aztm.a == 5) {
                        anvu = (anvu) aztm.b;
                    } else {
                        anvu = anvu.a;
                    }
                    d = anvu.d();
                } else {
                    d = a;
                }
                e2.b(str2, d);
            } else {
                throw new NullPointerException();
            }
        }
        amur b3 = e2.b();
        amuw<String> amuw = (amuw) amur.keySet();
        Iterable arrayList = new ArrayList(amuw.size());
        for (String str3 : amuw) {
            arrayList.add(swm.b(str3).c(new sug(str3)));
        }
        return bbmi.a(arrayList, new str(b3)).c(new suf(amur, aztl)).c(sud.a);
    }
}
