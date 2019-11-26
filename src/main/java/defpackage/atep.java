package defpackage;

/* renamed from: atep */
public final class atep extends anxl implements anzf {
    public static final atep l;
    private static volatile anzq n;
    public int a;
    public String b;
    public String c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public aygk j;
    public String k;
    private byte m = (byte) 2;

    private atep() {
        String str = "";
        this.b = str;
        this.c = str;
        anxl.emptyProtobufList();
        this.k = str;
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
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001*\n\u0000\u0000\u0001\u0001\b\u0000\u000f\b\u0001\u0010\u0003\u0002\u0011\u0007\u0003\u0018\u0007\t\u0019Љ\u0012\u001b\u0007\u0007\u001d\u0004\f!\b\u0016*\u0007\u0004", new Object[]{"a", "b", "c", "d", "e", "h", "j", "g", "i", "k", "f"});
            case 3:
                return new atep();
            case 4:
                return new ates();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (atep.class) {
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

    static {
        atep atep = new atep();
        l = atep;
        anxl.registerDefaultInstance(atep.class, atep);
    }
}
