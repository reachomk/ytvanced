package defpackage;

import java.util.concurrent.Executor;

/* renamed from: vmx */
public final class vmx implements baqa {
    private final bcaa a;

    private vmx(bcaa bcaa) {
        this.a = bcaa;
    }

    public static vmx a(bcaa bcaa) {
        return new vmx(bcaa);
    }

    public final /* synthetic */ Object get() {
        return new vmv((Executor) this.a.get());
    }
}
