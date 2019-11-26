package defpackage;

/* renamed from: qam */
public final class qam {
    public qam(String str) {
        pzr.a((Object) str, (Object) "log tag cannot be null");
        Object[] objArr = new Object[]{str, Integer.valueOf(23)};
        if (str.length() > 23) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
    }
}
