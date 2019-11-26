package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: jeb */
public final class jeb implements akot {
    private final FrameLayout a;
    private final akpb b;
    private final ViewGroup c;
    private akot d;

    public jeb(Context context, akpb akpb, ViewGroup viewGroup) {
        this.b = akpb;
        this.c = viewGroup;
        this.a = new FrameLayout(context);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        akot akot = this.d;
        if (akot != null) {
            akot.a(akpb);
            this.a.removeAllViews();
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        axgk axgk = (axgk) obj;
        this.a.removeAllViews();
        Object a = jeq.a(axgk);
        this.d = akoz.a(this.b, a, this.c);
        akor.a.a(axgk.o.d(), null);
        akot akot = this.d;
        if (akot != null) {
            akot.a_(akor, a);
            if (this.d.K_() != null) {
                this.a.addView(this.d.K_());
            }
        }
    }
}
