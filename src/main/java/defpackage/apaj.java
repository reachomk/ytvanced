package defpackage;

/* renamed from: apaj */
public final class apaj extends anxl implements anzf {
    public static final apaj k;
    private static volatile anzq m;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public arml e;
    public int f;
    public apah g;
    public apah h;
    public apal i;
    public anvu j = anvu.a;
    private byte l = (byte) 2;

    private apaj() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003<\u0000\u0004\u000b\u0004\u0006\n\t\u0007м\u0000\bЉ\u0005\t\t\u0007\nЉ\u0006", new Object[]{"c", "b", "a", "d", "e", apan.class, "f", "j", aygk.class, "g", "i", "h"});
            case 3:
                return new apaj();
            case 4:
                return new apai();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (apaj.class) {
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
        apaj apaj = new apaj();
        k = apaj;
        anxl.registerDefaultInstance(apaj.class, apaj);
    }
}
