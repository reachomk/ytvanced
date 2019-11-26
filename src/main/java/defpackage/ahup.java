package defpackage;

import android.graphics.Bitmap;

/* renamed from: ahup */
public final class ahup extends ahnd {
    public ahup(ahpn ahpn, bcaa bcaa, Bitmap bitmap, float f, Bitmap bitmap2) {
        super(new ahou((ahpn) ahpn.clone(), f, f));
        ahqb ahre = new ahre(bitmap, ahsm.a(f, f, ahsm.c), (ahpn) ahpn.clone(), bcaa);
        ahre.a(new ahpz(ahre, ahpz.a(0.8f), ahpz.a(1.0f)));
        ahre.a(new ahpt(ahre, 0.1f, 0.2f));
        ahqb ahre2 = new ahre(bitmap2, ahsm.a(ahsl.a((float) bitmap2.getWidth()), ahsl.a((float) bitmap2.getHeight()), ahsm.c), (ahpn) ahpn.clone(), bcaa);
        ahre2.a(new ahpz(ahre2, ahpz.a(1.0f), ahpz.a(1.2f)));
        ahre2.d = 0.3f;
        a(ahre);
        a(ahre2);
    }
}
