package defpackage;

/* renamed from: avkg */
public final class avkg extends anxl implements anzf {
    public static final avkg e;
    private static volatile anzq g;
    public int a;
    public String b = "";
    public anvu c = anvu.a;
    public arml d;
    private byte f = (byte) 2;

    private avkg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\b\u0000\u0002\n\u0001\u0003Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new avkg();
            case 4:
                return new avkf();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (avkg.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avkg avkg = new avkg();
        e = avkg;
        anxl.registerDefaultInstance(avkg.class, avkg);
    }
}
