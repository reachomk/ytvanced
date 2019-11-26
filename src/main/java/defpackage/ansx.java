package defpackage;

/* renamed from: ansx */
public final class ansx extends anxl implements anzf {
    public static final ansx l;
    private static volatile anzq m;
    public antg a;
    public String b;
    public ansr c;
    public anyd d = anxl.emptyProtobufList();
    public int e;
    public boolean f;
    public String g;
    public String h;
    public boolean i;
    public anyd j;
    public boolean k;

    private ansx() {
        String str = "";
        this.b = str;
        this.g = str;
        this.h = str;
        anxl.emptyIntList();
        this.j = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0000\u000b\u0000\u0000\u0001\u0011\u000b\u0000\u0002\u0000\u0001Ȉ\u0003\t\u0004Ț\u0005\f\u0007\u0007\bȈ\n\t\u000bȈ\u000f\u0007\u0010Ț\u0011\u0007", new Object[]{"b", "c", "d", "e", "f", "h", "a", "g", "i", "j", "k"});
            case 3:
                return new ansx();
            case 4:
                return new answ();
            case 5:
                return l;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (ansx.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ansx ansx = new ansx();
        l = ansx;
        anxl.registerDefaultInstance(ansx.class, ansx);
    }
}
