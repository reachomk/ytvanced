package defpackage;

/* renamed from: ayme */
public final class ayme extends anxl implements anzf {
    public static final ayme c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private ayme() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000ⰻ㿅\u0002\u0000\u0000\u0002ⰻм\u0000㿅м\u0000", new Object[]{"b", "a", aymc.class, aymg.class});
            case 3:
                return new ayme();
            case 4:
                return new aymh();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ayme.class) {
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
        ayme ayme = new ayme();
        c = ayme;
        anxl.registerDefaultInstance(ayme.class, ayme);
    }
}
