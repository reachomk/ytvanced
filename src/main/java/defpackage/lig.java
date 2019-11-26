package defpackage;

import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;

/* renamed from: lig */
public final /* synthetic */ class lig implements eys {
    private final FlexyBehavior a;
    private final lij b;

    public lig(FlexyBehavior flexyBehavior, lij lij) {
        this.a = flexyBehavior;
        this.b = lij;
    }

    public final void a(int i) {
        FlexyBehavior flexyBehavior = this.a;
        lij lij = this.b;
        if (i == 0) {
            lij.a(0, true);
            flexyBehavior.a = false;
        }
    }
}
