package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aewn */
public final class aewn implements owt {
    private final afjj a;
    private final Map b = new HashMap();

    public aewn(afjj afjj) {
        this.a = afjj;
    }

    /* JADX WARNING: Missing block: B:35:0x008e, code skipped:
            return;
     */
    public final synchronized void a(defpackage.ovi r7, defpackage.ovm r8, boolean r9) {
        /*
        r6 = this;
        monitor-enter(r6);
        r9 = "/videoplayback";
        r0 = r8.a;	 Catch:{ all -> 0x008f }
        r0 = r0.getPath();	 Catch:{ all -> 0x008f }
        r9 = r9.equals(r0);	 Catch:{ all -> 0x008f }
        if (r9 == 0) goto L_0x008d;
    L_0x000f:
        r9 = r8.a;	 Catch:{ NumberFormatException -> 0x008b }
        r0 = "itag";
        r9 = r9.getQueryParameter(r0);	 Catch:{ NumberFormatException -> 0x008b }
        r9 = java.lang.Integer.parseInt(r9);	 Catch:{ NumberFormatException -> 0x008b }
        r0 = r8.e;	 Catch:{ all -> 0x008f }
        r2 = 0;
        r8 = 1;
        r4 = 0;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 != 0) goto L_0x0027;
    L_0x0025:
        r0 = 1;
        goto L_0x0028;
    L_0x0027:
        r0 = 0;
    L_0x0028:
        r1 = defpackage.aahv.h();	 Catch:{ all -> 0x008f }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x008f }
        r1 = r1.contains(r9);	 Catch:{ all -> 0x008f }
        if (r1 == 0) goto L_0x005b;
    L_0x0036:
        r9 = r6.b;	 Catch:{ all -> 0x008f }
        r1 = new aewm;	 Catch:{ all -> 0x008f }
        r1.<init>(r8, r0);	 Catch:{ all -> 0x008f }
        r9.put(r7, r1);	 Catch:{ all -> 0x008f }
        r7 = r6.a;	 Catch:{ all -> 0x008f }
        if (r0 == 0) goto L_0x004f;
    L_0x0044:
        r7 = r7.a;	 Catch:{ all -> 0x008f }
        r8 = new aeje;	 Catch:{ all -> 0x008f }
        r8.<init>();	 Catch:{ all -> 0x008f }
        r7.a(r8);	 Catch:{ all -> 0x008f }
        goto L_0x008d;
    L_0x004f:
        r7 = r7.a;	 Catch:{ all -> 0x008f }
        r8 = new aejg;	 Catch:{ all -> 0x008f }
        r8.<init>();	 Catch:{ all -> 0x008f }
        r7.a(r8);	 Catch:{ all -> 0x008f }
        monitor-exit(r6);
        return;
    L_0x005b:
        r8 = defpackage.aahv.n();	 Catch:{ all -> 0x008f }
        r8 = r8.contains(r9);	 Catch:{ all -> 0x008f }
        if (r8 == 0) goto L_0x008d;
    L_0x0065:
        r8 = r6.b;	 Catch:{ all -> 0x008f }
        r9 = new aewm;	 Catch:{ all -> 0x008f }
        r9.<init>(r4, r0);	 Catch:{ all -> 0x008f }
        r8.put(r7, r9);	 Catch:{ all -> 0x008f }
        r7 = r6.a;	 Catch:{ all -> 0x008f }
        if (r0 == 0) goto L_0x007f;
    L_0x0073:
        r7 = r7.a;	 Catch:{ all -> 0x008f }
        r8 = new aegg;	 Catch:{ all -> 0x008f }
        r8.<init>();	 Catch:{ all -> 0x008f }
        r7.a(r8);	 Catch:{ all -> 0x008f }
        monitor-exit(r6);
        return;
    L_0x007f:
        r7 = r7.a;	 Catch:{ all -> 0x008f }
        r8 = new aegi;	 Catch:{ all -> 0x008f }
        r8.<init>();	 Catch:{ all -> 0x008f }
        r7.a(r8);	 Catch:{ all -> 0x008f }
        monitor-exit(r6);
        return;
    L_0x008b:
        monitor-exit(r6);
        return;
    L_0x008d:
        monitor-exit(r6);
        return;
    L_0x008f:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aewn.a(ovi, ovm, boolean):void");
    }

    public final synchronized void b(ovi ovi, ovm ovm, boolean z) {
        aewm aewm = (aewm) this.b.get(ovi);
        if (aewm != null) {
            afjj afjj = this.a;
            z = aewm.a;
            boolean z2 = aewm.b;
            if (z) {
                if (z2) {
                    afjj.a.a(new aejd());
                } else {
                    afjj.a.a(new aejf());
                }
            } else if (z2) {
                afjj.a.a(new aegf());
            } else {
                afjj.a.a(new aegh());
            }
        }
    }

    public final synchronized void a(ovi ovi, ovm ovm, boolean z, int i) {
        aewm aewm = (aewm) this.b.get(ovi);
        if (aewm != null) {
            if (aewm.c == 0) {
                if (i > 0) {
                    afjj afjj = this.a;
                    z = aewm.a;
                    boolean z2 = aewm.b;
                    if (z) {
                        if (z2) {
                            afjj.a.a(new aejc());
                        } else {
                            afjj.a.a(new aeiz());
                        }
                    } else if (z2) {
                        afjj.a.a(new aege());
                    } else {
                        afjj.a.a(new aegb());
                    }
                }
            }
            if (!aewm.b) {
                long j;
                if (aewm.a) {
                    j = aewm.c;
                    if (j < 102400) {
                        if (j + ((long) i) >= 102400) {
                            this.a.a.a(new aeja());
                        }
                    }
                } else {
                    j = aewm.c;
                    if (j < 40960 && j + ((long) i) >= 40960) {
                        this.a.a.a(new aegc());
                    }
                }
            }
            aewm.c += (long) i;
        }
    }

    public final synchronized void c(ovi ovi, ovm ovm, boolean z) {
        aewm aewm = (aewm) this.b.get(ovi);
        if (aewm != null) {
            if (aewm.b) {
                afjj afjj = this.a;
                if (aewm.a) {
                    afjj.a.a(new aejb());
                } else {
                    afjj.a.a(new aegd());
                }
            }
            this.b.remove(ovi);
        }
    }
}
