package defpackage;

import java.util.logging.Logger;

/* renamed from: basr */
public final class basr {
    public static final Logger a = Logger.getLogger(basr.class.getName());
    public static final basr b = new basr(d);
    private static final bavq d = new bavq();
    public final bavq c;

    public static basr a() {
        basr a = bast.a.a();
        return a == null ? b : a;
    }

    public boolean b() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public basy e() {
        return null;
    }

    private basr(bavq bavq) {
        basw basw = new basw(this);
        this.c = bavq;
    }

    public basr c() {
        basr a = bast.a.a(this);
        return a == null ? b : a;
    }

    public void a(basr basr) {
        basr.a(basr, "toAttach");
        bast.a.a(this, basr);
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }
}
