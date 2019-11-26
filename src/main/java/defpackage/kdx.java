package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: kdx */
public final class kdx implements akot, fgz, fhn {
    private final aaas a;
    private final bcaa b;
    private final bcaa c;
    private final FrameLayout d;
    private Object e;
    private foq f;
    private akot g;
    private jxr h;
    private kdo i;

    public kdx(Context context, bcaa bcaa, bcaa bcaa2, aaas aaas) {
        this.d = new FrameLayout(context);
        this.b = bcaa;
        this.c = bcaa2;
        this.a = aaas;
    }

    public final fhc b() {
        return null;
    }

    public final View a() {
        akot akot = this.g;
        return akot != null ? ((fgz) akot).a() : null;
    }

    public final void a(boolean z) {
        akot akot = this.g;
        if (akot != null) {
            ((fgz) akot).a(z);
        }
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        akot akot = this.g;
        if (akot != null) {
            akot.a(akpb);
            this.g = null;
        }
        this.f = null;
        this.e = null;
    }

    public final bblt a(int i) {
        akot akot = this.g;
        if (akot instanceof fhn) {
            return ((fhn) akot).a(i);
        }
        return bblt.a();
    }

    public final boolean a(fhn fhn) {
        if ((fhn instanceof kdx) && ((kdx) fhn).e == this.e) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        akot akot;
        obj = (hai) obj;
        this.e = obj.a;
        this.f = fod.b(obj);
        foq foq = this.f;
        if (foq == null || !foa.a(foq)) {
            if (this.h == null) {
                this.h = (jxr) this.b.get();
            }
            akot = this.h;
        } else {
            if (this.i == null) {
                this.i = (kdo) this.c.get();
            }
            akot = this.i;
        }
        if (akot != this.g) {
            this.d.removeAllViews();
            this.d.addView(akot.K_());
            this.g = akot;
        }
        this.g.a_(akor, obj);
        aabd.a(this.a, obj.a.g, obj);
    }
}
