package defpackage;

import android.system.Os;
import java.util.concurrent.Callable;

/* renamed from: ufw */
final /* synthetic */ class ufw implements Callable {
    private final String a;

    ufw(String str) {
        this.a = str;
    }

    public final Object call() {
        return Os.lstat(this.a);
    }
}
