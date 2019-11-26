package defpackage;

import android.content.Context;

/* renamed from: pld */
public abstract class pld {
    public final Context a;
    public final String b;
    public final plf c = new plf(this);

    protected pld(Context context, String str) {
        this.a = ((Context) pzr.a((Object) context)).getApplicationContext();
        this.b = pzr.a(str);
    }

    public abstract pla a(String str);

    public abstract boolean a();
}
