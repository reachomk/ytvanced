package defpackage;

/* renamed from: aolk */
public final class aolk extends anxp implements anzf {
    public static final aolk r;
    private static volatile anzq t;
    public int a;
    public aygk b;
    public axak c;
    public arml d;
    public axak e;
    public arml f;
    public axak g;
    public arml i;
    public apxu j;
    public float k;
    public anyd l = anxl.emptyProtobufList();
    public aygk m;
    public int n;
    public axak o;
    public anvu p = anvu.a;
    public aolm q;
    private byte s = (byte) 2;

    private aolk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.s = b;
                return null;
            case 2:
                return anxl.newMessageInfo(r, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0001\u000b\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\u0004\u0004Љ\u0006\u0005Љ\u0007\u0006\u0001\b\u0007Л\t\n\r\nЉ\t\u000bЉ\u0001\fЉ\u0003\rЉ\u0005\u000e\u000b\n\u000fЉ\u000b\u0010\t\u000e", new Object[]{"a", "b", "d", "f", "i", "j", "k", "l", apxu.class, "p", "m", "c", "e", "g", "n", "o", "q"});
            case 3:
                return new aolk();
            case 4:
                return new aoln();
            case 5:
                return r;
            case 6:
                Object obj3 = t;
                if (obj3 == null) {
                    synchronized (aolk.class) {
                        obj3 = t;
                        if (obj3 == null) {
                            obj3 = new anxn(r);
                            t = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aolk aolk = new aolk();
        r = aolk;
        anxl.registerDefaultInstance(aolk.class, aolk);
    }
}
