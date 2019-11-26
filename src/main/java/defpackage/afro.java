package defpackage;

import java.util.Locale;

/* renamed from: afro */
public final class afro extends afsv {
    private final /* synthetic */ long a;
    private final /* synthetic */ afrm b;

    public afro(afrm afrm, String str, bqk bqk, long j) {
        this.b = afrm;
        this.a = j;
        super(4, str, bqk);
    }

    public final bqh a(bqd bqd) {
        long a = ((xsc) this.b.c.get()).a();
        long j = this.a;
        String.format(Locale.US, "Prewarm took %dms (%d)", new Object[]{Long.valueOf(a - j), Integer.valueOf(bqd.a)});
        return bqh.a(null, null);
    }

    public final bqi d() {
        return bqi.LOW;
    }
}
