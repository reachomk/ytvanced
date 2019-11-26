package defpackage;

/* renamed from: arwl */
public final class arwl extends anxl implements anzf {
    public static final arwl c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private arwl() {
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
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000頻㿈擶\u0003\u0000\u0000\u0003頻㿈м\u0000䪮м\u0000擶м\u0000", new Object[]{"b", "a", aowm.class, apxp.class, arbx.class});
            case 3:
                return new arwl();
            case 4:
                return new arwo();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (arwl.class) {
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
        arwl arwl = new arwl();
        c = arwl;
        anxl.registerDefaultInstance(arwl.class, arwl);
    }
}
