package defpackage;

import java.util.List;

/* renamed from: ahfh */
public final class ahfh implements baqa {
    private final bcaa a;
    private final bcaa b;

    private ahfh(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static ahfh a(bcaa bcaa, bcaa bcaa2) {
        return new ahfh(bcaa, bcaa2);
    }

    public static List a(ajen ajen, ajex ajex) {
        return (List) baqd.a(amul.a((Object) ajen, (Object) ajex), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ahfh.a((ajen) this.a.get(), (ajex) this.b.get());
    }
}
