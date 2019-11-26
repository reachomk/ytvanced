package defpackage;

/* renamed from: aupb */
public final class aupb extends anxl implements anzf {
    public static final aupb j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public arml i;
    private byte k = (byte) 2;

    private aupb() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0000\b\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0007Љ\u0005\bЉ\u0006\tЉ\u0007\u000bЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aupb();
            case 4:
                return new aupe();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aupb.class) {
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
        aupb aupb = new aupb();
        j = aupb;
        anxl.registerDefaultInstance(aupb.class, aupb);
    }
}
