package defpackage;

import java.util.Set;

/* renamed from: wzk */
public final class wzk implements baqa {
    private final bcaa a;
    private final bcaa b;

    private wzk(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static wzk a(bcaa bcaa, bcaa bcaa2) {
        return new wzk(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        amqp amqp = (amqp) this.a.get();
        Set set = (Set) this.b.get();
        double ceil = Math.ceil((double) (((float) xuy.a()) * ((Float) amqp.a(Float.valueOf(0.0f))).floatValue()));
        amqw.a(true, "min (%s) must be less than or equal to max (%s)", 2, 6);
        return (anjz) baqd.a(wzh.a(Math.min(Math.max((int) ceil, 2), 6), 9, "init", set), "Cannot return null from a non-@Nullable @Provides method");
    }
}
