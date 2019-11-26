package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ajn */
public class ajn extends aim implements Menu {
    private final tc d;

    public ajn(Context context, tc tcVar) {
        super(context);
        if (tcVar != null) {
            this.d = tcVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(this.d.add(charSequence));
    }

    public final MenuItem add(int i) {
        return a(this.d.add(i));
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(this.d.add(i, i2, i3, charSequence));
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(this.d.add(i, i2, i3, i4));
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return a(this.d.addSubMenu(charSequence));
    }

    public final SubMenu addSubMenu(int i) {
        return a(this.d.addSubMenu(i));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return a(this.d.addSubMenu(i, i2, i3, charSequence));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return a(this.d.addSubMenu(i, i2, i3, i4));
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public final void removeItem(int i) {
        Map map = this.b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
        this.d.removeItem(i);
    }

    public final void removeGroup(int i) {
        Map map = this.b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        this.d.removeGroup(i);
    }

    public final void clear() {
        Map map = this.b;
        if (map != null) {
            map.clear();
        }
        map = this.c;
        if (map != null) {
            map.clear();
        }
        this.d.clear();
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.d.setGroupCheckable(i, z, z2);
    }

    public final void setGroupVisible(int i, boolean z) {
        this.d.setGroupVisible(i, z);
    }

    public final void setGroupEnabled(int i, boolean z) {
        this.d.setGroupEnabled(i, z);
    }

    public final boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    public final MenuItem findItem(int i) {
        return a(this.d.findItem(i));
    }

    public final int size() {
        return this.d.size();
    }

    public final MenuItem getItem(int i) {
        return a(this.d.getItem(i));
    }

    public final void close() {
        this.d.close();
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.d.performShortcut(i, keyEvent, i2);
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.d.isShortcutKey(i, keyEvent);
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return this.d.performIdentifierAction(i, i2);
    }

    public final void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }
}
