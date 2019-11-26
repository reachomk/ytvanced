package defpackage;

/* renamed from: atux */
public final class atux extends anxl implements anzf {
    public static final atux e;
    private static volatile anzq g;
    public int a;
    public aphj b;
    public axak c;
    public aoje d;
    private byte f = (byte) 2;

    private atux() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0002\u000b\u0003\u0000\u0000\u0003\u0002Љ\u0001\nЉ\u0003\u000bЉ\u0006", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new atux();
            case 4:
                return new atuw();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atux.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atux atux = new atux();
        e = atux;
        anxl.registerDefaultInstance(atux.class, atux);
    }
}
