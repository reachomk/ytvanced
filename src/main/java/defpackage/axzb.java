package defpackage;

/* renamed from: axzb */
public final class axzb extends anxl implements anzf {
    public static final axzb k;
    private static volatile anzq m;
    public int a;
    public axak b;
    public arml c;
    public arml d;
    public String e = "";
    public axak f;
    public axak g;
    public axak h;
    public arml i;
    public axak j;
    private byte l = (byte) 2;

    private axzb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\b\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0004\u0005Љ\u0005\u0006Љ\u0006\u0007Љ\u0007\bЉ\b\t\b\u0003", new Object[]{"a", "b", "c", "d", "f", "g", "h", "i", "j", "e"});
            case 3:
                return new axzb();
            case 4:
                return new axzd();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (axzb.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axzb axzb = new axzb();
        k = axzb;
        anxl.registerDefaultInstance(axzb.class, axzb);
    }
}
