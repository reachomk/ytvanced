package defpackage;

/* renamed from: ayas */
public final class ayas extends anxl implements anzf {
    public static final ayas c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private ayas() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000⡇㺄\u0002\u0000\u0000\u0002⡇м\u0000㺄м\u0000", new Object[]{"b", "a", ayam.class, ayac.class});
            case 3:
                return new ayas();
            case 4:
                return new ayav();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ayas.class) {
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
        ayas ayas = new ayas();
        c = ayas;
        anxl.registerDefaultInstance(ayas.class, ayas);
    }
}
