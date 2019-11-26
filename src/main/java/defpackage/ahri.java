package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.google.android.youtube.R;

/* renamed from: ahri */
public final class ahri extends ahor implements ahsa, ahsc {
    private final ahry a;
    private final ahne b;
    private final ahre c;
    private float e;

    public ahri(Context context, ahry ahry) {
        this.a = (ahry) amqw.a((Object) ahry);
        this.b = new ahne(ahsm.a(ahsg.a, new float[]{-ahsg.a, ahsg.a * -0.7f, ahsg.a * -0.4f, ahsg.a * -0.1f, ahsg.a * 0.2f, ahsg.a * 0.4f, ahsg.a * 0.6f, ahsg.a * 0.8f, ahsg.a}), ahpn.a(), ahsm.a(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 0.025f, 0.025f, 0.025f, 1.0f, 0.05f, 0.05f, 0.05f, 1.0f, 0.075f, 0.075f, 0.075f, 1.0f, 0.1f, 0.1f, 0.1f, 1.0f, 0.075f, 0.075f, 0.075f, 1.0f, 0.05f, 0.05f, 0.05f, 1.0f, 0.025f, 0.025f, 0.025f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}), ahry.a.c());
        this.c = new ahre(BitmapFactory.decodeResource(context.getResources(), R.raw.vr_video_shadow), ahsm.a(1.0f, 1.0f, ahsm.c), (ahpn) ahry.c.clone(), ahry.a.d());
        ahry.a((ahsc) this);
        ahry.f.add(this);
        a(ahry.j, ahry.k);
        a(this.b);
        a(this.c);
    }

    public final void bd_() {
        super.bd_();
        this.a.b((ahsc) this);
        this.a.f.remove(this);
    }

    public final void a(boolean z) {
        z ^= 1;
        if (f() != z) {
            this.l = z;
        }
    }

    public final void a(float f, float f2) {
        f *= 1.1f;
        float f3 = f / 14.0f;
        f2 = (f2 / 2.0f) + (f3 / 2.0f);
        this.c.b(0.0f, this.e - f2, 0.0f);
        this.e = f2;
        this.c.a(f, f3, 1.0f);
    }
}
