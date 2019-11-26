package defpackage;

/* renamed from: aufd */
public final class aufd extends anxl implements anzf {
    public static final aufd h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public aygk c;
    public auff d;
    public anyd e;
    public anyd f;
    public auex g;
    private byte i = (byte) 2;

    private aufd() {
        anxl.emptyProtobufList();
        this.e = anxl.emptyProtobufList();
        this.f = anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0002\u0006\u0001Љ\u0000\u0003Љ\u0002\u0005Љ\u0003\u0006Л\u0007Л\nЉ\u0001", new Object[]{"a", "b", "d", "g", "e", aufb.class, "f", auez.class, "c"});
            case 3:
                return new aufd();
            case 4:
                return new aufg();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aufd.class) {
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
        aufd aufd = new aufd();
        h = aufd;
        anxl.registerDefaultInstance(aufd.class, aufd);
    }
}
