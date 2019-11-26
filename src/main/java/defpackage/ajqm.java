package defpackage;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: ajqm */
public final class ajqm {
    public final TreeMap a = new TreeMap();
    public long b;
    public ajqi c;
    public final bcaa d;
    public final String e;
    private final aakj f;

    public final ajqj a(long j) {
        return a(j, this.b);
    }

    public final ajqj a(long j, long j2) {
        ajnd ajnd = (ajnd) this.d.get();
        boolean z = !this.f.j() && j2 >= TimeUnit.SECONDS.toMillis((long) this.f.h());
        return new ajqj(ajnd, j, j2, z);
    }

    public final void b(long j) {
        if (this.f.j()) {
            this.b = j;
        } else {
            this.b = Math.min(j, TimeUnit.SECONDS.toMillis((long) this.f.h()));
        }
    }

    /* synthetic */ ajqm(ajqi ajqi, bcaa bcaa, long j, String str, aakj aakj) {
        this.c = ajqi;
        this.d = bcaa;
        this.f = aakj;
        this.e = str;
        b(j);
    }
}
