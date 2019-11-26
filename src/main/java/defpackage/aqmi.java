package defpackage;

/* renamed from: aqmi */
public final class aqmi extends anxl implements anzf {
    public static final aqmi i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public aygk e;
    public arml f;
    public axak g;
    public anvu h = anvu.a;
    private byte j = (byte) 2;

    private aqmi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0005\u0005Љ\u0006\u0007\n\b\bЉ\u0004\tЉ\u0002", new Object[]{"a", "b", "c", "f", "g", "h", "e", "d"});
            case 3:
                return new aqmi();
            case 4:
                return new aqmk();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aqmi.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqmi aqmi = new aqmi();
        i = aqmi;
        anxl.registerDefaultInstance(aqmi.class, aqmi);
    }
}
