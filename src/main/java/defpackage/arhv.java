package defpackage;

/* renamed from: arhv */
public final class arhv extends anxl implements anzf {
    public static final arhv h;
    private static volatile anzq j;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public apxu c;
    public axak d;
    public apxu e;
    public axak f;
    public anvu g = anvu.a;
    private byte i = (byte) 2;

    private arhv() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0005\u0001Л\u0002Љ\u0000\u0004\n\u0005\u0005Љ\u0001\u0006Љ\u0003\u0007Љ\u0002", new Object[]{"a", "b", axak.class, "c", "g", "d", "f", "e"});
            case 3:
                return new arhv();
            case 4:
                return new arhu();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (arhv.class) {
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
        arhv arhv = new arhv();
        h = arhv;
        anxl.registerDefaultInstance(arhv.class, arhv);
    }
}
