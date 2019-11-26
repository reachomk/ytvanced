package defpackage;

import android.view.View.OnClickListener;

/* renamed from: fbb */
final class fbb extends fdd {
    public Boolean a;
    private Boolean b;
    private Boolean c;
    private Integer d;
    private CharSequence e;
    private CharSequence f;
    private OnClickListener g;
    private albc h;

    fbb() {
    }

    public final /* bridge */ /* synthetic */ albe d(boolean z) {
        throw null;
    }

    public final fdd a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final fdd a(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"duration\" has not been set");
    }

    /* Access modifiers changed, original: final */
    public final CharSequence b() {
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final fde c() {
        String str = "";
        if (this.b == null) {
            str = str.concat(" rateLimited");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" shownOnFullscreen");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" counterfactual");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" duration");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" text");
        }
        if (str.isEmpty()) {
            return new fay(this.b.booleanValue(), this.c.booleanValue(), this.a.booleanValue(), this.d.intValue(), this.e, this.f, this.g, this.h);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
