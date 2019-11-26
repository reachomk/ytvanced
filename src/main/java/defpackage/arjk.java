package defpackage;

/* renamed from: arjk */
public final class arjk extends anxl implements anzf {
    public static final arjk g;
    private static volatile anzq i;
    public int a;
    public apxu b;
    public arml c;
    public arml d;
    public apxu e;
    public aphj f;
    private byte h = (byte) 2;

    private arjk() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0005\u0001Љ\u0001\u0004Љ\u0000\u0007Љ\u0007\bЉ\u0002\nЉ\u0005", new Object[]{"a", "c", "b", "f", "d", "e"});
            case 3:
                return new arjk();
            case 4:
                return new arjn();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (arjk.class) {
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
        arjk arjk = new arjk();
        g = arjk;
        anxl.registerDefaultInstance(arjk.class, arjk);
    }
}
