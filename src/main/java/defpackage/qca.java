package defpackage;

import java.util.concurrent.Callable;

/* renamed from: qca */
public class qca {
    public static final qca a = new qca(true);
    public final boolean b;

    qca(boolean z) {
        this.b = z;
    }

    static qca a(Callable callable) {
        return new qbz();
    }

    public static qca a(String str) {
        return new qca(false);
    }

    static qca b(String str) {
        return new qca(false);
    }

    static String a(String str, qbs qbs, boolean z, boolean z2) {
        String str2 = !z2 ? "not whitelisted" : "debug cert rejected";
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{str2, str, qay.a(qba.a("SHA-1").digest(qbs.c())), Boolean.valueOf(z), "13280009.false"});
    }
}
