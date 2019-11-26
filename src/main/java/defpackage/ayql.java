package defpackage;

/* renamed from: ayql */
public final class ayql extends anxl implements anzf {
    public static final ayql g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    public arml e;
    public arml f;
    private byte h = (byte) 2;

    private ayql() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0002\r\u0005\u0000\u0000\u0005\u0002Љ\u0003\u0003Љ\u0004\u0004Љ\u0005\u000bЉ\u0006\rЉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new ayql();
            case 4:
                return new ayqk();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (ayql.class) {
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
        ayql ayql = new ayql();
        g = ayql;
        anxl.registerDefaultInstance(ayql.class, ayql);
    }
}
