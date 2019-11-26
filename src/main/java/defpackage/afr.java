package defpackage;

import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

/* renamed from: afr */
final class afr extends aih {
    private final /* synthetic */ afk b;

    public afr(afk afk, Callback callback) {
        this.b = afk;
        super(callback);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (onPreparePanel) {
            afk afk = this.b;
            if (!afk.b) {
                afk.a.l();
                this.b.b = true;
                return true;
            }
        }
        return onPreparePanel;
    }

    public final View onCreatePanelView(int i) {
        if (i == 0) {
            return new View(this.b.a.b());
        }
        return super.onCreatePanelView(i);
    }
}
