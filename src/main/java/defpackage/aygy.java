package defpackage;

/* renamed from: aygy */
public final class aygy extends anxl implements anzf {
    public static final aygy j;
    private static volatile anzq l;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public arml e;
    public arml f;
    public arwf g;
    public int h;
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private aygy() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004\t\u0003\u0005м\u0000\u0006м\u0000\u0007\f\u0006\t\n\b", new Object[]{"c", "b", "a", "d", "e", "f", "g", apxu.class, apxu.class, "h", aygz.a, "i"});
            case 3:
                return new aygy();
            case 4:
                return new ayha();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aygy.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return j.getParserForType();
    }

    static {
        aygy aygy = new aygy();
        j = aygy;
        anxl.registerDefaultInstance(aygy.class, aygy);
    }
}
