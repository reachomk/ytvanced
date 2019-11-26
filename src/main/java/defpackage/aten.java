package defpackage;

/* renamed from: aten */
public final class aten extends anxl implements anzf {
    public static final aten j;
    private static volatile anzq l;
    public int a;
    public long b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    public String e;
    public String f;
    public String g;
    public anyd h;
    public String i;
    private byte k = (byte) 2;

    private aten() {
        anxl.emptyProtobufList();
        String str = "";
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = anxl.emptyProtobufList();
        this.i = str;
        anxl.emptyProtobufList();
    }

    public final void a() {
        if (!this.c.a()) {
            this.c = anxl.mutableCopy(this.c);
        }
    }

    public final void b() {
        if (!this.d.a()) {
            this.d = anxl.mutableCopy(this.d);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0003\u0002\u0001\u0002\u0000\u0002Л\u0003Л\u0004\b\u0001\u0005\b\u0002\u0007\b\u0004\b\u001b\u000b\b\u0005", new Object[]{"a", "b", "c", arlv.class, "d", arlv.class, "e", "f", "g", "h", atzg.class, "i"});
            case 3:
                return new aten();
            case 4:
                return new ateq();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aten.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aten aten = new aten();
        j = aten;
        anxl.registerDefaultInstance(aten.class, aten);
    }
}
