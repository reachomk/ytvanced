package defpackage;

/* renamed from: atvp */
public final class atvp extends anxl implements anzf {
    public static final atvp j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public int c;
    public arml d;
    public anyd e;
    public aphp f;
    public atvj g;
    public arml h;
    public arml i;
    private byte k = (byte) 2;

    private atvp() {
        anxl.emptyProtobufList();
        this.e = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0007\u0001Љ\u0000\u0003Л\u0005Љ\u0002\u0006Љ\u0003\u0007Љ\u0004\bЉ\u0005\tЉ\u0006\n\f\u0001", new Object[]{"a", "b", "e", aphj.class, "d", "f", "g", "h", "i", "c", atve.a});
            case 3:
                return new atvp();
            case 4:
                return new atvo();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (atvp.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atvp atvp = new atvp();
        j = atvp;
        anxl.registerDefaultInstance(atvp.class, atvp);
    }
}
