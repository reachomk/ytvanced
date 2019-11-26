package defpackage;

/* renamed from: awhd */
public final class awhd extends anxl implements anzf {
    public static final awhd j;
    private static volatile anzq l;
    public int a;
    public awkv b;
    public arml c;
    public arml d;
    public anyd e = anxl.emptyProtobufList();
    public apxu f;
    public auvr g;
    public int h;
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private awhd() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Л\u0005Љ\u0003\u0006Љ\u0004\b\n\u0007\t\f\u0005", new Object[]{"a", "b", "c", "d", "e", ayfu.class, "f", "g", "i", "h", awhe.a});
            case 3:
                return new awhd();
            case 4:
                return new awhc();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (awhd.class) {
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
        awhd awhd = new awhd();
        j = awhd;
        anxl.registerDefaultInstance(awhd.class, awhd);
    }
}
