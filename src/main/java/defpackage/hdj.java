package defpackage;

import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteButton;
import java.util.Observable;
import java.util.Observer;

/* renamed from: hdj */
public final class hdj implements Observer {
    private final adgp a;
    private final hdk b;
    private MenuItem c;

    public hdj(adgp adgp, hdk hdk) {
        this.a = (adgp) amqw.a((Object) adgp);
        this.b = (hdk) amqw.a((Object) hdk);
        this.b.addObserver(this);
    }

    public final void update(Observable observable, Object obj) {
        Observable observable2 = this.a;
        if (observable == observable2) {
            this.b.a(observable2.a());
        } else if (observable == this.b) {
            a();
        }
    }

    public final void a() {
        MenuItem menuItem = this.b.a;
        MenuItem menuItem2 = this.c;
        if (menuItem2 != menuItem) {
            if (menuItem2 != null) {
                b();
            }
            if (menuItem != null) {
                this.a.addObserver(this);
                this.a.a(hdj.a(menuItem));
                this.b.a(this.a.a());
                this.c = menuItem;
            }
        }
    }

    public final void b() {
        MenuItem menuItem = this.c;
        if (menuItem != null) {
            this.a.b(hdj.a(menuItem));
            this.a.deleteObserver(this);
            this.c = null;
        }
    }

    private static MediaRouteButton a(MenuItem menuItem) {
        return (MediaRouteButton) aav.a(menuItem);
    }
}
