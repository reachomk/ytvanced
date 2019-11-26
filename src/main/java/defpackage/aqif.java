package defpackage;

/* renamed from: aqif */
public final class aqif extends anxl implements anzf {
    public static final aqif k;
    private static volatile anzq m;
    public int a;
    public arml b;
    public aqtk c;
    public auvr d;
    public long e;
    public aphj f;
    public aphj g;
    public apxu h;
    public String i = "";
    public apxu j;
    private byte l = (byte) 2;

    private aqif() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0007\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0004\u0004Љ\u0005\u0007Љ\u0002\bЉ\b\t\b\t\n\u0002\u0003\u000bЉ\n", new Object[]{"a", "b", "c", "f", "g", "d", "h", "i", "e", "j"});
            case 3:
                return new aqif();
            case 4:
                return new aqie();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (aqif.class) {
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
        aqif aqif = new aqif();
        k = aqif;
        anxl.registerDefaultInstance(aqif.class, aqif);
    }
}
