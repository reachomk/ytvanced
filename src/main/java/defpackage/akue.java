package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

/* renamed from: akue */
public abstract class akue {
    public abstract TextView a();

    public abstract TextView b();

    public abstract View c();

    public abstract int d();

    public abstract int e();

    public abstract ColorStateList f();

    public abstract int g();

    public abstract ColorStateList h();

    public abstract int i();

    public abstract ColorStateList j();

    public abstract akug k();

    public final void a(apfb apfb) {
        TextView a;
        ColorStateList f;
        int e;
        if (a() != null) {
            if (f() != null) {
                a = a();
                f = f();
                if (apfb == null || (apfb.a & 2) == 0) {
                    akue.a(a, f);
                } else {
                    akue.a(a, apfb.c);
                }
            } else {
                a = a();
                e = e();
                if (apfb == null || (apfb.a & 2) == 0) {
                    akue.a(a, e);
                } else {
                    akue.a(a, apfb.c);
                }
            }
        }
        if (b() != null) {
            if (h() != null) {
                a = b();
                f = h();
                if (apfb == null || (apfb.a & 4) == 0) {
                    akue.a(a, f);
                } else {
                    akue.a(a, apfb.d);
                }
            } else {
                a = b();
                e = g();
                if (apfb == null || (apfb.a & 4) == 0) {
                    akue.a(a, e);
                } else {
                    akue.a(a, apfb.d);
                }
            }
            if (j() != null) {
                a = b();
                f = j();
                if (a != null) {
                    if (apfb != null && (apfb.a & 8) != 0) {
                        a.setLinkTextColor(apfb.e);
                    } else if (f != null) {
                        a.setLinkTextColor(f);
                    }
                }
            } else {
                a = b();
                e = i();
                if (a != null) {
                    if (!(apfb == null || (apfb.a & 8) == 0)) {
                        e = apfb.e;
                    }
                    a.setLinkTextColor(e);
                }
            }
        }
        if (c() != null) {
            View c = c();
            e = d();
            if (c != null) {
                if (!(apfb == null || (apfb.a & 1) == 0)) {
                    e = apfb.b;
                }
                c.setBackgroundColor(e);
            }
        }
    }

    private static void a(TextView textView, int i) {
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    private static void a(TextView textView, ColorStateList colorStateList) {
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
