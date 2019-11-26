package defpackage;

/* renamed from: aolz */
public final class aolz extends anxl implements anzf {
    public static final aolz m;
    private static volatile anzq o;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public apxu i;
    public boolean j;
    public aphj k;
    public anvu l = anvu.a;
    private byte n = (byte) 2;

    private aolz() {
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
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\t\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0005\u0004Љ\u0006\u0005Љ\u0007\u0006\u0007\b\bЉ\t\tЉ\u0002\nЉ\u0003\u000b\n\n\rЉ\u0004", new Object[]{"a", "b", "c", "g", "h", "i", "j", "k", "d", "e", "l", "f"});
            case 3:
                return new aolz();
            case 4:
                return new aomc();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (aolz.class) {
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
        aolz aolz = new aolz();
        m = aolz;
        anxl.registerDefaultInstance(aolz.class, aolz);
    }
}
