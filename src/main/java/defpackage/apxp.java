package defpackage;

/* renamed from: apxp */
public final class apxp extends anxl implements anzf {
    public static final apxp h;
    private static volatile anzq j;
    public int a;
    public aygk b;
    public apxr c;
    public apxo d;
    public anyd e = anxl.emptyProtobufList();
    public anvu f = anvu.a;
    public boolean g;
    private byte i = (byte) 2;

    private apxp() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004\u001b\u0006\n\u0004\b\u0007\u0005", new Object[]{"a", "b", "c", "d", "e", aohh.class, "f", "g"});
            case 3:
                return new apxp();
            case 4:
                return new apxs();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (apxp.class) {
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
        apxp apxp = new apxp();
        h = apxp;
        anxl.registerDefaultInstance(apxp.class, apxp);
    }
}
