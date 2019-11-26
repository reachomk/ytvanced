package defpackage;

import java.util.Map.Entry;

/* renamed from: anoe */
public final /* synthetic */ class anoe implements Runnable {
    private final Entry a;

    public anoe(Entry entry) {
        this.a = entry;
    }

    public final void run() {
        ((anok) this.a.getKey()).a();
    }
}
