package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: qew */
final class qew implements Callable {
    private final /* synthetic */ Context a;

    qew(Context context) {
        this.a = context;
    }

    public final /* synthetic */ Object call() {
        return this.a.getSharedPreferences("google_sdk_flags", 0);
    }
}
