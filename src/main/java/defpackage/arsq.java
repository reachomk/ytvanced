package defpackage;

/* renamed from: arsq */
public final class arsq extends anxl implements anzf {
    public static final arsq m;
    private static volatile anzq o;
    public int a;
    public arml b;
    public axmx c;
    public anyd d = anxl.emptyProtobufList();
    public apxu e;
    public apxu f;
    public arml g;
    public arml h;
    public apdx i;
    public auvr j;
    public auma k;
    public anvu l = anvu.a;
    private byte n = (byte) 2;

    private arsq() {
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
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\u0012\u000b\u0000\u0001\t\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0002\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007\n\n\n\u000bЛ\rЉ\u0003\u0012\t\b", new Object[]{"a", "b", "c", "e", "g", "h", "i", "j", "l", "d", ayfu.class, "f", "k"});
            case 3:
                return new arsq();
            case 4:
                return new arst();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (arsq.class) {
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
        arsq arsq = new arsq();
        m = arsq;
        anxl.registerDefaultInstance(arsq.class, arsq);
    }
}
