package defpackage;

/* renamed from: awnt */
public final class awnt extends anxl implements anzf {
    public static final awnt h;
    private static volatile anzq j;
    public int a;
    public int b = 0;
    public Object c;
    public axak d;
    public arwf e;
    public apxu f;
    public anvu g;
    private byte i = (byte) 2;

    private awnt() {
        anxl.emptyIntList();
        this.g = anvu.a;
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
                return anxl.newMessageInfo(h, "\u0001\u0007\u0001\u0001\u0001\t\u0007\u0000\u0000\u0005\u0001Љ\u0000\u0002\t\u0001\u0003Љ\u0002\u0005м\u0000\u0006м\u0000\u0007м\u0000\t\n\u0007", new Object[]{"c", "b", "a", "d", "e", "f", aygk.class, aygk.class, ayxo.class, "g"});
            case 3:
                return new awnt();
            case 4:
                return new awns();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (awnt.class) {
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
        awnt awnt = new awnt();
        h = awnt;
        anxl.registerDefaultInstance(awnt.class, awnt);
    }
}
