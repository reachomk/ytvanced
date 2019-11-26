package defpackage;

/* renamed from: awad */
public final class awad extends anxl implements anzf {
    public static final awad m;
    private static volatile anzq o;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public apxu f;
    public apdx g;
    public apdx h;
    public apdx i;
    public arml j;
    public arml k;
    public auvr l;
    private byte n = (byte) 2;

    private awad() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0003\u0012\u000b\u0000\u0000\u000b\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\u000bЉ\f\fЉ\b\u000eЉ\u000e\u000fЉ\u0007\u0010Љ\t\u0012Љ\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "j", "h", "k", "g", "i", "l"});
            case 3:
                return new awad();
            case 4:
                return new awac();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (awad.class) {
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
        awad awad = new awad();
        m = awad;
        anxl.registerDefaultInstance(awad.class, awad);
    }
}
