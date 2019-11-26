package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: afyt */
public final class afyt implements agxf {
    private static final long a = TimeUnit.HOURS.toSeconds(4);
    private final agvs b;
    private final wya c;

    public afyt(wya wya, agvs agvs) {
        this.b = (agvs) amqw.a((Object) agvs);
        this.c = (wya) amqw.a((Object) wya);
    }

    public final void a(String str, boolean z) {
        Bundle a = afyv.a(str);
        a.putBoolean("forceSync", z);
        this.c.a("offline_pas", 0, 1, true, 1, false, a, null, true, false);
    }

    public final void a(String str, long j) {
        wya wya = this.c;
        long j2 = a;
        wya.a("offline_pas", j + j2, j2, true, 1, true, afyv.a(str), afyv.a, true);
        this.b.b(str, j);
    }

    public final void a(String str) {
        long b = this.b.b(str);
        if (b > 0) {
            wya wya = this.c;
            long j = a;
            wya.a("offline_pas", b + j, j, false, 1, true, afyv.a(str), afyv.a, true);
        }
    }

    public final void a() {
        this.c.a("offline_pas");
    }

    public final void b(String str) {
        a();
        this.b.b(str, 0);
    }
}
