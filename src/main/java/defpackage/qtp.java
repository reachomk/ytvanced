package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: qtp */
public abstract class qtp {
    public static ContentResolver a;
    public final String b;
    public final Object c;

    public static void a(Context context) {
        a = context.getContentResolver();
    }

    public abstract Object a();

    protected qtp(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static qtp a(String str) {
        return new qts(str, Boolean.valueOf(false));
    }
}
