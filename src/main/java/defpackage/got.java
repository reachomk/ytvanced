package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: got */
public final class got {
    public View a;
    public View b;
    public View c;
    public View d;
    public TextView e;
    private boolean f;

    public final void a() {
        if (!this.f) {
            ggh.a(this.a, 1500);
            xpr.a(this.b, false);
            this.b.setOnClickListener(null);
            this.b.setClickable(false);
        }
    }

    public final void a(String str, Runnable runnable) {
        amqw.a((Object) str);
        b();
        this.e.setText(str);
        boolean z = true;
        xpr.a(this.c, true);
        xpr.a(this.b, true);
        View view = this.d;
        if (runnable == null) {
            z = false;
        }
        xpr.a(view, z);
        if (runnable != null) {
            this.d.setOnClickListener(new gow(runnable));
        }
        ggh.a(this.c);
        ggh.a(this.b);
    }

    public final void a(boolean z) {
        int i = z ^ 1;
        this.f = i;
        if (i != 0) {
            b();
        }
    }

    public final void b() {
        this.a.clearAnimation();
        xpr.a(this.a, false);
    }

    public final void c() {
        b();
        xpr.a(this.c, false);
        xpr.a(this.b, false);
        this.d.setOnClickListener(null);
        this.d.setClickable(false);
    }
}
