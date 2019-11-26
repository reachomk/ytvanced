package defpackage;

/* renamed from: aqil */
public final class aqil extends anxl implements anzf {
    public static final aqil l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public aqtk c;
    public aphj d;
    public arml e;
    public long f;
    public apxu g;
    public arml h;
    public apxu i;
    public auvr j;
    public String k = "";
    private byte m = (byte) 2;

    private aqil() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\b\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0003\u0006Љ\u0004\u0007Љ\n\b\b\f\t\u0002\u0005\nЉ\u0006\u000bЉ\u0007\fЉ\u000b", new Object[]{"a", "b", "c", "d", "e", "i", "k", "f", "g", "h", "j"});
            case 3:
                return new aqil();
            case 4:
                return new aqik();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (aqil.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return l.getParserForType();
    }

    static {
        aqil aqil = new aqil();
        l = aqil;
        anxl.registerDefaultInstance(aqil.class, aqil);
    }
}
