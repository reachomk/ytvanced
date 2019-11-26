package defpackage;

import android.util.JsonReader;
import java.util.concurrent.Callable;

/* renamed from: bjs */
final class bjs implements Callable {
    private final /* synthetic */ JsonReader a;

    bjs(JsonReader jsonReader) {
        this.a = jsonReader;
    }

    public final /* synthetic */ Object call() {
        return bjm.a(this.a, null);
    }
}
