package defpackage;

/* renamed from: ampd */
public final class ampd extends anxp implements anzf {
    public static final ampd d;
    private static volatile anzq f;
    public int a;
    public boolean b;
    public ampf c;
    private byte e = (byte) 2;

    private ampd() {
        anxl.emptyProtobufList();
        anxl.emptyIntList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyIntList();
        anxl.emptyIntList();
        anxl.emptyProtobufList();
        anxl.emptyIntList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyIntList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0007\u0002\u0000\u0000\u0002\u0002ԇ\u0000\u0007Љ\t", new Object[]{"a", "b", "c"});
            case 3:
                return new ampd();
            case 4:
                return new ampg();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ampd.class) {
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
        ampd ampd = new ampd();
        d = ampd;
        anxl.registerDefaultInstance(ampd.class, ampd);
    }
}
