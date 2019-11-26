package defpackage;

/* renamed from: aofc */
public final class aofc extends anxl implements anzf {
    public static final aofc c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aofc() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000ḿ▻\u0002\u0000\u0000\u0002ḿм\u0000▻м\u0000", new Object[]{"b", "a", aoex.class, aqeq.class});
            case 3:
                return new aofc();
            case 4:
                return new aoff();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aofc.class) {
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
        aofc aofc = new aofc();
        c = aofc;
        anxl.registerDefaultInstance(aofc.class, aofc);
    }
}
