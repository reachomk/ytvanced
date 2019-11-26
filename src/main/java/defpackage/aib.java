package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: aib */
public final class aib implements ahu {
    private final Callback a;
    private final Context b;
    private final ArrayList c = new ArrayList();
    private final aac d = new aac();

    public aib(Context context, Callback callback) {
        this.b = context;
        this.a = callback;
    }

    public final boolean a(ahv ahv, Menu menu) {
        return this.a.onCreateActionMode(b(ahv), a(menu));
    }

    public final boolean b(ahv ahv, Menu menu) {
        return this.a.onPrepareActionMode(b(ahv), a(menu));
    }

    public final boolean a(ahv ahv, MenuItem menuItem) {
        return this.a.onActionItemClicked(b(ahv), new ajc(this.b, menuItem));
    }

    public final void a(ahv ahv) {
        this.a.onDestroyActionMode(b(ahv));
    }

    private final Menu a(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        ajn ajn = new ajn(this.b, menu);
        this.d.put(menu, ajn);
        return ajn;
    }

    public final ActionMode b(ahv ahv) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ahy ahy = (ahy) this.c.get(i);
            if (ahy != null && ahy.a == ahv) {
                return ahy;
            }
        }
        ahy ahy2 = new ahy(this.b, ahv);
        this.c.add(ahy2);
        return ahy2;
    }
}
