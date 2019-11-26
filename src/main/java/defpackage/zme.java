package defpackage;

/* renamed from: zme */
public final class zme extends anxl implements anzf {
    public static final zme e;
    private static volatile anzq g;
    public int a;
    public String b = "";
    public int c;
    public int d;
    private byte f = (byte) 2;

    private zme() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001Ԉ\u0000\u0002Ԅ\u0001\u0003Ԅ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new zme();
            case 4:
                return new zmd();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (zme.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
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
        zme zme = new zme();
        e = zme;
        anxl.registerDefaultInstance(zme.class, zme);
    }
}
