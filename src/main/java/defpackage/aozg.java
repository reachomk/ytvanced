package defpackage;

/* renamed from: aozg */
public final class aozg extends anxp implements anzf {
    public static final aozg g;
    private static volatile anzq j;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    public arml e;
    public aozj f;
    private byte i = (byte) 2;

    private aozg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0003\u0005\u0001Л\u0002Љ\u0000\u0004Л\u0006Л\u0007Љ\u0003", new Object[]{"a", "b", aozl.class, "e", "c", aozl.class, "d", aozl.class, "f"});
            case 3:
                return new aozg();
            case 4:
                return new aozr();
            case 5:
                return g;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aozg.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aozg aozg = new aozg();
        g = aozg;
        anxl.registerDefaultInstance(aozg.class, aozg);
    }
}
