package defpackage;

import android.view.View.OnClickListener;

/* renamed from: faz */
final class faz extends fck {
    public Boolean a;
    private Boolean b;
    private Boolean c;
    private Integer d;
    private CharSequence e;
    private CharSequence f;
    private CharSequence g;
    private OnClickListener h;
    private CharSequence i;
    private OnClickListener j;
    private aygk k;
    private Integer l;
    private acwc m;
    private albc n;

    faz() {
    }

    public final fck a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Property \"counterfactual\" has not been set");
    }

    public final fck a(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final CharSequence b() {
        return this.e;
    }

    /* Access modifiers changed, original: final */
    public final CharSequence c() {
        return this.g;
    }

    public final fch d() {
        String str = "";
        if (this.b == null) {
            str = str.concat(" rateLimited");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" shownOnFullscreen");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" counterfactual");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" duration");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" icon");
        }
        if (str.isEmpty()) {
            return new fax(this.b.booleanValue(), this.a.booleanValue(), this.c.booleanValue(), this.d.intValue(), this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l.intValue(), this.m, this.n);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    public final /* synthetic */ albg e() {
        return d();
    }
}
