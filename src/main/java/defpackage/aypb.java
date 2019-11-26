package defpackage;

/* renamed from: aypb */
public final class aypb extends anxl implements anzf {
    public static final aypb j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public aphj c;
    public arml d;
    public arml e;
    public arml f;
    public aphj g;
    public aphj h;
    public ayoz i;
    private byte k = (byte) 2;

    private aypb() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0003\n\b\u0000\u0000\b\u0003Љ\u0001\u0004Љ\u0002\u0005Љ\u0003\u0006Љ\u0004\u0007Љ\u0005\bЉ\u0006\tЉ\u0007\nЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aypb();
            case 4:
                return new aype();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aypb.class) {
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
        aypb aypb = new aypb();
        j = aypb;
        anxl.registerDefaultInstance(aypb.class, aypb);
    }
}
