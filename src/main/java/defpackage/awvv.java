package defpackage;

/* renamed from: awvv */
public final class awvv extends anxl implements anzf {
    public static final awvv c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private awvv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0007\u0001\u0000ᾮ厫\u0007\u0000\u0000\u0005ᾮм\u0000ﭥ㇃м\u0000㒖<\u0000㛸м\u0000㨊м\u0000卺м\u0000厫<\u0000", new Object[]{"b", "a", auvn.class, apeb.class, ayfq.class, ayfc.class, ayfy.class, awwd.class, awwf.class});
            case 3:
                return new awvv();
            case 4:
                return new awvu();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (awvv.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awvv awvv = new awvv();
        c = awvv;
        anxl.registerDefaultInstance(awvv.class, awvv);
    }
}
