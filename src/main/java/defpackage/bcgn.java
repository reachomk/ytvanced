package defpackage;

/* renamed from: bcgn */
public final class bcgn {
    private static bcgn a;
    private final bcgp b;
    private final int c;

    private static synchronized bcgn a() {
        bcgn bcgn;
        synchronized (bcgn.class) {
            if (a == null) {
                a = new bcgn(bcgq.a);
            }
            bcgn = a;
        }
        return bcgn;
    }

    private bcgn(bcgp bcgp) {
        this.b = (bcgp) bcgg.a(bcgp);
        int i = 7;
        while (i >= 2 && this.b.a("AppAuth", i)) {
            i--;
        }
        this.c = i + 1;
    }

    public static void a(String str, Object... objArr) {
        bcgn.a().a(3, str, objArr);
    }

    public static void b(String str, Object... objArr) {
        bcgn.a().a(4, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        bcgn.a().a(5, str, objArr);
    }

    public static void d(String str, Object... objArr) {
        bcgn.a().a(6, str, objArr);
    }

    private final void a(int i, String str, Object... objArr) {
        if (this.c <= i) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            this.b.a(i, "AppAuth", str);
        }
    }
}
