package defpackage;

import java.util.Locale;

/* renamed from: bcrk */
public abstract class bcrk extends bcpn {
    public final bcpm b;

    protected bcrk(bcpm bcpm) {
        if (bcpm != null) {
            this.b = bcpm;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    public boolean b(long j) {
        return false;
    }

    public final boolean c() {
        return true;
    }

    public bcpx f() {
        return null;
    }

    public final bcpm a() {
        return this.b;
    }

    public final String b() {
        return this.b.x;
    }

    public String a(long j, Locale locale) {
        return a(a(j), locale);
    }

    public String a(int i, Locale locale) {
        return Integer.toString(i);
    }

    public String b(long j, Locale locale) {
        return b(a(j), locale);
    }

    public String b(int i, Locale locale) {
        return a(i, locale);
    }

    public long a(long j, int i) {
        return d().a(j, i);
    }

    public long a(long j, String str, Locale locale) {
        return b(j, a(str, locale));
    }

    /* Access modifiers changed, original: protected */
    public int a(String str, Locale locale) {
        try {
            str = Integer.parseInt(str);
            return str;
        } catch (NumberFormatException unused) {
            throw new bcpy(this.b, str);
        }
    }

    public int e(long j) {
        return h();
    }

    public int a(Locale locale) {
        int h = h();
        if (h >= 0) {
            if (h < 10) {
                return 1;
            }
            if (h < 100) {
                return 2;
            }
            if (h < 1000) {
                return 3;
            }
        }
        return Integer.toString(h).length();
    }

    public long d(long j) {
        return j - c(j);
    }

    public final String toString() {
        String b = b();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(b).length() + 15);
        stringBuilder.append("DateTimeField[");
        stringBuilder.append(b);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
