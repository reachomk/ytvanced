package defpackage;

/* renamed from: appo */
public final class appo extends anxl implements anzf {
    public static final appo e;
    private static volatile anzq g;
    public int a;
    public apfk b;
    public arvz c;
    public appk d;
    private byte f = (byte) 2;

    private appo() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001♋ぉ\u0003\u0000\u0000\u0003♋Љ\u0000⩝Љ\u0001ぉЉ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new appo();
            case 4:
                return new appr();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (appo.class) {
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
        appo appo = new appo();
        e = appo;
        anxl.registerDefaultInstance(appo.class, appo);
    }
}
