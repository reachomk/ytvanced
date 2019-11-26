package defpackage;

/* renamed from: audp */
public final class audp extends anxl implements anzf {
    public static final audp c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private audp() {
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
                return anxl.newMessageInfo(c, "\u0001\u000b\u0001\u0000ﴸ㟮滐\u000b\u0000\u0000\nﴸ㟮м\u0000﹐㟮м\u0000㶿м\u0000ﲊ㹍м\u0000ﮓ㼭м\u0000㾍м\u0000䘒<\u0000䘔м\u0000仌м\u0000巷м\u0000滐м\u0000", new Object[]{"b", "a", auej.class, aueh.class, audv.class, audr.class, aued.class, audx.class, auef.class, audn.class, auel.class, aufj.class, audt.class});
            case 3:
                return new audp();
            case 4:
                return new audo();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (audp.class) {
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
        audp audp = new audp();
        c = audp;
        anxl.registerDefaultInstance(audp.class, audp);
    }
}
