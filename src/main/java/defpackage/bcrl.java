package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* renamed from: bcrl */
public abstract class bcrl implements Serializable {
    public static final long serialVersionUID = 1971226328211649661L;

    public abstract bcpn a();

    public abstract long b();

    /* Access modifiers changed, original: protected */
    public bcpl c() {
        throw null;
    }

    private final bcpm d() {
        return a().a();
    }

    private final int e() {
        return a().a(b());
    }

    public final String a(Locale locale) {
        return a().a(b(), locale);
    }

    public final String b(Locale locale) {
        return a().b(b(), locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bcrl) {
            bcrl bcrl = (bcrl) obj;
            return e() == bcrl.e() && d().equals(bcrl.d()) && bcrr.a(c(), bcrl.c());
        }
    }

    public final int hashCode() {
        return ((e() * 17) + d().hashCode()) + c().hashCode();
    }

    public final String toString() {
        String b = a().b();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(b).length() + 10);
        stringBuilder.append("Property[");
        stringBuilder.append(b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
