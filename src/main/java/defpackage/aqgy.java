package defpackage;

/* renamed from: aqgy */
public final class aqgy extends anxl implements anzf {
    public static final aqgy c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aqgy() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000ἑ䬞\u0002\u0000\u0000\u0002ἑм\u0000䬞м\u0000", new Object[]{"b", "a", aphg.class, aohe.class});
            case 3:
                return new aqgy();
            case 4:
                return new aqgx();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aqgy.class) {
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
        aqgy aqgy = new aqgy();
        c = aqgy;
        anxl.registerDefaultInstance(aqgy.class, aqgy);
    }
}
