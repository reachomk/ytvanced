package defpackage;

/* renamed from: aqyj */
public final class aqyj extends anxl implements anzf {
    public static final aqyj f;
    private static volatile anzq h;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public boolean e;
    private byte g = (byte) 2;

    private aqyj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001Љ\u0000\u0003\u0007\u0002\u0005м\u0000\u0006м\u0000", new Object[]{"c", "b", "a", "d", "e", apxu.class, aqll.class});
            case 3:
                return new aqyj();
            case 4:
                return new aqyi();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aqyj.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqyj aqyj = new aqyj();
        f = aqyj;
        anxl.registerDefaultInstance(aqyj.class, aqyj);
    }
}
