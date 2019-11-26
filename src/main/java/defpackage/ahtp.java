package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioManager;
import com.google.android.youtube.R;

/* renamed from: ahtp */
public final class ahtp extends ahor {
    public final ahqt a;
    public final ahpg b;
    public final ahre c;
    public final ahoz e;
    public final ahuo f;
    public float g;
    public long h;
    public boolean i;
    private final ahrm j;
    private float k;

    ahtp(Resources resources, AudioManager audioManager, ahry ahry, ahrd ahrd, ahpn ahpn, ahts ahts, ahpb ahpb) {
        ahry ahry2 = ahry;
        ahts ahts2 = ahts;
        bcaa d = ahry2.a.d();
        bcaa c = ahry2.a.c();
        float a = ahsl.a(-40.0f);
        this.a = ahrd.a((ahpn) ahpn.clone(), 0.0f, ahsl.a(40.0f));
        this.a.b(-19.0f, a, 0.0f);
        this.a.b(17);
        this.a.a(new ahto(this));
        this.a.a(true, false);
        this.f = new ahuo(c, d, (ahpn) ahpn.clone(), ahts2);
        bcaa bcaa = c;
        ahrm ahrm = r4;
        ahrm ahrm2 = new ahrm(resources, audioManager, bcaa, d, ahpn);
        this.j = ahrm;
        this.j.b(0.0f, a, 0.0f);
        Resources resources2 = resources;
        this.b = new ahpg(resources2, bcaa, ahrd, (ahpn) ahpn.clone(), new ahtr(this, ahts2), new ahtq(this));
        ahpg ahpg = this.b;
        ahpg.b((ahpg.d() - 0.11328125f) / 2.0f, a, 0.0f);
        Bitmap a2 = ahsl.a(resources2, (int) R.raw.white_box);
        float a3 = ahsl.a((float) a2.getWidth());
        float a4 = ahsl.a((float) a2.getHeight());
        ahre ahre = new ahre(a2, ahsm.a(a3, a4, ahsm.c), (ahpn) ahpn.clone(), ahry2.a.d());
        ahre.b((38.0f - a3) / 2.0f, ahsl.a(-40.0f), 0.0f);
        ahou ahou = ahre.g;
        if (ahou == null) {
            ahre.g = new ahou(ahre.a, a3, a4);
        } else {
            ahou.a(a3, a4);
        }
        ahpz ahpz = new ahpz(ahre, ahpz.a(0.5f), ahpz.a(1.0f));
        ahre.a(new ahpt(ahre, 0.75f, 1.0f));
        ahre.b(ahpz);
        ahre.e = new ahtt(ahre, ahry2);
        this.c = ahre;
        this.c.m_(true);
        this.e = new ahoz(resources, d, c, ahrd, ahpn, ahpb);
        this.e.b(ahsl.a(140.0f), a, 0.0f);
        this.e.l = true;
        a(this.f);
        a(this.e);
        a(this.a);
        a(this.b);
        a(this.j);
        a(this.c);
    }

    public final void c() {
        float d;
        if (this.i) {
            d = this.b.d();
        } else {
            d = this.g;
        }
        ahrm ahrm = this.j;
        float f = (((ahrm.f - 0.11328125f) / 2.0f) + d) + 0.5f;
        ahrm.b(f - this.k, 0.0f, 0.0f);
        this.k = f;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.e.l = z ^ 1;
    }
}
