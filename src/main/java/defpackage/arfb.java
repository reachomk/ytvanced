package defpackage;

/* renamed from: arfb */
public final class arfb extends anxl implements anzf {
    public static final arfb c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private arfb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0004\u0001\u0000ណﲵ猶\u0004\u0000\u0000\u0004ណм\u0000䰍м\u0000禮猞м\u0000ﲵ猶м\u0000", new Object[]{"b", "a", axez.class, aqln.class, apxc.class, apxe.class});
            case 3:
                return new arfb();
            case 4:
                return new arfa();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (arfb.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arfb arfb = new arfb();
        c = arfb;
        anxl.registerDefaultInstance(arfb.class, arfb);
    }
}
