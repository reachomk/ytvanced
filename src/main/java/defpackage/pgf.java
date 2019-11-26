package defpackage;

import android.content.Context;

/* renamed from: pgf */
public final class pgf {
    public final Context a;
    public final Context b;

    public pgf(Context context) {
        pzr.a((Object) context);
        Object applicationContext = context.getApplicationContext();
        pzr.a(applicationContext, (Object) "Application context can't be null");
        this.a = applicationContext;
        this.b = applicationContext;
    }
}
