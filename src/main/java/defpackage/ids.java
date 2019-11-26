package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: ids */
public final class ids {
    public final Context a;
    public final icw b;
    public final aile c;
    public final bdfu d;
    public ifl e;
    public xqc f;
    public xqc g;
    public xqc h;
    public xqc i;
    public xqc j;
    public ics k;
    public final ict l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q = 0;
    private final ajko r;

    public ids(Context context, icw icw, aile aile, ajko ajko, ict ict) {
        this.a = context;
        this.b = icw;
        this.c = aile;
        this.r = ajko;
        this.d = new bdfu();
        this.l = ict;
    }

    public final void a(boolean z) {
        int a;
        if (z) {
            a = this.c.a();
        } else {
            a = -this.c.a();
        }
        this.r.a(a);
        ifl ifl = this.e;
        ifl.t.post(ifl.A);
    }

    public static boolean a(idn idn) {
        return idn.k().v && !((!idn.e() && !idn.f()) || idn.b() || aicd.c(idn.k()) || idn.d() || idn.g() || idn.j() || idn.h() || idn.i());
    }

    public static void a(View view, int i, int i2) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i2;
        }
    }
}
