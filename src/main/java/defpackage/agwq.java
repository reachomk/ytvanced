package defpackage;

import java.util.ArrayList;

/* renamed from: agwq */
public final class agwq {
    public agql a;
    public int b = -1;
    public int c = 1;
    private final ArrayList d = new ArrayList();

    public final agwq a(long j) {
        avmz avmz = (avmz) avmw.d.createBuilder();
        int r = this.a.r();
        avmz.copyOnWrite();
        avmw avmw = (avmw) avmz.instance;
        avmw.a |= 1;
        avmw.b = r;
        avmz.copyOnWrite();
        avmw avmw2 = (avmw) avmz.instance;
        avmw2.a |= 2;
        avmw2.c = j;
        this.d.add((avmw) ((anxl) avmz.build()));
        return this;
    }

    public final agwn a() {
        agql agql = this.a;
        if (agql != null) {
            int i = this.b;
            if (i >= 0) {
                int i2 = this.c;
                if (i2 != 1) {
                    ArrayList arrayList = this.d;
                    return new agwn(agql, i, i2, (avmw[]) arrayList.toArray(new avmw[arrayList.size()]), (byte) 0);
                }
            }
        }
        throw new IllegalArgumentException("OfflineStreamVerificationResult.Builder not properly initialized");
    }
}
