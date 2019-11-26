package defpackage;

/* renamed from: auxp */
public final class auxp extends anxl implements anzf {
    public static final auxp f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public boolean d;
    public anvu e = anvu.a;
    private byte g = (byte) 2;

    private auxp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0002\u0001Љ\u0000\u0002Л\u0004\n\u0003\u0005\u0007\u0001", new Object[]{"a", "b", "c", arml.class, "e", "d"});
            case 3:
                return new auxp();
            case 4:
                return new auxo();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (auxp.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auxp auxp = new auxp();
        f = auxp;
        anxl.registerDefaultInstance(auxp.class, auxp);
    }
}
