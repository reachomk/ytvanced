package defpackage;

/* renamed from: aywl */
public final class aywl extends anxl implements anzf {
    public static final aywl f;
    private static volatile anzq h;
    public int a;
    public boolean b;
    public arml c;
    public apxu d;
    public anyd e = anxl.emptyProtobufList();
    private byte g = (byte) 2;

    private aywl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u0007\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Л", new Object[]{"a", "b", "c", "d", "e", aywr.class});
            case 3:
                return new aywl();
            case 4:
                return new aywk();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aywl.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aywl aywl = new aywl();
        f = aywl;
        anxl.registerDefaultInstance(aywl.class, aywl);
    }
}
