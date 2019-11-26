package defpackage;

/* renamed from: auyi */
public final class auyi extends anxl implements anzf {
    public static final auyi k;
    private static volatile anzq m;
    public int a;
    public auyg b;
    public auyc c;
    public auyc d;
    public auyc e;
    public auym f;
    public auyc g;
    public axak h;
    public arml i;
    public auyc j;
    private byte l = (byte) 2;

    private auyi() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\t\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007\tЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new auyi();
            case 4:
                return new auyl();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (auyi.class) {
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
        auyi auyi = new auyi();
        k = auyi;
        anxl.registerDefaultInstance(auyi.class, auyi);
    }
}
