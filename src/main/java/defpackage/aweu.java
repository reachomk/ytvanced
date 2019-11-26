package defpackage;

/* renamed from: aweu */
public final class aweu extends anxl implements anzf {
    public static final aweu f;
    private static volatile anzq h;
    public int a;
    public awes b;
    public aphg c;
    public atzr d;
    public aweq e;
    private byte g = (byte) 2;

    private aweu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001Ყ㷭\u0004\u0000\u0000\u0004ᲧЉ\u0002ἑЉ\u0001►Љ\u0000㷭Љ\u0003", new Object[]{"a", "d", "c", "b", "e"});
            case 3:
                return new aweu();
            case 4:
                return new awex();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aweu.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aweu aweu = new aweu();
        f = aweu;
        anxl.registerDefaultInstance(aweu.class, aweu);
    }
}
