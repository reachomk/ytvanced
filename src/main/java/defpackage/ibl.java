package defpackage;

import android.text.TextUtils;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ibl */
public final class ibl implements ems {
    private final xqc a;
    private final xqc b;
    private final xqc c;
    private final int d;
    private boolean e = true;
    private boolean f;
    private boolean g = true;
    private boolean h;
    private int i = 0;
    private boolean j;
    private CharSequence k;
    private boolean l;
    private StringBuilder m;

    public ibl(xqc xqc, xqc xqc2, xqc xqc3) {
        this.a = (xqc) amqw.a((Object) xqc3);
        this.b = (xqc) amqw.a((Object) xqc);
        this.c = (xqc) amqw.a((Object) xqc2);
        this.d = ((MarginLayoutParams) ((TextView) ((xnz) xqc).a).getLayoutParams()).rightMargin;
        xqc3.a(this.h, false);
        a(null, null);
    }

    public final void a(boolean z) {
        if (this.h != z) {
            this.h = z;
            this.a.a(!z ? 8 : 4);
            xqc xqc = this.a;
            boolean z2 = this.e && this.h;
            xqc.a(z2, false);
            h(false);
            b();
        }
    }

    public final void b(boolean z) {
        if (this.j != z) {
            this.j = z;
            ((TextView) this.a.d()).setClickable(z);
        }
    }

    public final void c(boolean z) {
        int i = !z ? 2 : 1;
        if (this.i != i) {
            this.i = i;
            TextView textView = (TextView) this.a.d();
            adl.a(textView, ra.a(textView.getContext(), this.i == 1 ? R.drawable.player_live_dot : R.drawable.player_notlive_dot), null, null);
            b();
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) ((TextView) this.b.d()).getLayoutParams();
            marginLayoutParams.rightMargin = !a() ? this.d : 0;
            ((TextView) this.b.d()).setLayoutParams(marginLayoutParams);
        }
    }

    public final void d(boolean z) {
        if (this.f != z) {
            this.f = z;
            h(false);
        }
    }

    public final void e(boolean z) {
        this.g = z;
        h(false);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        if (!(TextUtils.equals(this.k, charSequence2) && this.l == this.h)) {
            this.k = charSequence2;
            this.l = this.h;
            if (this.m == null) {
                this.m = new StringBuilder();
            }
            StringBuilder stringBuilder = this.m;
            int i = 0;
            stringBuilder.delete(0, stringBuilder.length());
            if (this.l) {
                this.m.append('-');
            }
            this.m.append(charSequence2);
            TextView textView = (TextView) this.c.d();
            textView.setText(this.m);
            textView.setMinimumWidth(0);
            textView.measure(0, 0);
            int measuredWidth = textView.getMeasuredWidth();
            TextView textView2 = (TextView) this.b.d();
            if (!a()) {
                i = measuredWidth;
            }
            textView2.setMinimumWidth(i);
            ((TextView) this.c.d()).setMinimumWidth(measuredWidth);
        }
        if (a()) {
            charSequence = null;
        }
        if (!ibl.b(charSequence, ((TextView) this.b.d()).getText())) {
            ((TextView) this.b.d()).setText(charSequence);
        }
        if (!ibl.b(charSequence2, ((TextView) this.c.d()).getText())) {
            ((TextView) this.c.d()).setText(charSequence2);
        }
    }

    public final void f(boolean z) {
        a(true, z);
    }

    public final void g(boolean z) {
        a(false, z);
    }

    private final void a(boolean z, boolean z2) {
        if (this.e != z) {
            this.e = z;
            xqc xqc = this.a;
            boolean z3 = false;
            if (z && this.h) {
                z3 = true;
            }
            xqc.a(z3, z2);
            h(z2);
        }
    }

    private final boolean a() {
        return this.h && this.i == 1;
    }

    private final void h(boolean z) {
        boolean z2 = this.f;
        boolean z3 = false;
        Object obj = (z2 && this.g) ? 1 : null;
        Object obj2 = (!z2 || this.h) ? null : 1;
        xqc xqc = this.b;
        boolean z4 = this.e && obj != null;
        xqc.a(z4, z);
        this.c.a(!this.h ? 4 : 8);
        xqc xqc2 = this.c;
        if (this.e && obj2 != null) {
            z3 = true;
        }
        xqc2.a(z3, z);
    }

    private final void b() {
        if (a()) {
            ((TextView) this.b.d()).setText(null);
        }
    }

    private static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        boolean z = true;
        if (!TextUtils.equals(charSequence, charSequence2)) {
            if (!TextUtils.isEmpty(charSequence)) {
                z = false;
            } else if (TextUtils.isEmpty(charSequence2)) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }
}
