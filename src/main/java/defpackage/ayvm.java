package defpackage;

/* renamed from: ayvm */
public final class ayvm extends anxl implements anzf {
    public static final ayvm g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public aphj d;
    public arml e;
    public apxu f;
    private byte h = (byte) 2;

    private ayvm() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0006\u0005Љ\u0007\nЉ\u0002", new Object[]{"a", "b", "c", "e", "f", "d"});
            case 3:
                return new ayvm();
            case 4:
                return new ayvo();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (ayvm.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayvm ayvm = new ayvm();
        g = ayvm;
        anxl.registerDefaultInstance(ayvm.class, ayvm);
    }
}
