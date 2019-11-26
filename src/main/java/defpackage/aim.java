package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

/* renamed from: aim */
class aim {
    public final Context a;
    public Map b;
    public Map c;

    aim(Context context) {
        this.a = context;
    }

    /* Access modifiers changed, original: final */
    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof tf)) {
            return menuItem;
        }
        tf tfVar = (tf) menuItem;
        if (this.b == null) {
            this.b = new zj();
        }
        menuItem = (MenuItem) this.b.get(menuItem);
        if (menuItem != null) {
            return menuItem;
        }
        ajc ajc = new ajc(this.a, tfVar);
        this.b.put(tfVar, ajc);
        return ajc;
    }

    /* Access modifiers changed, original: final */
    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof te)) {
            return subMenu;
        }
        te teVar = (te) subMenu;
        if (this.c == null) {
            this.c = new zj();
        }
        SubMenu subMenu2 = (SubMenu) this.c.get(teVar);
        if (subMenu2 == null) {
            subMenu2 = new ajt(this.a, teVar);
            this.c.put(teVar, subMenu2);
        }
        return subMenu2;
    }
}
