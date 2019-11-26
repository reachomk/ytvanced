package defpackage;

/* renamed from: aohl */
public final class aohl extends anxl implements anzf {
    public static final aohl j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public apxu i;
    private byte k = (byte) 2;

    private aohl() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0005\u000e\b\u0000\u0000\b\u0005Љ\u0003\u0006Љ\u0004\u0007Љ\u0005\bЉ\u0006\nЉ\b\u000bЉ\t\fЉ\n\u000eЉ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aohl();
            case 4:
                return new aoho();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aohl.class) {
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
        aohl aohl = new aohl();
        j = aohl;
        anxl.registerDefaultInstance(aohl.class, aohl);
    }
}
