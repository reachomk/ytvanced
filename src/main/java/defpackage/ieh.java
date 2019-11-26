package defpackage;

import android.text.Spanned;
import android.text.TextUtils;

/* renamed from: ieh */
public final class ieh implements ajan, ezn, xcp {
    private final ezg a;
    private final zyw b;
    private final iem c;
    private CharSequence d;

    public ieh(ezg ezg, zyw zyw, iem iem) {
        this.a = ezg;
        this.b = zyw;
        this.c = (iem) amqw.a((Object) iem);
    }

    public final void a(String str, azek azek) {
    }

    public final long e() {
        return 1;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.t().f().a(emg.a(this.b, 70368744177664L, 1)).a(new iek(this), iej.a)};
    }

    public final void a(ahkf ahkf) {
        if (airg.a(ahkf.e, 5)) {
            a(ahkf.c);
            return;
        }
        Spanned spanned = null;
        if (airg.a(ahkf.e, 4)) {
            aakj aakj = ahkf.b;
            if (aakj != null) {
                armk armk = (armk) arml.f.createBuilder();
                armk.a(aakj.c());
                spanned = ajqy.a((arml) ((anxl) armk.build()));
            }
            a(spanned);
            return;
        }
        a(null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037  */
    private final void a(defpackage.aafv r5) {
        /*
        r4 = this;
        r0 = 0;
        if (r5 == 0) goto L_0x001f;
    L_0x0003:
        r1 = r5.a;
        r1 = r1.e;
        if (r1 == 0) goto L_0x000c;
    L_0x0009:
        r1 = r1.b;
        goto L_0x000d;
    L_0x000c:
        r1 = r0;
    L_0x000d:
        if (r1 == 0) goto L_0x001f;
    L_0x000f:
        r1 = r1.f;
        if (r1 == 0) goto L_0x001f;
    L_0x0013:
        r2 = r1.a;
        r3 = 128392103; // 0x7a71ba7 float:2.514362E-34 double:6.34341273E-316;
        if (r2 != r3) goto L_0x001f;
    L_0x001a:
        r1 = r1.b;
        r1 = (defpackage.awfq) r1;
        goto L_0x0020;
    L_0x001f:
        r1 = r0;
    L_0x0020:
        if (r1 == 0) goto L_0x0032;
    L_0x0022:
        r2 = r1.a;
        r2 = r2 & 1;
        if (r2 == 0) goto L_0x002e;
    L_0x0028:
        r0 = r1.b;
        if (r0 != 0) goto L_0x002e;
    L_0x002c:
        r0 = defpackage.arml.f;
    L_0x002e:
        r0 = defpackage.ajqy.a(r0);
    L_0x0032:
        r4.a(r0);
        if (r5 == 0) goto L_0x003e;
    L_0x0037:
        r0 = r4.a;
        r5 = r5.b;
        r0.a(r5, r4);
    L_0x003e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ieh.a(aafv):void");
    }

    private final void a(Spanned spanned) {
        if (!TextUtils.equals(this.d, spanned)) {
            this.c.a(spanned);
            this.d = spanned;
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkf.class};
        } else if (i == 0) {
            a((ahkf) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
