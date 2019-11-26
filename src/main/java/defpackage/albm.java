package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: albm */
final class albm extends alco {
    private Boolean a;
    private Integer b;
    private Boolean c;
    private View d;
    private CharSequence e;
    private CharSequence f;
    private CharSequence g;
    private OnClickListener h;
    private aphg i;
    private CharSequence j;
    private OnClickListener k;
    private aphg l;
    private Integer m;
    private Integer n;
    private Integer o;
    private Integer p;
    private Float q;
    private albc r;
    private OnClickListener s;
    private alcj t;

    albm() {
    }

    public final alco a(int i) {
        this.b = Integer.valueOf(i);
        return this;
    }

    public final alco b(int i) {
        this.m = Integer.valueOf(i);
        return this;
    }

    public final alco a(OnClickListener onClickListener) {
        this.s = onClickListener;
        return this;
    }

    public final alco a(alcj alcj) {
        this.t = alcj;
        return this;
    }

    public final alcp a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" counterfactual");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" duration");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" rateLimited");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" tapDismissalType");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" targetEffectType");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" placement");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" alignment");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" maxWidthPercentage");
        }
        if (str.isEmpty()) {
            return new albn(this.a.booleanValue(), this.b.intValue(), this.c.booleanValue(), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m.intValue(), this.n.intValue(), this.o.intValue(), this.p.intValue(), this.q.floatValue(), this.r, this.s, this.t);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    public final /* synthetic */ albu b() {
        return a();
    }

    public final /* synthetic */ albx e(int i) {
        this.o = Integer.valueOf(i);
        return this;
    }

    public final /* synthetic */ albx f(int i) {
        this.n = Integer.valueOf(i);
        return this;
    }

    public final /* synthetic */ albx g(int i) {
        b(i);
        return this;
    }

    public final /* synthetic */ albe f() {
        this.c = Boolean.valueOf(false);
        return this;
    }
}
