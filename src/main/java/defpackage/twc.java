package defpackage;

import android.os.SystemClock;

/* renamed from: twc */
final class twc {
    public final ucy a;
    public final tzu b;
    public final int c;
    private final udc d;
    private final tzu e;

    public final void a(String str, boolean z, bcfe bcfe, bcbb bcbb, String str2) {
        if (bcfe != null) {
            bcfd bcfd = (bcfd) ((anxo) ((twe) this.e.a()).a(bcfe).toBuilder());
            if (z) {
                if (str != null) {
                    bcfd.copyOnWrite();
                    bcfe bcfe2 = (bcfe) bcfd.instance;
                    bcfe2.a |= 65536;
                    bcfe2.q = str;
                } else {
                    bcfd.copyOnWrite();
                    bcfe bcfe3 = (bcfe) bcfd.instance;
                    bcfe3.a &= -65537;
                    bcfe3.q = bcfe.x.q;
                }
            } else if (str == null) {
                bcfd.a();
            } else {
                bcfd.a(str);
            }
            if (bcbb != null) {
                bcfd.a(bcbb);
            }
            if (str2 != null) {
                bcdm bcdm = (bcdm) bcdj.c.createBuilder();
                bcdm.a(str2);
                bcfd.a(bcdm);
            }
            this.d.a((bcfe) ((anxl) bcfd.build()));
            ucy ucy = this.a;
            synchronized (ucy.a) {
                ucy.c++;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - ucy.d > 1000) {
                    ucy.c = 0;
                    ucy.d = elapsedRealtime;
                }
            }
            return;
        }
        str = String.valueOf(str);
        String str3 = "metric is null, skipping recorded metric for event: ";
        tyv.d("MetricRecorder", str.length() == 0 ? new String(str3) : str3.concat(str), new Object[0]);
    }

    twc(udc udc, tzu tzu, tzu tzu2, int i, int i2) {
        this.d = (udc) uhy.a((Object) udc);
        this.e = (tzu) uhy.a((Object) tzu);
        this.b = tzu2;
        this.c = i;
        this.a = new ucy(i2);
    }
}
