package defpackage;

/* renamed from: asei */
public final class asei extends anxl implements anzf {
    public static final asei f;
    private static volatile anzq h;
    public int a;
    public ashy b;
    public String c = "";
    public anyd d = anxl.emptyProtobufList();
    public anyd e = anxl.emptyProtobufList();
    private byte g = (byte) 2;

    private asei() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0001\u0001Љ\u0000\u0002\b\u0001\u0005\u001a\u0006\u001a", new Object[]{"a", "b", "c", "e", "d"});
            case 3:
                return new asei();
            case 4:
                return new asel();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (asei.class) {
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
        asei asei = new asei();
        f = asei;
        anxl.registerDefaultInstance(asei.class, asei);
    }
}
