package defpackage;

/* renamed from: axid */
public final class axid extends anxl implements anzf {
    public static final axid f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public apxu c;
    public apxu d;
    public anvu e = anvu.a;
    private byte g = (byte) 2;

    private axid() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0003\u0002Љ\u0002\u0003Љ\u0003\u0004\n\u0005\u0007Љ\u0004", new Object[]{"a", "b", "c", "e", "d"});
            case 3:
                return new axid();
            case 4:
                return new axig();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (axid.class) {
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
        axid axid = new axid();
        f = axid;
        anxl.registerDefaultInstance(axid.class, axid);
    }
}
