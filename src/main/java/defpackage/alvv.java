package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: alvv */
public final class alvv extends alvp {
    private static final long a = TimeUnit.MINUTES.toSeconds(2);
    private long b;
    private boolean c = false;
    private final afoj d;
    private final xsc e;

    public alvv(afoj afoj, xsc xsc) {
        this.d = (afoj) amqw.a((Object) afoj);
        this.e = (xsc) amqw.a((Object) xsc);
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean a(Context context, aycm aycm) {
        long a = this.e.a();
        afoj afoj = this.d;
        amxo amxo = (amxo) ((amuw) afoj.a.keySet()).iterator();
        long j = -1;
        while (amxo.hasNext()) {
            j = Math.max(afoj.a((String) amxo.next()), j);
        }
        boolean z = false;
        if (j != -1) {
            if (a - j >= this.b) {
                afoj afoj2 = this.d;
                Map hashMap = new HashMap();
                amxo amxo2 = (amxo) ((amuw) afoj2.a.keySet()).iterator();
                while (amxo2.hasNext()) {
                    String str = (String) amxo2.next();
                    aque b = afoj2.b(str, a);
                    if (b != null) {
                        hashMap.put(str, b);
                    }
                }
                if (hashMap.size() == 0) {
                    hashMap = null;
                }
                if (!(hashMap == null || hashMap.size() == 0)) {
                    aycm.copyOnWrite();
                    ((aycn) aycm.instance).g = anxl.emptyProtobufList();
                    Collection values = hashMap.values();
                    aycm.copyOnWrite();
                    aycn aycn = (aycn) aycm.instance;
                    if (!aycn.g.a()) {
                        aycn.g = anxl.mutableCopy(aycn.g);
                    }
                    anvf.addAll(values, aycn.g);
                    for (String str2 : hashMap.keySet()) {
                        this.d.b(str2);
                        this.d.a(str2, this.e.a());
                    }
                    z = true;
                }
            }
            return z;
        }
        afoj afoj3 = this.d;
        amxo = (amxo) ((amuw) afoj3.a.keySet()).iterator();
        while (amxo.hasNext()) {
            afoj3.b((String) amxo.next());
        }
        afoj3 = this.d;
        amxo = (amxo) ((amuw) afoj3.a.keySet()).iterator();
        while (amxo.hasNext()) {
            afoj3.a((String) amxo.next(), a);
        }
        return false;
    }

    public final void a(aydm aydm) {
        if (aydm != null && (aydm.a & 256) != 0) {
            long toMillis;
            aydc aydc = aydm.f;
            if (aydc == null) {
                aydc = aydc.d;
            }
            this.c = aydc.b;
            aydc = aydm.f;
            if (aydc == null) {
                aydc = aydc.d;
            }
            if (((long) aydc.c) <= a) {
                toMillis = TimeUnit.SECONDS.toMillis(a);
            } else {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                aydc aydc2 = aydm.f;
                if (aydc2 == null) {
                    aydc2 = aydc.d;
                }
                toMillis = timeUnit.toMillis((long) aydc2.c);
            }
            this.b = toMillis;
        }
    }
}
