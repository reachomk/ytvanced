package defpackage;

/* renamed from: aqgk */
public final class aqgk extends anxl implements anzf {
    public static final aqgk k;
    private static volatile anzq m;
    public int a;
    public arml b;
    public axmx c;
    public anyd d = anxl.emptyProtobufList();
    public apxu e;
    public arml f;
    public arml g;
    public apdx h;
    public auvr i;
    public anvu j = anvu.a;
    private byte l = (byte) 2;

    private aqgk() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\b\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0002\u0005Љ\u0003\u0006Љ\u0004\u0007Љ\u0005\bЉ\u0006\n\n\t\u000bЛ", new Object[]{"a", "b", "c", "e", "f", "g", "h", "i", "j", "d", ayfu.class});
            case 3:
                return new aqgk();
            case 4:
                return new aqgj();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (aqgk.class) {
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

    public static anzq a() {
        return k.getParserForType();
    }

    static {
        aqgk aqgk = new aqgk();
        k = aqgk;
        anxl.registerDefaultInstance(aqgk.class, aqgk);
    }
}
