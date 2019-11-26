package defpackage;

/* renamed from: avrn */
public final class avrn extends anxl implements anzf {
    public static final avrn f;
    private static volatile anzq h;
    public int a;
    public asic b;
    public boolean c;
    public long d;
    public arnm e;
    private byte g = (byte) 2;

    private avrn() {
    }

    public final boolean hasFrameworkUpdates() {
        return (this.a & 8) != 0;
    }

    public final arnm getFrameworkUpdates() {
        arnm arnm = this.e;
        return arnm == null ? arnm.a : arnm;
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001̉\u0004\u0000\u0000\u0002\u0001Љ\u0000\u0002\u0007\u0001\u0003\u0002\u0002̉Љ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new avrn();
            case 4:
                return new avrm();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (avrn.class) {
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
        avrn avrn = new avrn();
        f = avrn;
        anxl.registerDefaultInstance(avrn.class, avrn);
    }
}
