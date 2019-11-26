package defpackage;

/* renamed from: axkj */
public final class axkj extends anxl implements anzf {
    public static final axkj i;
    private static volatile anzq k;
    public int a;
    public arsk b;
    public arvn c;
    public ayxh d;
    public axjf e;
    public axjd f;
    public arvr g;
    public auwl h;
    private byte j = (byte) 2;

    private axkj() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001ᢆ᱂\u0007\u0000\u0000\u0007ᢆЉ\u0001﵂ᢳЉ\u0000᪇Љ\u0003ᮦЉ\u0002᯦Љ\u0006᱂Љ\u0004᱂Љ\u0005", new Object[]{"a", "c", "b", "e", "d", "h", "f", "g"});
            case 3:
                return new axkj();
            case 4:
                return new axkm();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (axkj.class) {
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
        axkj axkj = new axkj();
        i = axkj;
        anxl.registerDefaultInstance(axkj.class, axkj);
    }
}
