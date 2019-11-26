package defpackage;

/* renamed from: ansp */
public final class ansp extends anxl implements anzf {
    public static final ansp f;
    private static volatile anzq g;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    private ansp() {
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new ansp();
            case 4:
                return new anso();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ansp.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
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
        ansp ansp = new ansp();
        f = ansp;
        anxl.registerDefaultInstance(ansp.class, ansp);
    }
}
