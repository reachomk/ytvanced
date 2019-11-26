package defpackage;

import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.youtube.R;
import java.util.Observable;

/* renamed from: hdk */
public final class hdk extends Observable implements ezu, ezx, fof {
    public MenuItem a;

    public final int a() {
        return R.id.menu_cast;
    }

    public final boolean b() {
        return false;
    }

    public final boolean b(MenuItem menuItem) {
        return true;
    }

    public final int c() {
        return R.menu.menu;
    }

    public final ezx d() {
        return this;
    }

    public final acwc e() {
        return null;
    }

    public final void a(xoe xoe, int i) {
        MediaRouteButton f = f();
        if (f != null) {
            f.a(xoe.a(f.getContext().getResources().getDrawable(R.drawable.ic_media_route_transparent_waves), i));
        }
    }

    public final void a(MenuItem menuItem) {
        if (this.a != menuItem) {
            this.a = menuItem;
            setChanged();
            notifyObservers();
        }
    }

    public final MediaRouteButton f() {
        MenuItem menuItem = this.a;
        return menuItem != null ? (MediaRouteButton) aav.a(menuItem) : null;
    }

    public final void a(boolean z) {
        MenuItem menuItem = this.a;
        if (menuItem != null) {
            menuItem.setVisible(z);
            this.a.setEnabled(z);
        }
    }
}
