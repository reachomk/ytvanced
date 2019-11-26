package defpackage;

/* renamed from: aqjw */
public final class aqjw extends anxl implements anzf {
    public static final aqjw d;
    private static volatile anzq f;
    public int a;
    public aqju b;
    public aqka c;
    private byte e = (byte) 2;

    private aqjw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001︌␇㘷\u0002\u0000\u0000\u0002︌␇Љ\u0000㘷Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new aqjw();
            case 4:
                return new aqjv();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aqjw.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqjw aqjw = new aqjw();
        d = aqjw;
        anxl.registerDefaultInstance(aqjw.class, aqjw);
    }
}
