package defpackage;

/* renamed from: armr */
public final class armr extends anxl implements anzf {
    public static final armr d;
    private static volatile anzq f;
    public int a = 0;
    public Object b;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private armr() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(d, "\u0001\u0003\u0001\u0000\u0001\n\u0003\u0000\u0001\u0002\u0001м\u0000\u0002м\u0000\n\u001a", new Object[]{"b", "a", armt.class, armv.class, "c"});
            case 3:
                return new armr();
            case 4:
                return new armq();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (armr.class) {
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
        armr armr = new armr();
        d = armr;
        anxl.registerDefaultInstance(armr.class, armr);
    }
}
