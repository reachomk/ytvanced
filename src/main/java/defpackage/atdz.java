package defpackage;

/* renamed from: atdz */
public final class atdz extends anxl implements anzf {
    public static final atdz c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private atdz() {
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
                return anxl.newMessageInfo(c, "\u0001\b\u0001\u0000ᝊ⺙\b\u0000\u0000\u0006ᝊм\u0000ﮱ᪢<\u0000Ḙм\u0000Ḡ<\u0000⡱м\u0000⨕м\u0000⪂м\u0000⺙м\u0000", new Object[]{"b", "a", azfc.class, awea.class, ated.class, aywx.class, aogi.class, aoia.class, aolc.class, aoio.class});
            case 3:
                return new atdz();
            case 4:
                return new atec();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atdz.class) {
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
        atdz atdz = new atdz();
        c = atdz;
        anxl.registerDefaultInstance(atdz.class, atdz);
    }
}
