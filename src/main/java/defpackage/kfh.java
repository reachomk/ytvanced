package defpackage;

import android.content.Context;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.youtube.R;

/* renamed from: kfh */
public final class kfh {
    public final kfe a;
    public final ViewSwitcher b;
    public final ViewSwitcher c;
    public final Handler d = new Handler();
    public final Runnable e;
    public final int f;
    public final kfi g;
    public boolean h;
    public boolean i;
    private final akkq j;
    private final ImageView k;
    private final TextView l;
    private aren m;

    public kfh(Context context, akkq akkq, ViewSwitcher viewSwitcher, ViewSwitcher viewSwitcher2, ImageView imageView, TextView textView, kfi kfi) {
        this.j = akkq;
        this.b = (ViewSwitcher) amqw.a((Object) viewSwitcher);
        this.c = (ViewSwitcher) amqw.a((Object) viewSwitcher2);
        this.k = (ImageView) amqw.a((Object) imageView);
        this.l = (TextView) amqw.a((Object) textView);
        this.a = new kfe(context);
        this.g = kfi;
        this.e = new kfg(this);
        this.f = context.getResources().getInteger(R.integer.endorsement_swap_period_ms);
    }

    public final void a(aren aren) {
        this.m = aren;
        if (!(aren == null || this.l == null)) {
            ImageView imageView = this.k;
            if (imageView != null) {
                akkq akkq = this.j;
                aygk aygk = aren.c;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                akkq.a(imageView, aygk, this.j.a());
                TextView textView = this.l;
                arml arml = aren.b;
                if (arml == null) {
                    arml = arml.f;
                }
                textView.setText(ajqy.a(arml));
                this.b.setInAnimation(null);
                this.b.setOutAnimation(null);
                this.c.setInAnimation(null);
                this.c.setOutAnimation(null);
                this.b.setDisplayedChild(1);
                this.c.setDisplayedChild(1);
                this.h = false;
                return;
            }
        }
        d();
    }

    public final void a() {
        this.i = true;
        if (this.m != null && !this.h) {
            this.h = true;
            this.d.post(this.e);
        }
    }

    public final void b() {
        this.i = false;
        if (this.m != null) {
            this.h = false;
            this.d.removeCallbacks(this.e);
            if (this.b.getDisplayedChild() == 0) {
                this.d.post(this.e);
            }
        }
    }

    public final void c() {
        this.d.removeCallbacks(this.e);
    }

    public final void d() {
        this.b.setDisplayedChild(1);
        this.c.setDisplayedChild(1);
    }
}
