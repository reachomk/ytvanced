package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: pgc */
public class pgc {
    public final pgd g;

    protected pgc(pgd pgd) {
        pzr.a((Object) pgd);
        this.g = pgd;
    }

    /* Access modifiers changed, original: protected|final */
    public final qaw h() {
        return this.g.c;
    }

    /* Access modifiers changed, original: protected|final */
    public final Context i() {
        return this.g.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final pfm j() {
        return this.g.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final pev k() {
        return this.g.d;
    }

    public final pgv l() {
        return this.g.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final pfh m() {
        return this.g.c();
    }

    /* Access modifiers changed, original: protected|final */
    public final pfc n() {
        pgd pgd = this.g;
        pgd.a(pgd.f);
        return pgd.f;
    }

    /* Access modifiers changed, original: protected|final */
    public final pfx o() {
        return this.g.d();
    }

    /* Access modifiers changed, original: protected|final */
    public final pfq p() {
        pgd pgd = this.g;
        pgd.a(pgd.g);
        return pgd.g;
    }

    public final void a(String str) {
        b(2, str, null, null, null);
    }

    public final void a(String str, Object obj) {
        b(2, str, obj, null, null);
    }

    public final void a(String str, Object obj, Object obj2) {
        b(2, str, obj, obj2, null);
    }

    public final void b(String str, Object obj) {
        b(3, str, obj, null, null);
    }

    public final void b(String str) {
        b(5, str, null, null, null);
    }

    public final void c(String str, Object obj) {
        b(5, str, obj, null, null);
    }

    public final void b(String str, Object obj, Object obj2) {
        b(5, str, obj, obj2, null);
    }

    public final void c(String str) {
        b(6, str, null, null, null);
    }

    public final void d(String str, Object obj) {
        b(6, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        b(6, str, obj, obj2, null);
    }

    public final void b(int i, String str, Object obj, Object obj2, Object obj3) {
        pgd pgd = this.g;
        pfm pfm = pgd != null ? pgd.e : null;
        String str2;
        if (pfm == null) {
            str2 = (String) pel.b.a;
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, pgc.a(str, obj, obj2, obj3));
            }
            return;
        }
        str2 = (String) pel.b.a;
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, pgc.a(str, obj, obj2, obj3));
        }
        if (i >= 5) {
            pfm.a(i, str, obj, obj2, obj3);
        }
    }

    protected static String a(String str, Object obj, Object obj2, Object obj3) {
        CharSequence str2;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        String a = pgc.a(obj);
        String a2 = pgc.a(obj2);
        String a3 = pgc.a(obj3);
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            stringBuilder.append(str2);
            str3 = ": ";
        }
        String str4 = ", ";
        if (!TextUtils.isEmpty(a)) {
            stringBuilder.append(str3);
            stringBuilder.append(a);
            str3 = str4;
        }
        if (!TextUtils.isEmpty(a2)) {
            stringBuilder.append(str3);
            stringBuilder.append(a2);
            str3 = str4;
        }
        if (!TextUtils.isEmpty(a3)) {
            stringBuilder.append(str3);
            stringBuilder.append(a3);
        }
        return stringBuilder.toString();
    }

    private static String a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj != Boolean.TRUE ? "false" : "true";
        } else {
            if (obj instanceof Throwable) {
                return ((Throwable) obj).toString();
            }
            return obj.toString();
        }
    }
}
