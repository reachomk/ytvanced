package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PrimetimePromoPanelRendererOuterClass;

/* renamed from: kxq */
final class kxq {
    public final View a;
    private final kxe b;
    private final kxn c;
    private final FrameLayout d = ((FrameLayout) this.a.findViewById(R.id.content));

    public kxq(kxn kxn, kxg kxg, Context context, int i) {
        this.c = kxn;
        this.a = LayoutInflater.from(context).inflate(i, null);
        this.b = kxg.a(this.a);
    }

    public final void a(akor akor, awnv awnv) {
        Object b;
        anxp anxp = awnv.h;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(PrimetimePromoPanelRendererOuterClass.primetimePromoPanelRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = awnv.h;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(PrimetimePromoPanelRendererOuterClass.primetimePromoPanelRenderer);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            b = (awnt) b;
        } else {
            b = null;
        }
        this.d.removeAllViews();
        View view = this.c.a;
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.d.addView(view);
        this.c.a_(akor, b);
        this.b.a_(akor, awnv);
    }
}
