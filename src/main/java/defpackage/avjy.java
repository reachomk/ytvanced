package defpackage;

/* renamed from: avjy */
public final class avjy extends anxl implements anzf {
    public static final avjy d;
    private static volatile anzq f;
    public int a;
    public avjw b;
    public avju c;
    private byte e = (byte) 2;

    private avjy() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001ᡎ᱒\u0002\u0000\u0000\u0002ᡎЉ\u0000᱒Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new avjy();
            case 4:
                return new avjx();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (avjy.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avjy avjy = new avjy();
        d = avjy;
        anxl.registerDefaultInstance(avjy.class, avjy);
    }
}
