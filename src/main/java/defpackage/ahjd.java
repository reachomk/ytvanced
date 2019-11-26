package defpackage;

import java.text.DecimalFormat;

/* renamed from: ahjd */
public final class ahjd {
    private static final aywt[] c = new aywt[0];
    public final aywt[] a;
    public final float b;

    public ahjd(aakj aakj, float f) {
        this.a = ahjd.a(aakj);
        this.b = f;
    }

    public static aywt[] a(aakj aakj) {
        if (aakj == null) {
            return c;
        }
        aajj n = aakj.n();
        awdg awdg = n.c;
        int i = 0;
        if ((awdg.b & 1) != 0) {
            aywv aywv = awdg.t;
            if (aywv == null) {
                aywv = aywv.f;
            }
            if (aywv.b.size() != 0) {
                aywv aywv2 = n.c.t;
                if (aywv2 == null) {
                    aywv2 = aywv.f;
                }
                return (aywt[]) aywv2.b.toArray(new aywt[0]);
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.0#");
        aywt[] aywtArr = new aywt[aajj.a.length];
        while (i < aajj.a.length) {
            ayws ayws = (ayws) aywt.d.createBuilder();
            float f = aajj.a[i];
            armk armk = (armk) arml.f.createBuilder();
            armo armo = (armo) armp.m.createBuilder();
            armo.a(decimalFormat.format((double) f));
            armk.a((armp) ((anxl) armo.build()));
            ayws.copyOnWrite();
            aywt aywt = (aywt) ayws.instance;
            aywt.b = (arml) ((anxl) armk.build());
            aywt.a |= 1;
            ayws.copyOnWrite();
            aywt aywt2 = (aywt) ayws.instance;
            aywt2.a |= 2;
            aywt2.c = f;
            aywtArr[i] = (aywt) ((anxl) ayws.build());
            i++;
        }
        return aywtArr;
    }
}
