package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: igz */
public final class igz extends aito {
    public final iha a;
    public final iha b;
    public final iha c;
    public ihc d;
    public iha e;
    public boolean f;
    public int g;

    public igz(Context context, ihi ihi, ihm ihm, ihr ihr) {
        super(context);
        this.a = (iha) amqw.a((Object) ihi);
        this.b = (iha) amqw.a((Object) ihm);
        this.c = (iha) amqw.a((Object) ihr);
        e();
    }

    public final void e() {
        this.a.b();
        this.b.b();
        this.c.b();
        this.e = null;
        this.g = 1;
        b(3);
        ag_();
    }

    public final void a(Context context, View view) {
        if (this.e != null) {
            if (c(1)) {
                this.e.a(view);
                this.e.a();
            }
            if (c(2)) {
                this.e.a(this.g, this.f);
            }
        }
    }

    public final boolean c() {
        return this.e != null;
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.main_ad_cta_overlay, null, false);
        inflate.setVisibility(0);
        return inflate;
    }
}
