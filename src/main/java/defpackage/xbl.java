package defpackage;

/* renamed from: xbl */
public final class xbl {
    public final String a;
    public final Object b;

    private xbl(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public static xbl a(String str, Object obj) {
        return new xbl(str, obj);
    }
}
