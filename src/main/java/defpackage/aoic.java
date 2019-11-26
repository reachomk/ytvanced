package defpackage;

/* renamed from: aoic */
public final class aoic extends anxl implements anzf {
    public static final aoic i;
    private static volatile anzq k;
    public int a;
    public aygk b;
    public aygk c;
    public arml d;
    public arml e;
    public arml f;
    public apxu g;
    public anvu h = anvu.a;
    private byte j = (byte) 2;

    private aoic() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\b\n\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aoic();
            case 4:
                return new aoie();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aoic.class) {
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

    public static anzq a() {
        return i.getParserForType();
    }

    static {
        aoic aoic = new aoic();
        i = aoic;
        anxl.registerDefaultInstance(aoic.class, aoic);
    }
}
