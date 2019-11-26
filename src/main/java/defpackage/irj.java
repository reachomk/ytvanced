package defpackage;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: irj */
final class irj implements Callback {
    irj() {
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.setTag(ezq.a);
        return true;
    }
}
