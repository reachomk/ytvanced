package defpackage;

/* renamed from: anue */
public final class anue extends anxl implements anzf {
    public static final anyb e = new anuh();
    public static final anue h;
    private static volatile anzq i;
    public int a;
    public String b = "";
    public int c;
    public anxz d = anxl.emptyIntList();
    public antw f;
    public antu g;

    private anue() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u001e\u0005\t\u0002\n\t\u0007", new Object[]{"a", "b", "c", aods.a, "d", aodn.a(), "f", "g"});
            case 3:
                return new anue();
            case 4:
                return new anug();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (anue.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        anue anue = new anue();
        h = anue;
        anxl.registerDefaultInstance(anue.class, anue);
    }
}
