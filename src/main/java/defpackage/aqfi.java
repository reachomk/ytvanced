package defpackage;

/* renamed from: aqfi */
public final class aqfi extends anxl implements anzf {
    public static final aqfi m;
    private static volatile anzq o;
    public int a;
    public arml b;
    public arml c;
    public aygk d;
    public aygk e;
    public apxu f;
    public apdx g;
    public arml h;
    public arml i;
    public arml j;
    public aphj k;
    public anvu l = anvu.a;
    private byte n = (byte) 2;

    private aqfi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\n\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\u0005\u0004Љ\u0006\u0005Љ\u0007\u0006Љ\n\b\n\f\tЉ\u0003\nЉ\b\u000bЉ\t\fЉ\u0001", new Object[]{"a", "b", "d", "f", "g", "h", "k", "l", "e", "i", "j", "c"});
            case 3:
                return new aqfi();
            case 4:
                return new aqfh();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (aqfi.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return m.getParserForType();
    }

    static {
        aqfi aqfi = new aqfi();
        m = aqfi;
        anxl.registerDefaultInstance(aqfi.class, aqfi);
    }
}
