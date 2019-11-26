package defpackage;

/* renamed from: asdy */
public final class asdy extends anxl implements anzf {
    public static final asdy e;
    private static volatile anzq g;
    public int a;
    public ashy b;
    public String c;
    public String d;
    private byte f = (byte) 2;

    private asdy() {
        String str = "";
        this.c = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\b\u0004", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new asdy();
            case 4:
                return new aseb();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (asdy.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asdy asdy = new asdy();
        e = asdy;
        anxl.registerDefaultInstance(asdy.class, asdy);
    }
}
