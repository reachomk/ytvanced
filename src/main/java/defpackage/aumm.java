package defpackage;

/* renamed from: aumm */
public final class aumm extends anxl implements anzf {
    public static final aumm j;
    private static volatile anzq l;
    public int a;
    public String b = "";
    public long c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public boolean i;
    private byte k = (byte) 2;

    private aumm() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0005\u0001\b\u0000\u0002\u0002\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\b\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aumm();
            case 4:
                return new auml();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aumm.class) {
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
        aumm aumm = new aumm();
        j = aumm;
        anxl.registerDefaultInstance(aumm.class, aumm);
    }
}
