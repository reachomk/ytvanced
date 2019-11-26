package defpackage;

/* renamed from: aqba */
public final class aqba extends anxl implements anzf {
    public static final aqba d;
    private static volatile anzq f;
    public int a;
    public arml b;
    public apzs c;
    private byte e = (byte) 2;

    private aqba() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0002\u0003Љ\u0001\u0005Љ\u0000", new Object[]{"a", "c", "b"});
            case 3:
                return new aqba();
            case 4:
                return new aqaz();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aqba.class) {
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
        aqba aqba = new aqba();
        d = aqba;
        anxl.registerDefaultInstance(aqba.class, aqba);
    }
}
