package defpackage;

/* renamed from: aybc */
public final class aybc extends anxl implements anzf {
    public static final aybc f;
    private static volatile anzq h;
    public int a;
    public ayao b;
    public axzw c;
    public ayae d;
    public ayaa e;
    private byte g = (byte) 2;

    private aybc() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001⡇堙\u0004\u0000\u0000\u0004⡇Љ\u0000㙻Љ\u0001䣧Љ\u0002堙Љ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aybc();
            case 4:
                return new aybf();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aybc.class) {
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
        aybc aybc = new aybc();
        f = aybc;
        anxl.registerDefaultInstance(aybc.class, aybc);
    }
}
