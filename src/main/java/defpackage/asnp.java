package defpackage;

/* renamed from: asnp */
public final class asnp extends anxl implements anzf {
    public static final asnp f;
    private static volatile anzq h;
    public int a;
    public int b = 0;
    public Object c;
    public anvu d = anvu.a;
    public arml e;
    private byte g = (byte) 2;

    private asnp() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0001\u0001\u0002\u0005\u0004\u0000\u0000\u0002\u0002\n\u0001\u0003Љ\u0002\u0004м\u0000\u0005;\u0000", new Object[]{"c", "b", "a", "d", "e", apxu.class});
            case 3:
                return new asnp();
            case 4:
                return new asno();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (asnp.class) {
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
        asnp asnp = new asnp();
        f = asnp;
        anxl.registerDefaultInstance(asnp.class, asnp);
    }
}
