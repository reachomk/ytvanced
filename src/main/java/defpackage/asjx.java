package defpackage;

/* renamed from: asjx */
public final class asjx extends anxl implements anzf {
    public static final asjx h;
    private static volatile anzq j;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    public aska d;
    public askc e;
    public anyd f = anxl.emptyProtobufList();
    public anvu g;
    private byte i = (byte) 2;

    private asjx() {
        anxl.emptyProtobufList();
        this.g = anvu.a;
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0002\u0005\u0001Љ\u0000\u0003Л\u0004Љ\u0001\u0005Љ\u0002\b\n\u0004\tЛ", new Object[]{"a", "b", "c", asjt.class, "d", "e", "g", "f", apxu.class});
            case 3:
                return new asjx();
            case 4:
                return new asjw();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (asjx.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
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
        asjx asjx = new asjx();
        h = asjx;
        anxl.registerDefaultInstance(asjx.class, asjx);
    }
}
