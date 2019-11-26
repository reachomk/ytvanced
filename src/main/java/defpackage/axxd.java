package defpackage;

/* renamed from: axxd */
public final class axxd extends anxl implements anzf {
    public static final axxd h;
    private static volatile anzq j;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public int c;
    public int d;
    public arup e;
    public int f;
    public anvu g = anvu.a;
    private byte i = (byte) 2;

    private axxd() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0002\u0001Л\u0002\u0004\u0000\u0004Љ\u0003\u0006\n\u0006\u0007\u0004\u0001\b\f\u0004", new Object[]{"a", "b", axxf.class, "c", "e", "g", "d", "f", avkw.a});
            case 3:
                return new axxd();
            case 4:
                return new axxc();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (axxd.class) {
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
        axxd axxd = new axxd();
        h = axxd;
        anxl.registerDefaultInstance(axxd.class, axxd);
    }
}
