package defpackage;

/* renamed from: apvu */
public final class apvu extends anxl implements anzf {
    public static final apvu f;
    private static volatile anzq h;
    public int a;
    public apxu b;
    public arml c;
    public arml d;
    public anvu e = anvu.a;
    private byte g = (byte) 2;

    private apvu() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0004\n\u0004\u0005Љ\u0002", new Object[]{"a", "b", "c", "e", "d"});
            case 3:
                return new apvu();
            case 4:
                return new apvt();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (apvu.class) {
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
        apvu apvu = new apvu();
        f = apvu;
        anxl.registerDefaultInstance(apvu.class, apvu);
    }
}
