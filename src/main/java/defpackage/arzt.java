package defpackage;

/* renamed from: arzt */
public final class arzt extends anxl implements anzf {
    public static final arzt e;
    private static volatile anzq g;
    public int a;
    public asic b;
    public axak c;
    public anvu d = anvu.a;
    private byte f = (byte) 2;

    private arzt() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001Љ\u0000\u0002Љ\u0001\u0004\n\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new arzt();
            case 4:
                return new arzs();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (arzt.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arzt arzt = new arzt();
        e = arzt;
        anxl.registerDefaultInstance(arzt.class, arzt);
    }
}
