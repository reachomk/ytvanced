package defpackage;

import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.youtube.R;

/* renamed from: gsm */
public final class gsm implements ezu {
    public final /* synthetic */ EditVideoActivity a;
    private MenuItem b;
    private boolean c;

    public final int a() {
        return R.id.menu_save_metadata;
    }

    public final void a(MenuItem menuItem) {
        this.b = menuItem;
        this.b.setEnabled(this.c);
        View actionView = this.b.getActionView();
        if (actionView != null) {
            actionView.setOnClickListener(new gsl(this));
            actionView.setContentDescription(actionView.getResources().getString(R.string.save_metadata_menu));
            actionView.setEnabled(this.c);
        }
    }

    public final boolean b() {
        return false;
    }

    public final int c() {
        return R.menu.save_metadata_menu;
    }

    public final ezx d() {
        return null;
    }

    public final boolean b(MenuItem menuItem) {
        this.a.w();
        return true;
    }

    public final void a(boolean z) {
        this.c = z;
        MenuItem menuItem = this.b;
        if (menuItem != null) {
            menuItem.setEnabled(z);
            View actionView = this.b.getActionView();
            if (actionView != null) {
                actionView.setEnabled(z);
            }
        }
    }

    public /* synthetic */ gsm(EditVideoActivity editVideoActivity) {
        this.a = editVideoActivity;
    }
}
