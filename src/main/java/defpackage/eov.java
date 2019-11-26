package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: eov */
public final class eov extends cma {
    @cue(a = 13)
    public bcaa a;
    @cue(a = 13)
    private eoz b;

    private eov() {
        super("InlinePlayerTracker");
    }

    public final int A() {
        return 3;
    }

    public final boolean t() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final int w() {
        return 3;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean x() {
        return false;
    }

    public final boolean a(cma cma) {
        if (this == cma) {
            return true;
        }
        if (cma == null || getClass() != cma.getClass()) {
            return false;
        }
        eov eov = (eov) cma;
        if (this.j != eov.j) {
            bcaa bcaa = this.a;
            if (!bcaa == null ? bcaa.equals(eov.a) : eov.a == null) {
                return false;
            }
            eoz eoz = this.b;
            eoz eoz2 = eov.b;
            return eoz == null ? eoz2 == null : eoz.equals(eoz2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(csq csq) {
        if (csq != null) {
            this.b = (eoz) csq.a(eoz.class);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Context context) {
        return new FrameLayout(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(cmg cmg, Object obj) {
        View view = (View) obj;
        bcaa bcaa = this.a;
        eoz eoz = this.b;
        String.valueOf(view).length();
        eoz.a(new eox(view, bcaa));
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(Object obj) {
        View view = (View) obj;
        eoz eoz = this.b;
        String.valueOf(view).length();
        eoz.a(null);
    }

    public static eou a(cmg cmg) {
        eou eou = new eou();
        eou.a(eou, cmg, new eov());
        return eou;
    }
}
