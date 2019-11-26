package defpackage;

import android.graphics.Bitmap;

/* renamed from: ahuo */
public final class ahuo extends ahor {
    public final ahqc a;
    public final ahre b;
    public final ahne c;
    public final float[] e = new float[3];
    public final Bitmap f;
    public long g;
    public long h;
    public float i;
    public float j;
    public aicd k;
    public boolean m;

    ahuo(bcaa bcaa, bcaa bcaa2, ahpn ahpn, ahts ahts) {
        this.a = new ahqc(bcaa, new int[]{-1695465, -5723992, -1}, 38.0f, (ahpn) ahpn.clone(), new ahur(this, ahts));
        this.f = ahsl.c();
        ahsl.a(this.f, xvd.b(this.g / 1000));
        this.b = new ahre(this.f, ahsm.a(ahsl.a(71.0f), ahsl.a(30.0f), ahsm.c), (ahpn) ahpn.clone(), bcaa2);
        ahre ahre = this.b;
        ahre.a(new ahpt(ahre, 0.0f, 1.0f));
        this.b.b((-this.a.g) / 2.0f, ahsl.a(35.0f), 0.0f);
        ahsm b = ahsm.b(ahsl.a(8.0f));
        this.c = new ahne(b, (ahpn) ahpn.clone(), ahne.a(ahne.b(-1695465), b.f), bcaa);
        this.c.b((-this.a.g) / 2.0f, 0.0f, 0.0f);
        ahne ahne = this.c;
        ahne.a(new ahpt(ahne, 0.0f, 1.0f));
        ahne = this.c;
        ahne.a(new ahpz(ahne, ahpz.a(0.0f), ahpz.a(1.0f)));
        a(this.a);
        a(this.c);
        a(this.b);
    }

    public final void d(ahnj ahnj) {
        super.d(ahnj);
        boolean c = this.a.c();
        this.b.b = c;
        this.c.b = c;
    }

    public final boolean c() {
        return this.m && this.k != aicd.k;
    }
}
