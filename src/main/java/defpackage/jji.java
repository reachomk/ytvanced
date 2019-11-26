package defpackage;

/* renamed from: jji */
final class jji implements akxt {
    private static final amqv a = jjl.a;

    private jji() {
    }

    public final boolean b() {
        return false;
    }

    public final amqv a() {
        return a;
    }

    public final /* synthetic */ void a(Object obj, akxs akxs) {
        ajus ajus = ((akbs) obj).d;
        if (ajus != null) {
            ajuu ajuu = ajus.e;
            if (ajuu != null) {
                if (ajuu.c != null) {
                    akxs.a(new hal(ajus));
                } else if (ajuu.b != null) {
                    akxs.a(new ham(ajus));
                } else if (ajuu.e != null) {
                    akxs.a(new han(ajus));
                } else if (ajuu.d != null) {
                    akxs.a(new hai(ajus));
                }
            }
        }
    }

    /* synthetic */ jji(byte b) {
    }
}
