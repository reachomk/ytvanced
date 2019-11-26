package defpackage;

/* renamed from: arqr */
public final class arqr extends anxl implements anzf {
    public static final arqr h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public aygk d;
    public arml e;
    public arqt f;
    public anyd g = anxl.emptyProtobufList();
    private byte i = (byte) 2;

    private arqr() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004\t\u0004\u0005\u001b\u0006Љ\u0003", new Object[]{"a", "b", "c", "d", "f", "g", arqv.class, "e"});
            case 3:
                return new arqr();
            case 4:
                return new arqq();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (arqr.class) {
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
        arqr arqr = new arqr();
        h = arqr;
        anxl.registerDefaultInstance(arqr.class, arqr);
    }
}
