package defpackage;

/* renamed from: ayeb */
public final class ayeb extends anxl implements anzf {
    public static final ayeb d;
    public static final anxr e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public anvu c = anvu.a;

    private ayeb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\n\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ayeb();
            case 4:
                return new ayee();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ayeb.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayeb ayeb = new ayeb();
        d = ayeb;
        anxl.registerDefaultInstance(ayeb.class, ayeb);
        arce arce = arce.a;
        ayeb ayeb2 = d;
        e = anxl.newSingularGeneratedExtension(arce, ayeb2, ayeb2, null, 196886555, aobm.MESSAGE, ayeb.class);
    }
}
