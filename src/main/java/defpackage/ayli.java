package defpackage;

/* renamed from: ayli */
public final class ayli extends anxl implements anzf {
    public static final ayli c;
    private static volatile anzq e;
    public int a;
    public aylg b;
    private byte d = (byte) 2;

    private ayli() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001ⵔⵔ\u0001\u0000\u0000\u0001ⵔЉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ayli();
            case 4:
                return new ayll();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ayli.class) {
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
        ayli ayli = new ayli();
        c = ayli;
        anxl.registerDefaultInstance(ayli.class, ayli);
    }
}
