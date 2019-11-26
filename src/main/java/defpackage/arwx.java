package defpackage;

/* renamed from: arwx */
public final class arwx extends anxl implements anzf {
    public static final arwx c;
    private static volatile anzq e;
    public int a;
    public anvu b = anvu.a;
    private byte d = (byte) 2;

    private arwx() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\n\u0001", new Object[]{"a", "b"});
            case 3:
                return new arwx();
            case 4:
                return new arxa();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (arwx.class) {
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
        arwx arwx = new arwx();
        c = arwx;
        anxl.registerDefaultInstance(arwx.class, arwx);
    }
}
