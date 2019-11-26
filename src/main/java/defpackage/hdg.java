package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: hdg */
public final class hdg implements xcp {
    public final adqf a;
    private final hdf b;
    private final hde c;
    private int d;

    public hdg(adqf adqf, hdf hdf, hde hde) {
        this.a = (adqf) amqw.a((Object) adqf);
        this.b = (hdf) amqw.a((Object) hdf);
        this.c = (hde) amqw.a((Object) hde);
        a(1);
    }

    public final void a(adqe adqe) {
        if (adqe != null) {
            int d = adqe.d();
            if (d == 0) {
                CharSequence bv_ = adqe.h() != null ? adqe.h().bv_() : null;
                hdf hdf = this.b;
                boolean e = adqe.e();
                int i = TextUtils.isEmpty(bv_) ? e ? R.string.reconnecting : R.string.connecting : !e ? R.string.connecting_to_screen : R.string.reconnecting_to_screen;
                if (!(i == hdf.b && hdf.a == 2 && TextUtils.equals(hdf.c, bv_))) {
                    hdf.c = bv_;
                    hdf.b = i;
                    hdf.a = 2;
                    hdf.m();
                }
                a(3);
            } else if (d == 1) {
                this.c.a(hdg.b(adqe));
                a(2);
                return;
            } else if (d == 2) {
                a(1);
                return;
            }
            return;
        }
        a(1);
    }

    private static String b(adqe adqe) {
        return adqe.h().bv_();
    }

    /* JADX WARNING: Missing block: B:18:0x0036, code skipped:
            if (r7 != 9) goto L_0x00a3;
     */
    public final java.lang.Class[] a(java.lang.Class r5, java.lang.Object r6, int r7) {
        /*
        r4 = this;
        r5 = -1;
        r0 = 2;
        r1 = 1;
        r2 = 0;
        if (r7 == r5) goto L_0x0098;
    L_0x0006:
        if (r7 == 0) goto L_0x0090;
    L_0x0008:
        if (r7 != r1) goto L_0x0077;
    L_0x000a:
        r6 = (defpackage.ahkn) r6;
        r5 = r4.a;
        r5 = r5.c();
        if (r5 == 0) goto L_0x00a3;
    L_0x0014:
        r7 = r5.d();
        if (r7 != r1) goto L_0x00a3;
    L_0x001a:
        r7 = r5.f();
        if (r7 == 0) goto L_0x0025;
    L_0x0020:
        r4.a(r1);
        goto L_0x00a3;
    L_0x0025:
        r7 = r6.a;
        r7 = r7.ordinal();
        if (r7 == 0) goto L_0x006a;
    L_0x002d:
        r3 = 5;
        if (r7 == r3) goto L_0x004f;
    L_0x0030:
        r6 = 8;
        if (r7 == r6) goto L_0x0039;
    L_0x0034:
        r6 = 9;
        if (r7 == r6) goto L_0x006a;
    L_0x0038:
        goto L_0x00a3;
    L_0x0039:
        r6 = r4.c;
        r5 = defpackage.hdg.b(r5);
        r7 = r6.a;
        r1 = 2131953149; // 0x7f1305fd float:1.954276E38 double:1.0533248095E-314;
        r5 = r6.a(r1, r5);
        r7.setText(r5);
        r4.a(r0);
        return r2;
    L_0x004f:
        r5 = r6.f;
        if (r5 != 0) goto L_0x00a3;
    L_0x0053:
        r5 = r4.b;
        r6 = r5.a;
        if (r6 == r1) goto L_0x0065;
    L_0x0059:
        r6 = 2131951872; // 0x7f130100 float:1.954017E38 double:1.0533241785E-314;
        r5.b = r6;
        r5.c = r2;
        r5.a = r1;
        r5.m();
    L_0x0065:
        r5 = 3;
        r4.a(r5);
        goto L_0x00a3;
    L_0x006a:
        r6 = r4.c;
        r5 = defpackage.hdg.b(r5);
        r6.a(r5);
        r4.a(r0);
        return r2;
    L_0x0077:
        r5 = new java.lang.IllegalStateException;
        r6 = new java.lang.StringBuilder;
        r0 = 32;
        r6.<init>(r0);
        r0 = "unsupported op code: ";
        r6.append(r0);
        r6.append(r7);
        r6 = r6.toString();
        r5.<init>(r6);
        throw r5;
    L_0x0090:
        r6 = (defpackage.adqk) r6;
        r5 = r6.a;
        r4.a(r5);
        goto L_0x00a3;
    L_0x0098:
        r2 = new java.lang.Class[r0];
        r5 = 0;
        r6 = defpackage.adqk.class;
        r2[r5] = r6;
        r5 = defpackage.ahkn.class;
        r2[r1] = r5;
    L_0x00a3:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdg.a(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }

    private final void a(int i) {
        if (this.d != i) {
            this.d = i;
            xpr.a(this.c, i == 2);
            if (this.d == 3) {
                this.b.af_();
                return;
            }
            this.b.ag_();
        }
    }
}
