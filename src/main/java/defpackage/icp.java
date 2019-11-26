package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: icp */
public final class icp {
    public View a;
    public ImageView b;
    public TextView c;
    public TextView d;
    public xqc e;
    public boolean f = false;
    private final akkq g;
    private boolean h = true;

    public icp(akkq akkq) {
        this.g = akkq;
    }

    public final void a(boolean z) {
        if (this.h != z) {
            this.h = z;
            xpr.a(this.a, z);
            xpr.a(this.c, this.h);
            xpr.a(this.d, this.h);
        }
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, aygk aygk) {
        xak.a();
        this.c.setText(charSequence);
        this.d.setText(charSequence2);
        if (aygk == null) {
            this.g.a(this.b);
        } else {
            this.g.a(this.b, aygk, akko.h);
        }
    }
}
