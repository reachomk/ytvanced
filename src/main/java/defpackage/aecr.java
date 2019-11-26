package defpackage;

import android.content.SharedPreferences;

/* renamed from: aecr */
final /* synthetic */ class aecr implements afhh {
    private final xsf a;
    private final SharedPreferences b;

    aecr(xsf xsf, SharedPreferences sharedPreferences) {
        this.a = xsf;
        this.b = sharedPreferences;
    }

    public final ovi a(ovi ovi) {
        return new oxy(this.a.a(this.b).getEncoded(), ovi);
    }
}
