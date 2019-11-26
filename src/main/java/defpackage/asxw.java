package defpackage;

/* renamed from: asxw */
public final class asxw extends anxl implements anzf {
    public static final asxw u;
    private static volatile anzq w;
    public int a;
    public int b;
    public ashy c;
    public String d = "";
    public asxn e;
    public aswr f;
    public asxf g;
    public asxl h;
    public aswp i;
    public aswn j;
    public aswz k;
    public asxd l;
    public aswt m;
    public asxp n;
    public asxr o;
    public asxh p;
    public asxb q;
    public aswv r;
    public aswx s;
    public asxj t;
    private byte v = (byte) 2;

    private asxw() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.v = b;
                return null;
            case 2:
                return anxl.newMessageInfo(u, "\u0001\u0012\u0000\u0002\u00011\u0012\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0007\u0007\t\b\u000b\t\f\r\t\u000e\u000e\t\u000f\u0011\t\u0012\u0012\t\u0013\u0014\t\u0015\u0015\t\u0016\u0016\t\u0017\u0017\t\u0019\u0019\t\u001a1\t.", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"});
            case 3:
                return new asxw();
            case 4:
                return new asxv();
            case 5:
                return u;
            case 6:
                Object obj3 = w;
                if (obj3 == null) {
                    synchronized (asxw.class) {
                        obj3 = w;
                        if (obj3 == null) {
                            obj3 = new anxn(u);
                            w = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asxw asxw = new asxw();
        u = asxw;
        anxl.registerDefaultInstance(asxw.class, asxw);
    }
}
