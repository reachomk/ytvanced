package defpackage;

/* renamed from: apfz */
public final class apfz extends anxl implements anzf {
    public static final apfz h;
    private static volatile anzq j;
    public int a;
    public apxu b;
    public axak c;
    public axak d;
    public axak e;
    public axak f;
    public arml g;
    private byte i = (byte) 2;

    private apfz() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0007Љ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new apfz();
            case 4:
                return new apgb();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (apfz.class) {
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
        apfz apfz = new apfz();
        h = apfz;
        anxl.registerDefaultInstance(apfz.class, apfz);
    }
}
