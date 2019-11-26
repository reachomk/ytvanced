package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: vcc */
public final class vcc implements baqa {
    public static final vcc a = new vcc();

    public static CopyOnWriteArrayList a() {
        return (CopyOnWriteArrayList) baqd.a(new CopyOnWriteArrayList(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return vcc.a();
    }
}
