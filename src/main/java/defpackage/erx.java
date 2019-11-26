package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: erx */
public final class erx extends akpl {
    private final akou a;
    private final ViewGroup b;
    private final akpb c;
    private final LayoutParams d = new LayoutParams(-1, -2);
    private akot e;

    public erx(Context context, flu flu, akpb akpb) {
        this.a = flu;
        this.b = new FrameLayout(context);
        this.c = akpb;
        flu.a(this.b);
        this.b.setLayoutParams(this.d);
    }

    public final View K_() {
        return this.a.a();
    }

    public final void a(akpb akpb) {
        this.b.removeAllViews();
        akpb.a(this.e.K_());
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        auwl auwl = (auwl) obj;
        auwn auwn = auwl.f;
        if (auwn == null) {
            auwn = auwn.c;
        }
        int a = auwp.a(auwn.b);
        if (a == 0) {
            a = 1;
        }
        Object esa = a + -1 != 2 ? new esa(auwl) : new erz(auwl);
        this.e = akoz.a(this.c, esa, null);
        akot akot = this.e;
        if (akot != null) {
            akoz.a(akot.K_(), this.e, this.c.a(esa));
            this.e.a_(akor, esa);
            View K_ = this.e.K_();
            this.b.removeAllViews();
            this.b.addView(K_);
            this.a.a(akor);
        }
    }
}
