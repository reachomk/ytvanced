package defpackage;

/* renamed from: azns */
public final class azns extends anxl implements anzf {
    public static final azns k;
    private static volatile anzq m;
    public int a;
    public arml b;
    public aznu c;
    public apxu d;
    public arml e;
    public aznq f;
    public anyd g;
    public arml h;
    public anyd i;
    public anvu j;
    private byte l = (byte) 2;

    private azns() {
        anxl.emptyProtobufList();
        this.g = anxl.emptyProtobufList();
        this.i = anxl.emptyProtobufList();
        this.j = anvu.a;
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0002\b\u0001Љ\u0000\u0002Љ\u0001\u0006Љ\u0002\u0007Љ\u0003\bЉ\u0004\n\n\u0007\u000bЛ\fЛ\rЉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "j", "g", arml.class, "i", arml.class, "h"});
            case 3:
                return new azns();
            case 4:
                return new aznv();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (azns.class) {
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
        azns azns = new azns();
        k = azns;
        anxl.registerDefaultInstance(azns.class, azns);
    }
}
