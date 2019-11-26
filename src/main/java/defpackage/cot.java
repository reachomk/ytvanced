package defpackage;

import android.content.Context;
import com.facebook.litho.ComponentHost;

/* renamed from: cot */
final class cot extends cma {
    protected cot() {
        super("HostComponent");
    }

    public final int A() {
        return 3;
    }

    public final boolean a(cma cma) {
        return this == cma;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(cma cma, cma cma2) {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final int w() {
        return 45;
    }

    /* Access modifiers changed, original: protected|final */
    public final cpy p() {
        if (cuj.u) {
            return new coc();
        }
        return super.p();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Context context) {
        return new ComponentHost(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(cmg cmg, Object obj) {
        ((ComponentHost) obj).setAlpha(1.0f);
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(cmg cmg, Object obj) {
        ComponentHost componentHost = (ComponentHost) obj;
        if (componentHost.isPressed()) {
            componentHost.setPressed(false);
        }
    }

    static cma B() {
        return new cot();
    }
}
