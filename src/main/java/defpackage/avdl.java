package defpackage;

/* renamed from: avdl */
public final class avdl extends anxl implements anzf {
    public static final avdl g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public axak c;
    public axak d;
    public anyd e = anxl.emptyProtobufList();
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private avdl() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0001\u0004\u0002\n\u0004\u0003Љ\u0000\u0005Љ\u0001\u0006Љ\u0002\u0007Л", new Object[]{"a", "f", "b", "c", "d", "e", axak.class});
            case 3:
                return new avdl();
            case 4:
                return new avdo();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (avdl.class) {
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
        avdl avdl = new avdl();
        g = avdl;
        anxl.registerDefaultInstance(avdl.class, avdl);
    }
}
