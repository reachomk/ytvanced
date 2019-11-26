package defpackage;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: aalq */
public final class aalq implements aalr {
    private final xsc a;
    private final Map b = new ConcurrentHashMap();

    public aalq(xsc xsc) {
        this.a = xsc;
    }

    public final void a(ashy ashy, asic asic) {
        if (asic != null && (asic.a & 65536) != 0) {
            if (ashy != null) {
                asia asia = ashy.f;
                if (asia == null) {
                    asia = asia.g;
                }
                if (asia.f.size() != 0) {
                    Set keySet = this.b.keySet();
                    asia asia2 = ashy.f;
                    if (asia2 == null) {
                        asia2 = asia.g;
                    }
                    keySet.removeAll(asia2.f);
                }
            }
            Map map = this.b;
            Object obj = asic.j;
            if (obj == null) {
                obj = aqjg.c;
            }
            long b = this.a.b();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aqjg aqjg = asic.j;
            if (aqjg == null) {
                aqjg = aqjg.c;
            }
            map.put(obj, Long.valueOf(b + timeUnit.toMillis(aqjg.b)));
        }
    }

    public final asib a(asib asib) {
        if (!(this.b.isEmpty() || asib == null)) {
            asid asid = (asid) ((anxo) asib.c().toBuilder());
            asid.copyOnWrite();
            ((asia) asid.instance).f = anxl.emptyProtobufList();
            for (Entry entry : this.b.entrySet()) {
                if (((Long) entry.getValue()).longValue() <= this.a.b()) {
                    this.b.remove(entry.getKey());
                } else {
                    aqjg aqjg = (aqjg) entry.getKey();
                    asid.copyOnWrite();
                    asia asia = (asia) asid.instance;
                    if (aqjg != null) {
                        if (!asia.f.a()) {
                            asia.f = anxl.mutableCopy(asia.f);
                        }
                        asia.f.add(aqjg);
                    } else {
                        throw new NullPointerException();
                    }
                }
            }
            asib.a(asid);
        }
        return asib;
    }
}
