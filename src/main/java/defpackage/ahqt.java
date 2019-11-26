package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import java.util.ArrayList;

/* renamed from: ahqt */
public final class ahqt extends ahqm implements OnLayoutChangeListener {
    public final ViewGroup i;
    public ahrc j;
    private final Handler k;
    private final float o;
    private final float p;
    private final ArrayList q = new ArrayList();
    private float r;
    private float s;
    private boolean t;

    public final void a(ahrf ahrf) {
        this.q.add(ahrf);
    }

    public final void e(ahnj ahnj) {
    }

    public final void d(ahnj ahnj) {
        super.d(ahnj);
        if (this.t) {
            int i = 0;
            this.t = false;
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            while (i < size) {
                ((ahrf) arrayList.get(i)).a(this.r, this.s);
                i++;
            }
            a_(this.r, this.s);
            this.k.post(new ahqu(this));
            a(this.r, this.s, 0.0f);
        }
    }

    public final void a(boolean z, boolean z2) {
        int i = -2;
        int b = !z ? ahqm.b(this.o) : -2;
        if (!z2) {
            i = ahqm.b(this.p);
        }
        this.k.post(new ahqx(this, new LayoutParams(b, i)));
    }

    public final void a(String str) {
        this.k.post(new ahqw(this, str));
    }

    public final void c(float f) {
        this.k.post(new ahqz(this, f));
    }

    public final void a(int i) {
        this.k.post(new ahqy(this, i));
    }

    public final void b(int i) {
        this.k.post(new ahrb(this, i));
    }

    public final void bd_() {
        this.k.post(new ahra(this));
        super.bd_();
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.s = ahsl.a((float) this.j.getHeight());
        this.r = ahsl.a((float) this.j.getWidth());
        this.t = true;
    }

    public final void m_(boolean z) {
        this.l = z;
        this.k.post(new ahqv(this, z));
    }

    /* synthetic */ ahqt(ViewGroup viewGroup, Context context, Handler handler, bcaa bcaa, ahpn ahpn, float f, float f2) {
        float f3 = f;
        float f4 = f2;
        super(f3, f4, ahsm.a(1.0f, 1.0f, ahqm.m), ahpn, bcaa);
        this.k = (Handler) amqw.a((Object) handler);
        this.i = (ViewGroup) amqw.a((Object) viewGroup);
        this.o = f;
        this.p = f2;
        this.s = f2;
        this.r = f;
        a(f, f2, 0.0f);
        handler.post(new ahqs(this, context, f3, f4, viewGroup));
    }
}
