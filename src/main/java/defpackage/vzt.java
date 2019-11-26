package defpackage;

import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.TextView;

/* renamed from: vzt */
public final class vzt extends vzs {
    public vzt() {
        super(vxi.a().a());
    }

    public final void a() {
        a(((vxi) this.b).b());
    }

    private final void a(vxd vxd) {
        CharSequence charSequence = vxd.b;
        aygk aygk = vxd.d;
        ((vzv) this.c).c.setText(charSequence);
        int i = 0;
        int i2 = 1;
        if (!TextUtils.isEmpty(charSequence) && ((vzv) this.c).d.e() >= ((int) TypedValue.applyDimension(1, 500.0f, ((vzv) this.c).b))) {
            i2 = 0;
        }
        TextView textView = ((vzv) this.c).c;
        if (i2 != 0) {
            i = 8;
        }
        textView.setVisibility(i);
        if (aygk == null) {
            ((vzv) this.c).a.b();
            ((vzv) this.c).a.a(4);
            return;
        }
        ((vzv) this.c).a.a(aygk, new vzw(this, charSequence));
    }

    public final /* synthetic */ void a(Object obj, boolean z) {
        vxd b = ((vxi) obj).b();
        if (!b.equals(((vxi) this.b).b())) {
            a(b);
        }
    }
}
