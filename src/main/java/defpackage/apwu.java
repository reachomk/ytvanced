package defpackage;

/* renamed from: apwu */
public final class apwu extends anxl implements anzf {
    public static final apwu l;
    private static volatile anzq m;
    public int a;
    public double b;
    public int c;
    public int d;
    public boolean e;
    public int f = 1;
    public int g = 1;
    public int h = 1;
    public double i;
    public int j;
    public int k;

    private apwu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0000\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0007\u0003\u0005\f\u0004\u0006\f\u0005\u0007\f\u0006\b\u0000\u0007\t\f\b\n\u0004\t", new Object[]{"a", "b", "c", "d", "e", "f", atkw.a(), "g", atku.a(), "h", atku.a(), "i", "j", atky.a(), "k"});
            case 3:
                return new apwu();
            case 4:
                return new apwt();
            case 5:
                return l;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (apwu.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apwu apwu = new apwu();
        l = apwu;
        anxl.registerDefaultInstance(apwu.class, apwu);
    }
}
