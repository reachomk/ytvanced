package defpackage;

/* renamed from: aoms */
public final class aoms extends anxl implements anzf {
    public static final aoms d;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public axak c;
    private byte e = (byte) 2;

    private aoms() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0001\u0002\u0003Л\u0006Љ\u0000", new Object[]{"a", "b", aomu.class, "c"});
            case 3:
                return new aoms();
            case 4:
                return new aomr();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aoms.class) {
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
        aoms aoms = new aoms();
        d = aoms;
        anxl.registerDefaultInstance(aoms.class, aoms);
    }
}
