package defpackage;

import android.view.View.MeasureSpec;

/* renamed from: akzu */
final class akzu extends cma {
    @cue(a = 13)
    public akzz a;
    @cue(a = 14)
    private final akzw b = new akzw();

    public akzu() {
        super("YouTubeElementSize");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean n() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean y() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final crh d() {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(cmg cmg) {
        cri cri = new cri();
        try {
            cri.a = this.a;
            this.b.a = (akzz) cri.a;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final cma a(cmg cmg, int i, int i2) {
        akzz akzz = this.b.a;
        if (akzz == null) {
            return null;
        }
        return akzz.a(swk.i().a(Integer.valueOf(MeasureSpec.getSize(i))).b(Integer.valueOf(MeasureSpec.getSize(i2))).a()).g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        ((akzw) crh2).a = ((akzw) crh).a;
    }
}
