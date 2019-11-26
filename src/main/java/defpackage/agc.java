package defpackage;

import android.graphics.drawable.Animatable;

/* renamed from: agc */
final class agc extends agj {
    private final Animatable a;

    agc(Animatable animatable) {
        this.a = animatable;
    }

    public final void a() {
        this.a.start();
    }

    public final void b() {
        this.a.stop();
    }
}
