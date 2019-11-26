package defpackage;

/* renamed from: asnz */
public final class asnz extends anxl implements anzf {
    public static final asnz g;
    private static volatile anzq i;
    public int a;
    public ashy b;
    public anyd c = anxl.emptyProtobufList();
    public boolean d;
    public asnt e;
    public boolean f;
    private byte h = (byte) 2;

    private asnz() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001Љ\u0000\u0002\u001a\u0003\u0007\u0001\u0004\t\u0002\u0005\u0007\u0003", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new asnz();
            case 4:
                return new asny();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (asnz.class) {
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
        asnz asnz = new asnz();
        g = asnz;
        anxl.registerDefaultInstance(asnz.class, asnz);
    }
}
