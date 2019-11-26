package defpackage;

/* renamed from: ayly */
public final class ayly extends anxl implements anzf {
    public static final ayly j;
    private static volatile anzq l;
    public int a;
    public String b = "";
    public arwf c;
    public apxu d;
    public arml e;
    public long f;
    public aygk g;
    public arml h;
    public aphj i;
    private byte k = (byte) 2;

    private ayly() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0005\u0001\b\u0000\u0002\t\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u0002\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new ayly();
            case 4:
                return new aymb();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (ayly.class) {
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
        ayly ayly = new ayly();
        j = ayly;
        anxl.registerDefaultInstance(ayly.class, ayly);
    }
}
