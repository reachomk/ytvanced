package defpackage;

/* renamed from: aqkx */
public final class aqkx extends anxl implements anzf {
    public static final aqkx g;
    private static volatile anzq i;
    public int a;
    public int b = 0;
    public Object c;
    public arwf d;
    public aodv e;
    public aqkv f;
    private byte h = (byte) 2;

    private aqkx() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0001\u0001\u0001\u0007\u0005\u0000\u0000\u0003\u0001\t\u0000\u0002м\u0000\u0003м\u0000\u0004\t\u0003\u0007Љ\u0006", new Object[]{"c", "b", "a", "d", apxu.class, apxu.class, "e", "f"});
            case 3:
                return new aqkx();
            case 4:
                return new aqkw();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aqkx.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqkx aqkx = new aqkx();
        g = aqkx;
        anxl.registerDefaultInstance(aqkx.class, aqkx);
    }
}
