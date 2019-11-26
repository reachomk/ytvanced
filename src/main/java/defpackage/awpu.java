package defpackage;

/* renamed from: awpu */
public final class awpu extends anxl implements anzf {
    public static final awpu g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apxu e;
    public aphj f;
    private byte h = (byte) 2;

    private awpu() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0000\u0005\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\bЉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new awpu();
            case 4:
                return new awpx();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (awpu.class) {
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
        awpu awpu = new awpu();
        g = awpu;
        anxl.registerDefaultInstance(awpu.class, awpu);
    }
}
