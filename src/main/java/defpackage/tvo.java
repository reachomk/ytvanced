package defpackage;

import android.content.IntentFilter;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: tvo */
final class tvo implements ucg {
    private final Map a = new HashMap();
    private final /* synthetic */ tvm b;

    public final void a(String str) {
        tvl tvl = (tvl) this.a.get(str);
        if (tvl == null) {
            tvl = new tvl();
            this.a.put(str, tvl);
        }
        tvl.a++;
    }

    public final void b(String str) {
        tvl tvl = (tvl) this.a.get(str);
        if (tvl == null) {
            tvl = new tvl();
            this.a.put(str, tvl);
        }
        tvl.b++;
    }

    public final void a(boolean z) {
        bceb bceb = (bceb) bcec.b.createBuilder();
        for (Entry entry : this.a.entrySet()) {
            String str = (String) entry.getKey();
            tvl tvl = (tvl) entry.getValue();
            if (tvl.b > 0 || tvl.a > 0) {
                bcef bcef = (bcef) bceg.g.createBuilder();
                bcef.a(str);
                bcef.a(tvl.b);
                int i = tvl.a;
                bcef.copyOnWrite();
                bceg bceg = (bceg) bcef.instance;
                bceg.a |= 2;
                bceg.c = i;
                bceb.a(bcef);
                tvl.b = 0;
                tvl.a = 0;
            }
        }
        if (bceb.a() != 0) {
            bcfd bcfd = (bcfd) bcfe.x.createBuilder();
            bcfd.a(bceb);
            bcfe bcfe = (bcfe) ((anxl) bcfd.build());
            if (this.b.b()) {
                this.b.a(bcfe);
            }
        }
        if (z) {
            tvm tvm = this.b;
            if (tvm.h && !tvm.c) {
                tvm = this.b;
                if (tvm.g || tvm.f) {
                    long j = tvm.i.get();
                    if ((j == 0 || j + 43200000 <= SystemClock.elapsedRealtime()) && this.b.j.compareAndSet(false, true)) {
                        tyv.b("MemoryLeakService", "Scheduling heap dump %d seconds after the next screen off.", Integer.valueOf(5));
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                        intentFilter.addAction("android.intent.action.SCREEN_ON");
                        tvm tvm2 = this.b;
                        tvm2.a.registerReceiver(new tvn(tvm2), intentFilter);
                    }
                }
            }
        }
    }

    public final void a(List list) {
        bceb bceb = (bceb) bcec.b.createBuilder();
        for (ucd ucd : list) {
            String str = ucd.a;
            int indexOf = str.indexOf(10);
            bcef bcef = (bcef) bceg.g.createBuilder();
            bcef.a(indexOf >= 0 ? str.substring(0, indexOf) : str);
            bcef.copyOnWrite();
            bceg bceg = (bceg) bcef.instance;
            bceg.a |= 8;
            bceg.e = str;
            int i = ucd.b;
            bcef.copyOnWrite();
            bceg = (bceg) bcef.instance;
            bceg.a |= 16;
            bceg.f = i;
            bcef.a(1);
            bceb.a(bcef);
        }
        if (bceb.a() != 0) {
            bcfd bcfd = (bcfd) bcfe.x.createBuilder();
            bcfd.a(bceb);
            bcfe bcfe = (bcfe) ((anxl) bcfd.build());
            if (this.b.b()) {
                this.b.a(bcfe);
            }
        }
        if (!list.isEmpty()) {
            tyv.a("MemoryLeakService", "Primes found %d leak(s): %s", Integer.valueOf(list.size()), list);
        }
    }

    /* synthetic */ tvo(tvm tvm) {
        this.b = tvm;
    }
}
