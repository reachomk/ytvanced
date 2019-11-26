package defpackage;

import android.text.TextUtils;

/* renamed from: fdd */
public abstract class fdd extends albk implements fbu {
    public abstract int a();

    public abstract CharSequence b();

    public abstract fde c();

    public final /* synthetic */ albl d() {
        if (a() == -1 && !TextUtils.isEmpty(b())) {
            c(0);
        }
        return c();
    }
}
