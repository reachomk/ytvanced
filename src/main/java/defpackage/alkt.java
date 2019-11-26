package defpackage;

import android.os.Handler;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: alkt */
final class alkt {
    private static final Set d = EnumSet.allOf(alkv.class);
    public final algx a;
    public final Set b = EnumSet.noneOf(alkv.class);
    public boolean c;
    private final Handler e;

    public alkt(algx algx, Handler handler) {
        this.a = (algx) amqw.a((Object) algx);
        this.e = (Handler) amqw.a((Object) handler);
    }

    public final void a(alkv... alkvArr) {
        this.b.addAll(Arrays.asList(alkvArr));
        if (!this.c && this.b.containsAll(d)) {
            this.e.post(new alks(this));
            this.c = true;
        }
    }
}
