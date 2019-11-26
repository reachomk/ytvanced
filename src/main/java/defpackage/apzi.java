package defpackage;

/* renamed from: apzi */
public final class apzi extends anxl implements anzf {
    public static final apzi h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public auvr g;
    private byte i = (byte) 2;

    private apzi() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0003\u0003Љ\u0004\u0004Љ\u0005\bЉ\u0001\tЉ\u0002", new Object[]{"a", "b", "e", "f", "g", "c", "d"});
            case 3:
                return new apzi();
            case 4:
                return new apzl();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (apzi.class) {
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
        apzi apzi = new apzi();
        h = apzi;
        anxl.registerDefaultInstance(apzi.class, apzi);
    }
}
