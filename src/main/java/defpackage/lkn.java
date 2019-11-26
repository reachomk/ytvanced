package defpackage;

import android.graphics.Rect;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: lkn */
public abstract class lkn implements lla {
    public static final Rect i = new Rect();
    private final Set a = new CopyOnWriteArraySet();

    public final int s() {
        return 0;
    }

    public final void a(lkz lkz) {
        this.a.add(lkz);
    }

    public final void b(lkz lkz) {
        this.a.remove(lkz);
    }

    /* Access modifiers changed, original: protected|final */
    public final void t() {
        for (lkz a : this.a) {
            a.a(this);
        }
    }
}
