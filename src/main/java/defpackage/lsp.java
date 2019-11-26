package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;

/* renamed from: lsp */
public final class lsp extends acxe implements lst, luc {
    public final Activity a;
    public final lsu b;
    public final ltx c;
    public final acvx d;
    public final lsn e;
    public final LoadingFrameLayout f;
    public final TextView g;
    public final TextView h;
    public final boolean i;
    public boolean j = false;
    public ajya k;
    public lsl l;
    private final lub n;
    private final ImageView o;
    private String p;
    private int q;

    public lsp(Activity activity, lsu lsu, lsn lsn, zyw zyw, lub lub, ltz ltz, ltx ltx, View view, View view2, acvx acvx) {
        this.a = activity;
        this.e = lsn;
        this.b = lsu;
        this.i = foh.p(zyw);
        this.n = lub;
        this.c = (ltx) amqw.a((Object) ltx);
        this.d = ((acvx) amqw.a((Object) acvx)).a((acxe) this);
        this.g = (TextView) view.findViewById(R.id.set_title);
        this.h = (TextView) view.findViewById(R.id.set_subtitle);
        this.o = (ImageView) view.findViewById(R.id.set_expand_button);
        lss lss = new lss(this, ltx);
        this.o.setOnClickListener(lss);
        view.setOnClickListener(lss);
        this.f = (LoadingFrameLayout) amqw.a((Object) view2);
        lsu.a.add(this);
        amqw.a((Object) this);
        ltz.a.add(this);
    }

    public final void a(enm enm) {
        if (enm != null) {
            aiqq e = enm.e();
            String c = e.c();
            int d = e.d();
            if (!TextUtils.equals(this.p, c)) {
                this.k = null;
                if (TextUtils.isEmpty(c)) {
                    c();
                }
                b();
                lsl lsl = this.l;
                if (lsl != null) {
                    lsl.a();
                }
            } else if (this.q == d) {
                return;
            } else {
                if (this.j) {
                    this.f.a();
                }
            }
            this.p = c;
            this.q = d;
        }
    }

    public final boolean a() {
        return this.c.a(4);
    }

    public final void a(boolean z) {
        if (z) {
            ajya ajya = this.k;
            if (ajya != null && lsp.a(ajya)) {
                a(this.c.a(4), true);
                return;
            }
        }
        c();
    }

    public static boolean a(ajya ajya) {
        return aebk.a(ajya.e) ^ 1;
    }

    public final void b() {
        if (this.j) {
            lsl lsl = this.l;
            if (lsl != null) {
                lsl.a(null);
            }
            this.f.a();
            this.g.setText(null);
            this.h.setText(null);
            this.h.setVisibility(8);
        }
    }

    public final void a(CharSequence charSequence) {
        this.h.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
    }

    public final void c() {
        this.c.c(2);
        this.n.a();
    }

    public final void a(boolean z, boolean z2) {
        this.c.b(2);
        if (z) {
            this.n.a(true);
        } else {
            this.n.a();
        }
        float f = !z ? 360.0f : 180.0f;
        if (z2) {
            this.o.animate().rotation(f).start();
        } else {
            this.o.setRotation(f);
        }
    }

    public final void d() {
        if (this.j) {
            this.f.a();
        }
    }
}
