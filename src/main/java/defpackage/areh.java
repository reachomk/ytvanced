package defpackage;

/* renamed from: areh */
public final class areh extends anxl implements anzf {
    public static final areh j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public aygk c;
    public apxu d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private areh() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0002\u000e\b\u0000\u0000\u0007\u0002Љ\u0001\u0003Љ\u0002\u0006Љ\u0005\u0007Љ\u0006\nЉ\u0007\u000bЉ\b\rЉ\u0004\u000e\n\n", new Object[]{"a", "b", "c", "e", "f", "g", "h", "d", "i"});
            case 3:
                return new areh();
            case 4:
                return new arek();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (areh.class) {
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
        areh areh = new areh();
        j = areh;
        anxl.registerDefaultInstance(areh.class, areh);
    }
}
