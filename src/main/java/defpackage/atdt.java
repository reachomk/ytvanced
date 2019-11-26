package defpackage;

/* renamed from: atdt */
public final class atdt extends anxl implements anzf {
    public static final atdt c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private atdt() {
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
                return anxl.newMessageInfo(c, "\u0001\u0007\u0001\u0000ᯓ槅\u0007\u0000\u0000\u0006ᯓм\u0000Ọм\u0000≎м\u0000⋬м\u0000⤖м\u0000⮎м\u0000槅<\u0000", new Object[]{"b", "a", awdu.class, awee.class, aweg.class, awdy.class, azpk.class, awgo.class, apju.class});
            case 3:
                return new atdt();
            case 4:
                return new atdw();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atdt.class) {
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
        atdt atdt = new atdt();
        c = atdt;
        anxl.registerDefaultInstance(atdt.class, atdt);
    }
}
