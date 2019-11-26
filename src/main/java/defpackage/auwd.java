package defpackage;

/* renamed from: auwd */
public final class auwd extends anxl implements anzf {
    public static final auwd k;
    private static volatile anzq m;
    public int a;
    public String b;
    public String c;
    public aygk d;
    public String e;
    public String f;
    public String g;
    public String h;
    public apxu i;
    public anvu j;
    private byte l = (byte) 2;

    private auwd() {
        String str = "";
        this.b = str;
        this.c = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0002\u0001\b\u0001\u0003Љ\u0004\u0004\b\u0005\u0005\b\u0007\t\n\u000e\n\b\t\u000bЉ\u000b\f\b\u0002\r\b\n", new Object[]{"a", "b", "d", "e", "f", "j", "g", "i", "c", "h"});
            case 3:
                return new auwd();
            case 4:
                return new auwg();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (auwd.class) {
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
        auwd auwd = new auwd();
        k = auwd;
        anxl.registerDefaultInstance(auwd.class, auwd);
    }
}
