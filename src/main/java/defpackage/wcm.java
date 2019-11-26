package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;

/* renamed from: wcm */
public final class wcm extends ahnd implements ahpv, ahpy, ahrf {
    private static final float[] e = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
    private final ahne f;
    private final ahqt g;
    private final ahou h;
    private final Resources i;
    private float j;

    public wcm(Resources resources, ahrd ahrd, ahpn ahpn, bcaa bcaa) {
        super(new ahou(ahpn, 0.0f, 0.0f));
        this.i = (Resources) amqw.a((Object) resources);
        this.g = ahrd.a((ahpn) ahpn.clone(), 10.0f, 0.0f);
        this.g.a(false, true);
        this.g.c(2.0f);
        this.g.a((ahrf) this);
        this.g.b(17);
        ahsm a = ahsm.a(1.0f, 1.0f, ahsm.c);
        this.f = new ahne(a, (ahpn) ahpn.clone(), ahne.a(e, a.f), bcaa);
        this.f.a(new ahpz(this, ahpz.a(1.0f), ahpz.a(1.1f)));
        ahne ahne = this.f;
        ahne.a(new ahpt(ahne, 0.6f, 0.9f));
        this.f.e();
        ahqb ahqb = this.f;
        a(ahqb);
        a(this.g);
        this.h = new ahou(ahpn, 0.0f, 0.0f);
        a(false);
        a(5);
    }

    public final boolean c(ahnj ahnj) {
        return false;
    }

    public final void a(int i) {
        this.g.a(this.i.getString(R.string.skip_ad_in, new Object[]{Integer.valueOf(i / 1000)}));
    }

    public final void n_(boolean z) {
        if (z) {
            this.g.a(this.i.getString(R.string.skip_ad));
        }
        a(z);
    }

    public final boolean a(ahnj ahnj) {
        return !f() && this.h.a(ahnj).a();
    }

    public final boolean b(ahnj ahnj) {
        return this.b ^ 1;
    }

    public final void a(boolean z, ahnj ahnj) {
        super.a(z, ahnj);
        this.f.b = z;
    }

    public final void a(float f, float f2) {
        f2 += ahsl.a(20.0f);
        this.j = f2;
        this.f.a(12.0f, f2, 1.0f);
        this.h.a(21.599998f, this.j * 1.8f);
        b(12.0f, this.j);
    }

    public final void a(float f, float f2, float f3) {
        this.f.a(f * 12.0f, this.j * f2, f3);
    }
}
