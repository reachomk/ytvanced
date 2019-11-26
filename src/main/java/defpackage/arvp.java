package defpackage;

/* renamed from: arvp */
public final class arvp extends anxl implements anzf {
    public static final arvp d;
    private static volatile anzq f;
    public int a;
    public avkc b;
    public avkg c;
    private byte e = (byte) 2;

    private arvp() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001ᣑﰖ㯒\u0002\u0000\u0000\u0002ᣑЉ\u0000ﰖ㯒Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new arvp();
            case 4:
                return new arvs();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (arvp.class) {
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
        arvp arvp = new arvp();
        d = arvp;
        anxl.registerDefaultInstance(arvp.class, arvp);
    }
}
