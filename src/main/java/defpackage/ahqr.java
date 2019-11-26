package defpackage;

import android.graphics.Bitmap;

/* renamed from: ahqr */
public final class ahqr extends ahnd {
    public final ahqt e;
    public ahpz f;
    public ahrj g;
    public ahrj h;
    public float i;
    private final ahpn j;
    private final bcaa k;

    public ahqr(ahrt ahrt, ahpn ahpn, bcaa bcaa) {
        super(new ahou((ahpn) ahpn.clone(), 1.0f, 1.0f));
        this.j = ahpn;
        this.k = (bcaa) amqw.a((Object) bcaa);
        amqw.a((Object) ahrt);
        this.e = ahrt.b.a((ahpn) ahpn.clone(), 0.0f, 4.0f);
        this.e.a(true, false);
        this.e.c(2.0f);
        this.e.b(17);
        this.e.b(0.0f, 0.1f, 0.0f);
    }

    public static ahre a(Bitmap bitmap, ahsm ahsm, ahqr ahqr) {
        ahre ahre = new ahre(bitmap, ahsm, (ahpn) ahqr.j.clone(), ahqr.k);
        ahre.d = 0.3f;
        ahre.a(new ahpt(ahre, 0.1f, 0.2f));
        return ahre;
    }

    public static ahsm a(float f, boolean z) {
        float[] fArr;
        if (z) {
            fArr = ahsm.b;
        } else {
            fArr = ahsm.c;
        }
        return ahsm.a(f, 4.0f, fArr);
    }
}
