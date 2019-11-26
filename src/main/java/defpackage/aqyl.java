package defpackage;

/* renamed from: aqyl */
public final class aqyl extends anxl implements anzf {
    public static final aqyl h;
    private static volatile anzq j;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public arwf e;
    public arml f;
    public boolean g;
    private byte i = (byte) 2;

    private aqyl() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001Љ\u0000\u0002\t\u0001\u0003Љ\u0002\u00047\u0000\u0005;\u0000\u0006\u0007\u0005", new Object[]{"c", "b", "a", "d", "e", "f", "g"});
            case 3:
                return new aqyl();
            case 4:
                return new aqyk();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aqyl.class) {
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
        aqyl aqyl = new aqyl();
        h = aqyl;
        anxl.registerDefaultInstance(aqyl.class, aqyl);
    }
}
