package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;

/* renamed from: ahpg */
public final class ahpg extends ahnd implements ahrf {
    private static final float f = ahsl.a(5.0f);
    public boolean e;
    private final ahne g;
    private final ahqt h;
    private final ahpl i;
    private float j;

    public ahpg(Resources resources, bcaa bcaa, ahrd ahrd, ahpn ahpn, ahpi ahpi, ahpl ahpl) {
        super(new ahou((ahpn) ahpn.clone(), 0.0f, 0.0f));
        this.i = (ahpl) amqw.a((Object) ahpl);
        amqw.a((Object) ahpi);
        this.h = ahrd.a((ahpn) ahpn.clone(), 0.0f, 0.0f);
        this.h.a((ahrf) this);
        this.h.a(true, true);
        this.h.a(resources.getString(R.string.live_label));
        ahsm b = ahsm.b(f);
        this.g = new ahne(b, (ahpn) ahpn.clone(), ahne.a(ahne.b(-1695465), b.f), bcaa);
        this.g.b(((-f) / 2.0f) - 11.2f, 0.0f, 0.0f);
        this.h.b((f + 0.4f) / 2.0f, 0.0f, 0.0f);
        a(this.h);
        a(this.g);
        this.c = new ahpj(this, ahpi);
        c();
    }

    public final void c() {
        if (this.e) {
            this.g.a(-1695465);
        } else {
            this.g.a(-5723992);
        }
    }

    public final float d() {
        return (this.j + f) + 0.4f;
    }

    public final void a(float f, float f2) {
        float f3 = this.j;
        this.j = f;
        this.g.b((f3 - f) / 2.0f, 0.0f, 0.0f);
        b(this.j, f2);
        this.i.a(f3, this.j);
    }
}
