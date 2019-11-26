package defpackage;

/* renamed from: aptr */
public final class aptr extends anxl implements anzf {
    public static final aptr g;
    private static volatile anzq i;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public int c = 3;
    public anvu d = anvu.a;
    public boolean e;
    public arml f;
    private byte h = (byte) 2;

    private aptr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0002\u0001Л\u0002\u0004\u0000\u0004\n\u0002\u0005\u0007\u0003\u0006Љ\u0004", new Object[]{"a", "b", aptt.class, "c", "d", "e", "f"});
            case 3:
                return new aptr();
            case 4:
                return new aptq();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aptr.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aptr aptr = new aptr();
        g = aptr;
        anxl.registerDefaultInstance(aptr.class, aptr);
    }
}
