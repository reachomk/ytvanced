package defpackage;

/* renamed from: azdc */
public final class azdc extends anxl implements anzf {
    public static final azdc i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public arml c;
    public azdg d;
    public azde e;
    public apxu f;
    public axak g;
    public arml h;
    private byte j = (byte) 2;

    private azdc() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0000\u0007\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\bЉ\u0004\tЉ\u0005\u000eЉ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new azdc();
            case 4:
                return new azdb();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (azdc.class) {
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
        azdc azdc = new azdc();
        i = azdc;
        anxl.registerDefaultInstance(azdc.class, azdc);
    }
}
