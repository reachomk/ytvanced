package defpackage;

/* renamed from: apeb */
public final class apeb extends anxl implements anzf {
    public static final apeb e;
    private static volatile anzq g;
    public int a;
    public String b;
    public String c;
    public arml d;
    private byte f = (byte) 2;

    private apeb() {
        String str = "";
        this.b = str;
        this.c = str;
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0001\u0001\b\u0000\u0002Љ\u0002\u0006\b\u0001", new Object[]{"a", "b", "d", "c"});
            case 3:
                return new apeb();
            case 4:
                return new apea();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (apeb.class) {
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
        apeb apeb = new apeb();
        e = apeb;
        anxl.registerDefaultInstance(apeb.class, apeb);
    }
}
