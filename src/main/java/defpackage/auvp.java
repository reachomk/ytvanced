package defpackage;

/* renamed from: auvp */
public final class auvp extends anxl implements anzf {
    public static final auvp h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public arwf d;
    public apxu e;
    public apxu f;
    public anvu g = anvu.a;
    private byte i = (byte) 2;

    private auvp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0004\u0001Љ\u0000\u0002\t\u0002\u0003Љ\u0003\u0005\n\u0006\tЉ\u0001\nЉ\u0004", new Object[]{"a", "b", "d", "e", "g", "c", "f"});
            case 3:
                return new auvp();
            case 4:
                return new auvs();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (auvp.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auvp auvp = new auvp();
        h = auvp;
        anxl.registerDefaultInstance(auvp.class, auvp);
    }
}
