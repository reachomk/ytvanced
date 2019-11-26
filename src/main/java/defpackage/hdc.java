package defpackage;

import android.content.SharedPreferences;

/* renamed from: hdc */
public final class hdc extends egj {
    public final aeab a;
    public final SharedPreferences b;
    public final zyw c;
    public final xsc d;
    private final aeag e;

    hdc(nn nnVar, exu exu, aeag aeag, aeab aeab, SharedPreferences sharedPreferences, zyw zyw, xsc xsc) {
        super(nnVar, exu, "MdxAssistedTvSignInDialogFragmentController");
        this.e = aeag;
        this.a = aeab;
        this.b = sharedPreferences;
        this.c = zyw;
        this.d = xsc;
    }

    public final void h() {
        this.a.a(this.e.d.c, "canceled");
        this.e.a();
    }
}
