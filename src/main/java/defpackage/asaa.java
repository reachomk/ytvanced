package defpackage;

/* renamed from: asaa */
public final class asaa extends anxl implements anzf {
    public static final asaa i;
    private static volatile anzq k;
    public int a;
    public ashy b;
    public axch c;
    public String d = "";
    public azks e;
    public int f;
    public boolean g = true;
    public float h;
    private byte j = (byte) 2;

    private asaa() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0002\u0001Љ\u0000\u0002Љ\u0001\u0003\b\u0004\n\t\u000b\u000b\f\f\f\u0007\r\r\u0001\u000e", new Object[]{"a", "b", "c", "d", "e", "f", arzx.a(), "g", "h"});
            case 3:
                return new asaa();
            case 4:
                return new asad();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (asaa.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asaa asaa = new asaa();
        i = asaa;
        anxl.registerDefaultInstance(asaa.class, asaa);
    }
}
