package defpackage;

/* renamed from: apvs */
public final class apvs extends anxl implements anzf {
    public static final apvs h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public anvu g = anvu.a;
    private byte i = (byte) 2;

    private apvs() {
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
                return anxl.newMessageInfo(h, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0001\u0001Љ\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0006\u0007\u0003\u0007\u0007\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new apvs();
            case 4:
                return new apvr();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (apvs.class) {
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
        apvs apvs = new apvs();
        h = apvs;
        anxl.registerDefaultInstance(apvs.class, apvs);
    }
}
