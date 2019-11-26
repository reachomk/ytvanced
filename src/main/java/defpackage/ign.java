package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;

/* renamed from: ign */
public final class ign extends aito implements aigp, enc {
    private final elv a;
    private final akkq b;
    private final akko c = akko.h.g().b(false).a();
    private igq d;

    public ign(Context context, akkq akkq, elv elv) {
        super(context);
        this.a = elv;
        this.b = akkq;
    }

    public final void a(Bitmap bitmap) {
    }

    public final void b(ejd ejd) {
    }

    /* Access modifiers changed, original: protected|final */
    public final aitx b(Context context) {
        aitx b = super.b(context);
        b.a = 0;
        b.f = true;
        b.g = true;
        b.b();
        b.c();
        return b;
    }

    public final boolean c() {
        return this.d != null;
    }

    public final LayoutParams b() {
        return new aiuh(-1, -1, false);
    }

    public final void at_() {
        if (this.d != null) {
            this.d = null;
            m();
        }
    }

    public final void a(igq igq) {
        igq igq2 = this.d;
        if (igq2 != igq) {
            Object obj = 1;
            Object obj2 = igq == null ? null : 1;
            if (igq2 == null && igq == null) {
                obj = null;
            }
            if (igq2 != null && obj2 != null) {
                String str = igq2.a;
                String str2 = igq.a;
                if (!(str == null && str2 == null) && TextUtils.equals(str, str2) && (this.d.b != null || igq.b == null)) {
                    return;
                }
            } else if (obj == null) {
                return;
            }
            this.d = igq;
            m();
        }
    }

    public final boolean a(ejd ejd) {
        return (ejd.k() || ejd.n()) ? false : true;
    }

    public final /* bridge */ /* synthetic */ void a(Context context, View view) {
        akkq akkq = this.b;
        elv elv = this.a;
        ImageView imageView = (ImageView) a();
        igq igq = this.d;
        elq.a(akkq, elv, imageView, igq != null ? igq.a : null, igq != null ? igq.b : null, this.c);
    }
}
