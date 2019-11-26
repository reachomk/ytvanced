package defpackage;

/* renamed from: avum */
public final class avum extends anxl implements anzf {
    public static final avum e;
    private static volatile anzq g;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public arml c;
    public aphj d;
    private byte f = (byte) 2;

    private avum() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0003\u0001Л\u0002Љ\u0000\u0005Љ\u0003", new Object[]{"a", "b", avuc.class, "c", "d"});
            case 3:
                return new avum();
            case 4:
                return new avul();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (avum.class) {
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
        avum avum = new avum();
        e = avum;
        anxl.registerDefaultInstance(avum.class, avum);
    }
}
