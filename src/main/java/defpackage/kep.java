package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kep */
public final class kep implements akox {
    private final Context a;
    private final akpn b;
    private final akvp c;
    private final fna d;
    private final lwc e;

    public kep(Context context, akpn akpn, akvp akvp, fna fna, lwc lwc) {
        this.a = context;
        this.b = akpn;
        this.c = akvp;
        this.d = fna;
        this.e = lwc;
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new ken(this.a, this.b, this.c, this.d, this.e, viewGroup);
    }
}
