package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioManager;
import com.google.android.youtube.R;

/* renamed from: ahrm */
public final class ahrm extends ahnd implements ahqf {
    public final ahqc e;
    public final float f;
    private final ahnd g;
    private final float[] h = new float[2];
    private final AudioManager i;
    private final ahre j;
    private final ahre k;
    private final ahre m;
    private float n;
    private boolean o;

    public ahrm(Resources resources, AudioManager audioManager, bcaa bcaa, bcaa bcaa2, ahpn ahpn) {
        super(new ahou((ahpn) ahpn.clone(), 0.0f, 0.0f));
        this.i = audioManager;
        this.e = new ahqc(bcaa, new int[]{-1695465, -5723992}, 8.0f, (ahpn) ahpn.clone(), this);
        ahmr ahrp = new ahrp(this);
        ahmr ahrj = new ahrj(this.e, new float[]{0.0f, 0.0f, 0.0f}, new float[]{4.0f, 0.0f, 0.0f});
        a(ahrp);
        a(ahrj);
        Bitmap a = ahsl.a(resources, (int) R.raw.vr_volume_speaker);
        float a2 = ahsl.a((float) a.getWidth());
        float a3 = ahsl.a((float) a.getHeight());
        this.g = new ahnd(new ahou((ahpn) ahpn.clone(), a2, a3));
        ahqb ahre = new ahre(a, ahsm.a(a2, a3, ahsm.c), (ahpn) ahpn.clone(), bcaa2);
        ahre.a(new ahpt(ahre, 0.5f, 1.0f));
        this.j = new ahre(ahsl.a(resources, (int) R.raw.vr_volume_low), ahsm.a(a2, a3, ahsm.c), (ahpn) ahpn.clone(), bcaa2);
        ahre ahre2 = this.j;
        ahre2.a(new ahpt(ahre2, 0.5f, 1.0f));
        this.k = new ahre(ahsl.a(resources, (int) R.raw.vr_volume_high), ahsm.a(a2, a3, ahsm.c), (ahpn) ahpn.clone(), bcaa2);
        ahre2 = this.k;
        ahre2.a(new ahpt(ahre2, 0.5f, 1.0f));
        this.m = new ahre(ahsl.a(resources, (int) R.raw.vr_volume_mute), ahsm.a(a2, a3, ahsm.c), (ahpn) ahpn.clone(), bcaa2);
        ahre ahre3 = this.m;
        ahre3.a(new ahpt(ahre3, 0.5f, 1.0f));
        this.n = c();
        e();
        this.g.a(ahre);
        this.g.a(this.j);
        this.g.a(this.k);
        this.g.a(this.m);
        this.g.b(-4.0f, 0.0f, 0.0f);
        this.e.b((-8.0f + a2) / 2.0f, 0.0f, 0.0f);
        this.h[0] = c();
        float[] fArr = this.h;
        fArr[1] = 1.0f - fArr[0];
        this.e.a(fArr);
        float f = this.e.g + a2;
        this.f = f;
        b(f + 1.0f, a3);
        a(this.e);
        a(this.g);
    }

    public final void b(float f) {
    }

    public final void a(boolean z, ahnj ahnj) {
        super.a(z, ahnj);
        this.e.a(z, ahnj);
    }

    private final float c() {
        return ((float) this.i.getStreamVolume(3)) / ((float) this.i.getStreamMaxVolume(3));
    }

    private final void d() {
        this.i.setStreamVolume(3, !this.o ? (int) (this.n * ((float) this.i.getStreamMaxVolume(3))) : 0, 0);
    }

    private final void e() {
        ahre ahre = this.j;
        boolean z = this.o || this.n < 0.25f;
        ahre.m_(z);
        ahre = this.k;
        z = this.o || this.n < 0.75f;
        ahre.m_(z);
        this.m.m_(this.o ^ 1);
        float f = !this.o ? this.n : 0.0f;
        float[] fArr = this.h;
        fArr[0] = f;
        fArr[1] = 1.0f - f;
        this.e.a(fArr);
    }

    public final void e(ahnj ahnj) {
        super.e(ahnj);
        this.e.e(ahnj);
        if (this.g.f(ahnj)) {
            this.o ^= 1;
            e();
            d();
            e();
        }
    }

    public final void a(float f) {
        this.n = f;
        this.o = false;
        d();
        e();
    }

    public final void a() {
        e();
    }
}
