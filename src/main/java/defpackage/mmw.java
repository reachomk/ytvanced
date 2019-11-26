package defpackage;

import android.util.Base64;

/* renamed from: mmw */
public final class mmw implements baqa {
    private final mmu a;

    private mmw(mmu mmu) {
        this.a = mmu;
    }

    public static mmw a(mmu mmu) {
        return new mmw(mmu);
    }

    public final /* synthetic */ Object get() {
        return (String) baqd.a(Base64.encodeToString(xvw.b(this.a.a.a().toByteArray()), 11), "Cannot return null from a non-@Nullable @Provides method");
    }
}
