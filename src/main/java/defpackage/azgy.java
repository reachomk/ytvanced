package defpackage;

/* renamed from: azgy */
public final class azgy extends anxl implements anzf {
    public static final azgy i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public apxu c;
    public apdx d;
    public apdx e;
    public azhs f;
    public azik g;
    public arml h;
    private byte j = (byte) 2;

    private azgy() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0007\u0001Љ\u0000\u0002Љ\u0001\u0005Љ\u0004\u0006Љ\u0005\tЉ\u0007\fЉ\u0002\rЉ\u0003", new Object[]{"a", "b", "c", "f", "g", "h", "d", "e"});
            case 3:
                return new azgy();
            case 4:
                return new azhb();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (azgy.class) {
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
        azgy azgy = new azgy();
        i = azgy;
        anxl.registerDefaultInstance(azgy.class, azgy);
    }
}
