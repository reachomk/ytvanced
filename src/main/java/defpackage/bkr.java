package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bkr */
public final class bkr {
    private final List a = new ArrayList();

    /* Access modifiers changed, original: final */
    public final void a(blk blk) {
        this.a.add(blk);
    }

    public final void a(Path path) {
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                bpg.a(path, (blk) this.a.get(size));
            } else {
                return;
            }
        }
    }
}
