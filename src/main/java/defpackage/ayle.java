package defpackage;

/* renamed from: ayle */
public final class ayle extends anxl implements anzf {
    public static final ayle g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public arml d;
    public aqkp e;
    public aqjq f;
    private byte h = (byte) 2;

    private ayle() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0005\u0001Л\u0004Љ\u0000\u0005Љ\u0003\u0006Љ\u0001\u0007Љ\u0002", new Object[]{"a", "c", ayli.class, "b", "f", "d", "e"});
            case 3:
                return new ayle();
            case 4:
                return new aylh();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (ayle.class) {
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
        ayle ayle = new ayle();
        g = ayle;
        anxl.registerDefaultInstance(ayle.class, ayle);
    }
}
