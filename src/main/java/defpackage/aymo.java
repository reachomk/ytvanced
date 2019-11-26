package defpackage;

/* renamed from: aymo */
public final class aymo extends anxl implements anzf {
    public static final aymo c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aymo() {
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
                return anxl.newMessageInfo(c, "\u0001\u0004\u0001\u0000Ẑ㲾\u0004\u0000\u0000\u0004Ẑм\u0000⤒м\u0000㲔м\u0000㲾м\u0000", new Object[]{"b", "a", aqhy.class, atuf.class, ayms.class, aymq.class});
            case 3:
                return new aymo();
            case 4:
                return new aymr();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aymo.class) {
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
        aymo aymo = new aymo();
        c = aymo;
        anxl.registerDefaultInstance(aymo.class, aymo);
    }
}
