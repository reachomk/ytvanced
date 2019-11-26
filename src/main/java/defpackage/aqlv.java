package defpackage;

/* renamed from: aqlv */
public final class aqlv extends anxl implements anzf {
    public static final aqlv i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public aygk c;
    public arml d;
    public arml e;
    public aphj f;
    public aphj g;
    public apfm h;
    private byte j = (byte) 2;

    private aqlv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0007\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0002\u0005Љ\u0003\u0006Љ\u0004\tЉ\u0006\nЉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "h", "g"});
            case 3:
                return new aqlv();
            case 4:
                return new aqlu();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aqlv.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqlv aqlv = new aqlv();
        i = aqlv;
        anxl.registerDefaultInstance(aqlv.class, aqlv);
    }
}
