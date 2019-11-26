package defpackage;

/* renamed from: aphj */
public final class aphj extends anxl implements anzf {
    public static final aphj d;
    private static volatile anzq f;
    public int a;
    public aphg b;
    public aphv c;
    private byte e = (byte) 2;

    private aphj() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001ἑ☢\u0002\u0000\u0000\u0002ἑЉ\u0000☢Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new aphj();
            case 4:
                return new aphm();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aphj.class) {
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
        aphj aphj = new aphj();
        d = aphj;
        anxl.registerDefaultInstance(aphj.class, aphj);
    }
}
