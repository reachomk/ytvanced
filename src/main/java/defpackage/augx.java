package defpackage;

/* renamed from: augx */
public final class augx extends anxl implements anzf {
    public static final augx c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private augx() {
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
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000㼺怱\u0003\u0000\u0000\u0003㼺м\u0000㼺м\u0000怱м\u0000", new Object[]{"b", "a", auhb.class, augz.class, augv.class});
            case 3:
                return new augx();
            case 4:
                return new augw();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (augx.class) {
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
        augx augx = new augx();
        c = augx;
        anxl.registerDefaultInstance(augx.class, augx);
    }
}
