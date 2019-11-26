package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.youtube.R;

/* renamed from: ahvd */
public final class ahvd extends ahor {
    private static final float e = ahsl.a(64.0f);
    public aicd a = aicd.a;
    public boolean b;
    public boolean c;
    private final ahup f;
    private final ahup g;
    private final ahup h;
    private final ahup i;
    private final ahup j;

    public ahvd(Resources resources, ahpn ahpn, ahvj ahvj, ahry ahry) {
        bcaa d = ahry.a.d();
        bcaa bcaa = d;
        Bitmap a = ahsl.a(resources, (int) R.raw.vr_button_fill);
        this.g = new ahup((ahpn) ahpn.clone(), bcaa, a, 9.2f, ahsl.a(resources, (int) R.raw.vr_play));
        this.g.c = new ahvc(ahvj);
        this.h = new ahup((ahpn) ahpn.clone(), bcaa, a, 9.2f, ahsl.a(resources, (int) R.raw.vr_replay_white_24dp));
        this.h.c = new ahvf(ahvj);
        this.h.l = true;
        this.f = new ahup((ahpn) ahpn.clone(), bcaa, a, 9.2f, ahsl.a(resources, (int) R.raw.vr_pause));
        this.f.c = new ahve(ahvj);
        this.i = new ahup((ahpn) ahpn.clone(), bcaa, a, e, ahsl.a(resources, (int) R.raw.vr_next));
        this.i.c = new ahvh(ahvj);
        this.j = new ahup(ahpn, bcaa, a, e, ahsl.a(resources, (int) R.raw.vr_prev));
        this.j.c = new ahvg(ahvj);
        float a2 = ahsl.a(120.0f);
        this.j.b(-a2, 0.0f, 0.0f);
        this.i.b(a2, 0.0f, 0.0f);
        a(2);
        a(this.g);
        a(this.h);
        a(this.f);
        a(this.j);
        a(this.i);
    }

    public final void c() {
        if (this.a.v) {
            boolean z = this.b;
            if (z || this.c) {
                this.i.a(z);
                this.j.a(this.c);
                this.i.l = false;
                this.j.l = false;
                return;
            }
        }
        this.i.l = true;
        this.j.l = true;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        boolean z = false;
        this.g.l = i != 1;
        this.f.l = i != 2;
        ahup ahup = this.h;
        if (i != 3) {
            z = true;
        }
        ahup.l = z;
    }
}
