package defpackage;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashSet;

/* renamed from: ezw */
public final class ezw {
    public static boolean a(Menu menu, MenuInflater menuInflater, xoe xoe, SparseArray sparseArray, int i) {
        int size = sparseArray.size();
        if (size == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        hashSet.clear();
        for (int i2 = 0; i2 < size; i2++) {
            ezu ezu = (ezu) sparseArray.valueAt(i2);
            if (ezu != null && ezu.c() != 0) {
                Integer valueOf = Integer.valueOf(ezu.c());
                if (!hashSet.contains(valueOf)) {
                    menuInflater.inflate(valueOf.intValue(), menu);
                    hashSet.add(valueOf);
                }
            } else if (ezu instanceof fai) {
                fai fai = (fai) ezu;
                menu.add(0, fai.a(), fai.f(), fai.e());
            } else {
                xtl.d(String.format("Unhandled menu item %s", new Object[]{ezu}));
            }
        }
        for (int i3 = 0; i3 < menu.size(); i3++) {
            MenuItem item = menu.getItem(i3);
            ezu ezu2 = (ezu) sparseArray.get(item.getItemId());
            if (ezu2 == null) {
                item.setVisible(false);
            } else {
                ezu2.a(item);
                if (xoe != null) {
                    if (ezu2.d() != null) {
                        ezu2.d().a(xoe, i);
                    } else if (ezu2.b()) {
                        Drawable icon = item.getIcon();
                        if (icon != null) {
                            item.setIcon(xoe.a(icon, i));
                        }
                    }
                }
            }
        }
        return true;
    }
}
