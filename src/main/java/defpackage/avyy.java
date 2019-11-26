package defpackage;

/* renamed from: avyy */
public final class avyy extends anxl implements anzf {
    public static final avyy h;
    private static volatile anzq j;
    public int a;
    public aphj b;
    public avyq c;
    public arml d;
    public String e = "";
    public apxu f;
    public axak g;
    private byte i = (byte) 2;

    private avyy() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004\b\u0003\u0005Љ\u0005\u0006Љ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "f"});
            case 3:
                return new avyy();
            case 4:
                return new avyx();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (avyy.class) {
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
        avyy avyy = new avyy();
        h = avyy;
        anxl.registerDefaultInstance(avyy.class, avyy);
    }
}
