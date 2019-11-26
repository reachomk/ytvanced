package defpackage;

/* renamed from: atim */
public final class atim extends anxl implements anzf {
    public static final atim c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private atim() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000㨶靖䘃\u0002\u0000\u0000\u0002㨶м\u0000靖䘃м\u0000", new Object[]{"b", "a", avaw.class, axva.class});
            case 3:
                return new atim();
            case 4:
                return new atil();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atim.class) {
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
        atim atim = new atim();
        c = atim;
        anxl.registerDefaultInstance(atim.class, atim);
    }
}
