package defpackage;

/* renamed from: auuc */
public final class auuc extends anxl implements anzf {
    public static final auuc p;
    private static volatile anzq r;
    public int a;
    public aygk b;
    public arwf c;
    public anyd d = anxl.emptyProtobufList();
    public auue e;
    public auue f;
    public apxu g;
    public int h;
    public anvu i = anvu.a;
    public anyd j = anxl.emptyProtobufList();
    public boolean k;
    public arml l;
    public boolean m;
    public apxu n;
    public int o;
    private byte q = (byte) 2;

    private auuc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.q = b;
                return null;
            case 2:
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0002\b\u0001Љ\u0000\u0002Л\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006\f\u0006\t\n\t\nЛ\u000b\u0007\n\r\t\u0001\u000eЉ\u000b\u000f\u0007\f\u0010Љ\r\u0011\u0004\u000e", new Object[]{"a", "b", "d", arml.class, "e", "f", "g", "h", auuf.a, "i", "j", apxu.class, "k", "c", "l", "m", "n", "o"});
            case 3:
                return new auuc();
            case 4:
                return new auub();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (auuc.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(p);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auuc auuc = new auuc();
        p = auuc;
        anxl.registerDefaultInstance(auuc.class, auuc);
    }
}
