package defpackage;

/* renamed from: aqcf */
public final class aqcf extends anxl implements anzf {
    public static final aqcf n;
    private static volatile anzq p;
    public int a;
    public aphj b;
    public aphj c;
    public arml d;
    public apxu e;
    public apxu f;
    public apcd g;
    public apcb h;
    public apbz i;
    public aphj j;
    public azru k;
    public aphj l;
    public axak m;
    private byte o = (byte) 2;

    private aqcf() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0001\u0012\f\u0000\u0000\f\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0004\u0005Љ\u0005\bЉ\u0007\tЉ\b\nЉ\t\u000bЉ\u000b\rЉ\n\u000eЉ\u0006\u0010Љ\f\u0012Љ\r", new Object[]{"a", "b", "c", "d", "e", "g", "h", "i", "k", "j", "f", "l", "m"});
            case 3:
                return new aqcf();
            case 4:
                return new aqci();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (aqcf.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqcf aqcf = new aqcf();
        n = aqcf;
        anxl.registerDefaultInstance(aqcf.class, aqcf);
    }
}
