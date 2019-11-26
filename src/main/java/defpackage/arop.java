package defpackage;

/* renamed from: arop */
public final class arop extends anxl implements anzf {
    public static final arop j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public aygk c;
    public aygk d;
    public aygk e;
    public arwf f;
    public anyd g = anxl.emptyProtobufList();
    public aphj h;
    public aphj i;
    private byte k = (byte) 2;

    private arop() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0003\n\b\u0000\u0001\u0007\u0003Љ\u0000\u0004Љ\u0001\u0005Љ\u0002\u0006Љ\u0003\u0007\t\u0004\bЛ\tЉ\u0005\nЉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", arml.class, "h", "i"});
            case 3:
                return new arop();
            case 4:
                return new aroo();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (arop.class) {
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
        arop arop = new arop();
        j = arop;
        anxl.registerDefaultInstance(arop.class, arop);
    }
}
