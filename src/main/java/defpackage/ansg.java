package defpackage;

/* renamed from: ansg */
public final class ansg extends anxl implements anzf {
    public static final ansg c;
    private static volatile anzq d;
    public String a;
    public String b;

    private ansg() {
        String str = "";
        this.a = str;
        this.b = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new ansg();
            case 4:
                return new ansj();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ansg.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ansg ansg = new ansg();
        c = ansg;
        anxl.registerDefaultInstance(ansg.class, ansg);
    }
}
