package defpackage;

/* renamed from: xhc */
public abstract class xhc {
    xhc() {
    }

    public abstract String a();

    public abstract String b();

    public abstract xgy c();

    public abstract xhb d();

    public abstract int e();

    public abstract Integer f();

    public abstract Integer g();

    public static xhg h() {
        return new xhg();
    }

    public static xhg a(String str) {
        xhg h = xhc.h();
        h.a = "GET";
        h.b = str;
        return h;
    }

    public static xhg b(String str) {
        xhg h = xhc.h();
        h.a = "POST";
        h.b = str;
        h.c = xhd.d;
        return h;
    }
}
