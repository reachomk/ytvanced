package defpackage;

/* renamed from: asvp */
public final class asvp extends anxl implements anzf {
    public static final asvp g;
    private static volatile anzq i;
    public int a;
    public ashy b;
    public anvu c = anvu.a;
    public String d = "";
    public boolean e;
    public boolean f;
    private byte h = (byte) 2;

    private asvp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0015\u0005\u0000\u0000\u0001\u0001Љ\u0000\u0003\n\u0001\u0004\b\u0002\u0012\u0007\u0006\u0015\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new asvp();
            case 4:
                return new asvs();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (asvp.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
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
        asvp asvp = new asvp();
        g = asvp;
        anxl.registerDefaultInstance(asvp.class, asvp);
    }
}
