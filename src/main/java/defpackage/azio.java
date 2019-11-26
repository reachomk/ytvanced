package defpackage;

/* renamed from: azio */
public final class azio extends anxl implements anzf {
    public static final azio h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public apxu c;
    public azhs d;
    public azik e;
    public arml f;
    public auvr g;
    private byte i = (byte) 2;

    private azio() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\bЉ\u0007\u000bЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new azio();
            case 4:
                return new azir();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (azio.class) {
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
        azio azio = new azio();
        h = azio;
        anxl.registerDefaultInstance(azio.class, azio);
    }
}
