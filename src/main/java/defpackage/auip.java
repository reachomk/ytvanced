package defpackage;

/* renamed from: auip */
public final class auip extends anxl implements anzf {
    public static final auip h;
    private static volatile anzq j;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public boolean e;
    public int f;
    public apxu g;
    private byte i = (byte) 2;

    private auip() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001\f\u0000\u0002\u0007\u0001\u0003\u000b\u0002\u0004Љ\u0003\u0005м\u0000\u0006м\u0000", new Object[]{"c", "b", "a", "d", auiu.a, "e", "f", "g", arml.class, axak.class});
            case 3:
                return new auip();
            case 4:
                return new auis();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (auip.class) {
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
        auip auip = new auip();
        h = auip;
        anxl.registerDefaultInstance(auip.class, auip);
    }
}
