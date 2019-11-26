package defpackage;

/* renamed from: awgz */
public final class awgz extends anxp implements anzf {
    public static final awgz i;
    private static volatile anzq k;
    public int a;
    public String b = "";
    public arml c;
    public arml d;
    public int e;
    public apxu f;
    public apxu g;
    private byte j = (byte) 2;

    private awgz() {
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
                return anxl.newMessageInfo(i, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0004\u0001\b\u0000\u0002Љ\u0001\u0004Љ\u0003\u0005\f\u0004\u0007Љ\u0007\bЉ\b", new Object[]{"a", "b", "c", "d", "e", awha.a, "f", "g"});
            case 3:
                return new awgz();
            case 4:
                return new awgy();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (awgz.class) {
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
        awgz awgz = new awgz();
        i = awgz;
        anxl.registerDefaultInstance(awgz.class, awgz);
    }
}
