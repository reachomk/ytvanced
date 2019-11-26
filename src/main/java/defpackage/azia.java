package defpackage;

/* renamed from: azia */
public final class azia extends anxl implements anzf {
    public static final azia o;
    private static volatile anzq q;
    public int a;
    public aygk b;
    public apxu c;
    public arml d;
    public arml e;
    public arml f;
    public ayri g;
    public apdx h;
    public anyd i = anxl.emptyProtobufList();
    public azgs j;
    public axak k;
    public azgw l;
    public aodx m;
    public anvu n = anvu.a;
    private byte p = (byte) 2;

    private azia() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.p = b;
                return null;
            case 2:
                return anxl.newMessageInfo(o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0001\u000b\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0007\n\f\bЉ\u0006\tЛ\nЉ\u0007\u000bЉ\t\f\t\n\rЉ\u0005\u000eЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "n", "h", "i", ayfu.class, "j", "l", "m", "g", "k"});
            case 3:
                return new azia();
            case 4:
                return new azid();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (azia.class) {
                        obj3 = q;
                        if (obj3 == null) {
                            obj3 = new anxn(o);
                            q = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azia azia = new azia();
        o = azia;
        anxl.registerDefaultInstance(azia.class, azia);
    }
}
