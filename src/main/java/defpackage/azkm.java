package defpackage;

/* renamed from: azkm */
public final class azkm extends anxl implements anzf {
    public static final azkm j;
    private static volatile anzq l;
    public int a;
    public long b;
    public int c;
    public arml d;
    public aphj e;
    public int f = 10000;
    public arml g;
    public aphj h;
    public arml i;
    private byte k = (byte) 2;

    private azkm() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0005\u0001\u0002\u0000\u0003Љ\u0003\u0004Љ\u0004\u0005\u000b\u0005\u0006Љ\u0006\u0007Љ\b\nЉ\u0007\u000b\u0004\u0001", new Object[]{"a", "b", "d", "e", "f", "g", "i", "h", "c"});
            case 3:
                return new azkm();
            case 4:
                return new azkl();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (azkm.class) {
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
        azkm azkm = new azkm();
        j = azkm;
        anxl.registerDefaultInstance(azkm.class, azkm);
    }
}
