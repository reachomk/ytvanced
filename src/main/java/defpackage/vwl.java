package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: vwl */
public final class vwl extends aito implements vvd, vzy {
    public wae a;
    private final wac b;
    private final vzt c = new vzt();
    private final vzp d = new vzp();
    private final xnk e;
    private ViewGroup f;
    private LinearLayout g;
    private ImageView h;
    private vxc i;
    private boolean j;
    private int k;

    public vwl(Context context, xnk xnk) {
        super(context);
        this.e = xnk;
        this.b = new wac(context);
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void a(wae wae) {
        this.a = wae;
        this.b.f = wae;
    }

    public final int e() {
        return this.k;
    }

    public final boolean c() {
        return vvc.a(this.i, 1);
    }

    public final void a(vxc vxc) {
        this.i = vxc;
        if (j()) {
            this.b.b(this.i.j(), c());
        }
        if (c()) {
            af_();
        } else {
            this.d.b(Boolean.valueOf(false), false);
            super.ag_();
        }
        b(1);
    }

    public final /* synthetic */ void a(Context context, View view) {
        this.k = ((FrameLayout) view).getWidth();
        int i = 0;
        if (c(2)) {
            this.f.setVisibility(0);
            this.d.a(false);
        }
        if (c(1)) {
            boolean d = this.i.i().d();
            if (this.j != d) {
                ImageView imageView = this.h;
                if (!d) {
                    i = 8;
                }
                imageView.setVisibility(i);
                this.g.setEnabled(d);
                this.j = d;
            }
            d = c();
            this.c.b(this.i.k(), d);
            this.b.b(this.i.j(), d);
            this.d.b(Boolean.valueOf(this.i.c()), d);
        }
    }
}
