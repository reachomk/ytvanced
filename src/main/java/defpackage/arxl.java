package defpackage;

/* renamed from: arxl */
public final class arxl extends anxl implements anzf {
    public static final arxl n;
    private static volatile anzq p;
    public int a;
    public arml b;
    public apxu c;
    public aygk d;
    public arml e;
    public arml f;
    public arml g;
    public apxu h;
    public anyd i = anxl.emptyProtobufList();
    public anvu j = anvu.a;
    public float k;
    public arml l;
    public arxh m;
    private byte o = (byte) 2;

    private arxl() {
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
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0001\b\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\bЉ\u0007\t\u001b\u000b\n\t\f\u0001\n\rЉ\u000b\u000e\t\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", aule.class, "j", "k", "l", "m"});
            case 3:
                return new arxl();
            case 4:
                return new arxo();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (arxl.class) {
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
        arxl arxl = new arxl();
        n = arxl;
        anxl.registerDefaultInstance(arxl.class, arxl);
    }
}
