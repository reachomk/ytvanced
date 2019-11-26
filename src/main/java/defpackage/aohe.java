package defpackage;

/* renamed from: aohe */
public final class aohe extends anxl implements anzf {
    public static final aohe m;
    private static volatile anzq o;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public aygk e;
    public arwf f;
    public int g;
    public int h;
    public int i;
    public apxu j;
    public anyd k = anxl.emptyProtobufList();
    public anvu l = anvu.a;
    private byte n = (byte) 2;

    private aohe() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0001\u0001\u0001\f\u000b\u0000\u0001\u0004\u0001Љ\u0000\u0002Љ\u0001\u0003>\u0000\u0004\u000b\u0005\u0005Љ\b\u0007\n\n\b\u000b\u0006\t\u000b\u0007\nЛ\u000b?\u0000\f\t\u0002", new Object[]{"c", "b", "a", "d", "e", "g", "j", "l", "h", "i", "k", apxu.class, ayem.a(), "f"});
            case 3:
                return new aohe();
            case 4:
                return new aohg();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (aohe.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aohe aohe = new aohe();
        m = aohe;
        anxl.registerDefaultInstance(aohe.class, aohe);
    }
}
