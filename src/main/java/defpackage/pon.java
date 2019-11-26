package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* renamed from: pon */
public final class pon {
    public String a;
    private final String b;
    private final boolean c;

    public pon(String str) {
        pzr.a(str, (Object) "The log tag cannot be null or empty.");
        this.b = str;
        this.c = str.length() <= 23;
    }

    public final void a(String str, Object... objArr) {
    }

    public final void b(String str, Object... objArr) {
    }

    public final void c(String str, Object... objArr) {
        Log.w(this.b, e(str, objArr));
    }

    public final void d(String str, Object... objArr) {
        Log.e(this.b, e(str, objArr));
    }

    public final void a(Throwable th, String str, Object... objArr) {
        Log.e(this.b, e(str, objArr), th);
    }

    public final String e(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.a)) {
            return str;
        }
        String valueOf = String.valueOf(this.a);
        str = String.valueOf(str);
        return str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
    }
}
