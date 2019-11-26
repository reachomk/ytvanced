package defpackage;

/* renamed from: arru */
public final class arru extends anxl implements anzf {
    public static final arru m;
    private static volatile anzq o;
    public int a;
    public awkv b;
    public anyd c = anxl.emptyProtobufList();
    public arml d;
    public int e;
    public arml f;
    public arml g;
    public arml h;
    public apxu i;
    public auvr j;
    public aphj k;
    public anvu l;
    private byte n = (byte) 2;

    private arru() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.l = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0002\r\u000b\u0000\u0001\t\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0004\u0005Љ\u0005\u0006Љ\u0006\u0007Љ\u0007\bЉ\b\tЛ\u000b\n\u000b\f\u0004\u0003\rЉ\t", new Object[]{"a", "b", "d", "f", "g", "h", "i", "j", "c", ayfu.class, "l", "e", "k"});
            case 3:
                return new arru();
            case 4:
                return new arrx();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (arru.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arru arru = new arru();
        m = arru;
        anxl.registerDefaultInstance(arru.class, arru);
    }
}
