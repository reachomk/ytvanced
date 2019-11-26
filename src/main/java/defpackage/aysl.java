package defpackage;

/* renamed from: aysl */
public final class aysl extends anxl implements anzf {
    public static final aysl f;
    private static volatile anzq h;
    public int a;
    public long b;
    public String c;
    public String d;
    public aumm e;
    private byte g = (byte) 2;

    private aysl() {
        String str = "";
        this.c = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0003ﲣ䈎\u0004\u0000\u0000\u0001\u0003\u0002\u0002\u0004\b\u0003\u0005\b\u0004ﲣ䈎Љ\u0006", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aysl();
            case 4:
                return new aysk();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aysl.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aysl aysl = new aysl();
        f = aysl;
        anxl.registerDefaultInstance(aysl.class, aysl);
    }
}
