package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: ctz */
public final class ctz extends cuc {
    private final int a;
    private final ctw b;
    private final Interpolator c;

    public ctz(int i, ctw ctw, Interpolator interpolator) {
        this.a = i;
        this.b = ctw;
        this.c = interpolator;
    }

    public final void a(ArrayList arrayList) {
        arrayList.add(this.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(cty cty) {
        cvb cvb = new cvb(this.a);
        cur cur = new cur(cty.a(this.b.a));
        cur cur2 = new cur(this.b.b);
        cva cva = new cva();
        Interpolator interpolator = this.c;
        if (interpolator != null) {
            cux cux = new cux(interpolator);
            a(cvb, cux);
            a(cux, cva);
        } else {
            a(cvb, cva);
        }
        a(cur, cva, "initial");
        a(cur2, cva, "end");
        a(cva, cty.b(this.b.a));
    }
}
