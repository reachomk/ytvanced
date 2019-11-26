package defpackage;

/* renamed from: atex */
public final class atex extends anxl implements anzf {
    public static final atex h;
    private static volatile anzq j;
    public int a;
    public ashy b;
    public String c;
    public anyd d;
    public String e;
    public int f;
    public String g;
    private byte i = (byte) 2;

    private atex() {
        String str = "";
        this.c = str;
        this.d = anxl.emptyProtobufList();
        this.e = str;
        this.g = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\u001a\u0004\f\u0003\u0006\b\u0002\u0007\b\u0005", new Object[]{"a", "b", "c", "d", "f", awnx.a(), "e", "g"});
            case 3:
                return new atex();
            case 4:
                return new atfa();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (atex.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atex atex = new atex();
        h = atex;
        anxl.registerDefaultInstance(atex.class, atex);
    }
}
