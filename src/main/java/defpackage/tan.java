package defpackage;

import android.view.View.MeasureSpec;
import com.facebook.litho.ComponentTree;

/* renamed from: tan */
public class tan implements taf {
    public final swo a;
    public final spi b;
    public final swp c;
    public final boolean d;
    public final boolean e;
    public final cwj f;
    public final bbmz g;
    private final cmg h;
    private cma i = null;
    private ComponentTree j = null;
    private int k = -1;
    private crg l = null;
    private boolean m = false;

    public tan(spi spi, swp swp, boolean z, boolean z2, cmg cmg, cwj cwj, swo swo) {
        this.b = spi;
        this.c = swp;
        this.d = z;
        this.e = z2;
        this.h = cmg;
        this.f = cwj;
        this.g = new bbmz();
        this.a = swo;
    }

    public final ComponentTree b() {
        if (this.j == null) {
            cmg cmg = this.h;
            if (this.i == null) {
                taq taq = new taq(this);
                cwj cwj = this.f;
                tam tam = new tam();
                tam.a(tam, cwj, new taj());
                tam.a.a = taq;
                tam.d.set(0);
                this.i = (taj) tam.c();
            }
            cmy a = ComponentTree.a(cmg, this.i);
            a.g = this.l;
            a.j = this.m;
            a.c = this.d;
            this.j = a.a();
        }
        return this.j;
    }

    public final void a(tah tah) {
        int i = !tah.c ? tah.b : tah.a;
        if (this.j == null || i != this.k) {
            this.k = i;
            ComponentTree b = b();
            int makeMeasureSpec = tah.c ? MeasureSpec.makeMeasureSpec(tah.a, 1073741824) : 0;
            int makeMeasureSpec2 = !tah.c ? MeasureSpec.makeMeasureSpec(tah.b, 1073741824) : 0;
            cma cma = this.i;
            if (cma != null) {
                b.a(cma, makeMeasureSpec, makeMeasureSpec2, true, null, null);
                return;
            }
            throw new IllegalArgumentException("Root component can't be null");
        }
    }

    public final void a() {
        ComponentTree componentTree = this.j;
        if (componentTree != null) {
            this.l = componentTree.h();
            this.m = this.j.s;
            this.g.a();
            this.j.i();
            this.j = null;
            this.k = -1;
        }
    }
}
