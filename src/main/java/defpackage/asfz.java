package defpackage;

/* renamed from: asfz */
public final class asfz extends anxl implements anzf {
    public static final asfz g;
    private static volatile anzq i;
    public int a;
    public ashy b;
    public String c;
    public String d;
    public String e;
    public String f;
    private byte h = (byte) 2;

    private asfz() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
        anxl.emptyProtobufList();
        this.f = str;
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0002\u0003\b\u0001\u0004\b\u0003\u000b\b\t", new Object[]{"a", "b", "d", "c", "e", "f"});
            case 3:
                return new asfz();
            case 4:
                return new asfy();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (asfz.class) {
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
        asfz asfz = new asfz();
        g = asfz;
        anxl.registerDefaultInstance(asfz.class, asfz);
    }
}
