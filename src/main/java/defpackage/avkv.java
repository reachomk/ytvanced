package defpackage;

/* renamed from: avkv */
public final class avkv extends anxl implements anzf {
    public static final avkv g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    public int e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private avkv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0003\u0001Љ\u0000\u0002Л\u0004\n\u0004\u0005Љ\u0001\u0006\f\u0002", new Object[]{"a", "b", "d", aphj.class, "f", "c", "e", aqwz.a});
            case 3:
                return new avkv();
            case 4:
                return new avku();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (avkv.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avkv avkv = new avkv();
        g = avkv;
        anxl.registerDefaultInstance(avkv.class, avkv);
    }
}
