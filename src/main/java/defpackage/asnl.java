package defpackage;

/* renamed from: asnl */
public final class asnl extends anxl implements anzf {
    public static final asnl j;
    private static volatile anzq l;
    public int a;
    public anvu b = anvu.a;
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    public aphj e;
    public aphj f;
    public apxu g;
    public aphj h;
    public int i;
    private byte k = (byte) 2;

    private asnl() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0002\t\b\u0000\u0001\u0006\u0002\n\u0001\u0003Љ\u0002\u0004Л\u0005Љ\u0003\u0006Љ\u0004\u0007Љ\u0005\bЉ\u0006\t\f\u0007", new Object[]{"a", "b", "c", "d", asnn.class, "e", "f", "g", "h", "i", aqwz.a});
            case 3:
                return new asnl();
            case 4:
                return new asnk();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (asnl.class) {
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
        asnl asnl = new asnl();
        j = asnl;
        anxl.registerDefaultInstance(asnl.class, asnl);
    }
}
