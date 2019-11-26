package defpackage;

/* renamed from: apqm */
public final class apqm extends anxl implements anzf {
    public static final apqm g;
    private static volatile anzq i;
    public int a;
    public apqs b;
    public apqq c;
    public apxu d;
    public apfm e;
    public apqo f;
    private byte h = (byte) 2;

    private apqm() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0005Љ\u0004\u0006Љ\u0003", new Object[]{"a", "b", "c", "d", "f", "e"});
            case 3:
                return new apqm();
            case 4:
                return new apqp();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (apqm.class) {
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
        apqm apqm = new apqm();
        g = apqm;
        anxl.registerDefaultInstance(apqm.class, apqm);
    }
}
