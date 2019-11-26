package defpackage;

/* renamed from: jfp */
public final class jfp implements aafa {
    private final adqf a;

    public jfp(adqf adqf) {
        this.a = (adqf) amqw.a((Object) adqf);
    }

    public final boolean a(int i) {
        if (i == 1) {
            return this.a.c() != null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(46);
            stringBuilder.append("Unknown menu visibility condition: ");
            stringBuilder.append(i);
            xtl.d(stringBuilder.toString());
            return false;
        }
    }
}
