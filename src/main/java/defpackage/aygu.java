package defpackage;

/* renamed from: aygu */
public final class aygu extends anxl implements anzf {
    public static final aygu h;
    private static volatile anzq j;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public String c;
    public String d;
    public apxu e;
    public apxu f;
    public anvu g;
    private byte i = (byte) 2;

    private aygu() {
        String str = "";
        this.c = str;
        this.d = str;
        this.g = anvu.a;
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0002\u000b\u0006\u0000\u0001\u0003\u0002Л\u0003\b\u0002\u0004Љ\n\u0006\n\f\nЉ\t\u000b\b\u0005", new Object[]{"a", "b", aygs.class, "c", "f", "g", "e", "d"});
            case 3:
                return new aygu();
            case 4:
                return new aygx();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aygu.class) {
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
        aygu aygu = new aygu();
        h = aygu;
        anxl.registerDefaultInstance(aygu.class, aygu);
    }
}
