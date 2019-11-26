package defpackage;

import android.text.TextUtils;

/* renamed from: akoo */
public final class akoo implements akoq {
    private final Object a;
    private final String b;

    public akoo(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final void a(akor akor, aknh aknh, int i) {
        akor.a(this.b, this.a);
    }

    public static Object a(akor akor, Class cls, String str) {
        if (!(akor == null || TextUtils.isEmpty(str))) {
            Object a = akor.a(str);
            if (cls.isInstance(a)) {
                return cls.cast(a);
            }
        }
        return null;
    }
}
