package defpackage;

/* renamed from: avhq */
public final class avhq extends anxl implements anzf {
    public static final avhq d;
    private static volatile anzq f;
    public int a;
    public axak b;
    public axak c;
    private byte e = (byte) 2;

    private avhq() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\b\u0002\u0000\u0000\u0002\u0002Љ\u0001\bЉ\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new avhq();
            case 4:
                return new avhp();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (avhq.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avhq avhq = new avhq();
        d = avhq;
        anxl.registerDefaultInstance(avhq.class, avhq);
    }
}
