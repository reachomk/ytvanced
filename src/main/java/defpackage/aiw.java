package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: aiw */
public class aiw implements tc {
    private static final int[] k = new int[]{1, 4, 5, 3, 2, 0};
    public final Context a;
    public aiv b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public Drawable f;
    public View g;
    public final boolean h = false;
    public aja i;
    public boolean j;
    private final Resources l;
    private boolean m;
    private final boolean n;
    private final ArrayList o;
    private boolean p;
    private final ArrayList q;
    private boolean r;
    private int s = 0;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private final ArrayList x = new ArrayList();
    private final CopyOnWriteArrayList y = new CopyOnWriteArrayList();
    private boolean z = false;

    public aiw(Context context) {
        boolean z = false;
        this.a = context;
        this.l = context.getResources();
        this.c = new ArrayList();
        this.o = new ArrayList();
        this.p = true;
        this.d = new ArrayList();
        this.q = new ArrayList();
        this.r = true;
        if (this.l.getConfiguration().keyboard != 1 && abp.c(ViewConfiguration.get(this.a), this.a)) {
            z = true;
        }
        this.n = z;
    }

    /* Access modifiers changed, original: protected */
    public String b() {
        return "android:menu:actionviewstates";
    }

    public aiw m() {
        return this;
    }

    public final aiw a() {
        this.s = 1;
        return this;
    }

    public final void a(ajj ajj) {
        a(ajj, this.a);
    }

    public final void a(ajj ajj, Context context) {
        this.y.add(new WeakReference(ajj));
        ajj.a(context, this);
        this.r = true;
    }

    public final void b(ajj ajj) {
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ajj ajj2 = (ajj) weakReference.get();
            if (ajj2 == null || ajj2 == ajj) {
                this.y.remove(weakReference);
            }
        }
    }

    public final void a(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((aju) item.getSubMenu()).a(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(b(), sparseArray);
        }
    }

    public final void b(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(b());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((aju) item.getSubMenu()).b(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0) {
            MenuItem findItem = findItem(i2);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
    }

    public void a(aiv aiv) {
        this.b = aiv;
    }

    private final MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = i3 >> 16;
        if (i4 >= 0) {
            int[] iArr = k;
            if (i4 < iArr.length) {
                i4 = (iArr[i4] << 16) | ((char) i3);
                aja aja = new aja(this, i, i2, i3, i4, charSequence, this.s);
                ArrayList arrayList = this.c;
                i2 = arrayList.size();
                do {
                    i2--;
                    if (i2 < 0) {
                        i2 = 0;
                        break;
                    }
                } while (((aja) arrayList.get(i2)).c > i4);
                i2++;
                arrayList.add(i2, aja);
                b(true);
                return aja;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public final MenuItem add(int i) {
        return a(0, 0, 0, this.l.getString(i));
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.l.getString(i4));
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.l.getString(i));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        aja aja = (aja) a(i, i2, i3, charSequence);
        aju aju = new aju(this.a, this, aja);
        aja.a(aju);
        return aju;
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.l.getString(i4));
    }

    public void setGroupDividerEnabled(boolean z) {
        this.z = z;
    }

    public boolean c() {
        return this.z;
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
        int i5 = 0;
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        while (i5 < size) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex >= 0 ? intentArr[resolveInfo.specificIndex] : intent);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = a(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
            i5++;
        }
        return size;
    }

    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            if (((aja) this.c.get(i2)).a == i) {
                break;
            }
            i2++;
        }
        i2 = -1;
        a(i2, true);
    }

    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            if (((aja) this.c.get(i2)).b == i) {
                break;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            size = this.c.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || ((aja) this.c.get(i2)).b != i) {
                    b(true);
                } else {
                    a(i2, false);
                    i3 = i4;
                }
            }
            b(true);
        }
    }

    private final void a(int i, boolean z) {
        if (i >= 0 && i < this.c.size()) {
            this.c.remove(i);
            if (z) {
                b(true);
            }
        }
    }

    public final void clear() {
        aja aja = this.i;
        if (aja != null) {
            b(aja);
        }
        this.c.clear();
        b(true);
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            aja aja = (aja) this.c.get(i2);
            if (aja.b == i) {
                aja.a(z2);
                aja.setCheckable(z);
            }
        }
    }

    public final void setGroupVisible(int i, boolean z) {
        int size = this.c.size();
        Object obj = null;
        for (int i2 = 0; i2 < size; i2++) {
            aja aja = (aja) this.c.get(i2);
            if (aja.b == i && aja.b(z)) {
                obj = 1;
            }
        }
        if (obj != null) {
            b(true);
        }
    }

    public final void setGroupEnabled(int i, boolean z) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            aja aja = (aja) this.c.get(i2);
            if (aja.b == i) {
                aja.setEnabled(z);
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.j) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((aja) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            aja aja = (aja) this.c.get(i2);
            if (aja.a == i) {
                return aja;
            }
            if (aja.hasSubMenu()) {
                MenuItem findItem = aja.j.findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    public final int size() {
        return this.c.size();
    }

    public final MenuItem getItem(int i) {
        return (MenuItem) this.c.get(i);
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.m = z;
        b(false);
    }

    public boolean d() {
        return this.m;
    }

    public boolean e() {
        return this.n;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(aiw aiw, MenuItem menuItem) {
        aiv aiv = this.b;
        return aiv != null && aiv.a(aiw, menuItem);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem a = a(i, keyEvent);
        boolean a2 = a != null ? a(a, i2) : false;
        if ((i2 & 2) != 0) {
            a(true);
        }
        return a2;
    }

    private final void a(List list, int i, KeyEvent keyEvent) {
        boolean d = d();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                int i3;
                aja aja = (aja) this.c.get(i2);
                if (aja.hasSubMenu()) {
                    aja.j.a(list, i, keyEvent);
                }
                char c;
                if (d) {
                    c = aja.g;
                } else {
                    c = aja.e;
                }
                if (d) {
                    i3 = aja.h;
                } else {
                    i3 = aja.f;
                }
                if ((modifiers & 69647) == (i3 & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (d && c == 8 && i == 67)) && aja.isEnabled())) {
                    list.add(aja);
                }
            }
        }
    }

    private final aja a(int i, KeyEvent keyEvent) {
        List list = this.x;
        list.clear();
        a(list, i, keyEvent);
        if (!list.isEmpty()) {
            int metaState = keyEvent.getMetaState();
            KeyData keyData = new KeyData();
            keyEvent.getKeyData(keyData);
            int size = list.size();
            if (size == 1) {
                return (aja) list.get(0);
            }
            boolean d = d();
            for (int i2 = 0; i2 < size; i2++) {
                char c;
                aja aja = (aja) list.get(i2);
                if (d) {
                    c = aja.g;
                } else {
                    c = aja.e;
                }
                if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (d && c == 8 && i == 67))) {
                    return aja;
                }
            }
        }
        return null;
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), i2);
    }

    public final boolean a(MenuItem menuItem, int i) {
        return a(menuItem, null, i);
    }

    public final boolean a(MenuItem menuItem, ajj ajj, int i) {
        aja aja = (aja) menuItem;
        if (aja != null && aja.isEnabled()) {
            boolean b = aja.b();
            aal aal = aja.n;
            Object obj = (aal == null || !aal.e()) ? null : 1;
            if (aja.i()) {
                b |= aja.expandActionView();
                if (b) {
                    a(true);
                    return true;
                }
            } else if (aja.hasSubMenu() || obj != null) {
                int i2;
                if ((i & 4) == 0) {
                    a(false);
                }
                if (!aja.hasSubMenu()) {
                    aja.a(new aju(this.a, this, aja));
                }
                aju aju = aja.j;
                if (obj != null) {
                    aal.a((SubMenu) aju);
                }
                if (this.y.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = ajj != null ? ajj.a(aju) : false;
                    Iterator it = this.y.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        ajj ajj2 = (ajj) weakReference.get();
                        if (ajj2 == null) {
                            this.y.remove(weakReference);
                        } else if (i2 == 0) {
                            i2 = ajj2.a(aju);
                        }
                    }
                }
                b |= i2;
                if (!b) {
                    a(true);
                }
            } else if ((i & 1) == 0) {
                a(true);
                return b;
            }
            return b;
        }
        return false;
    }

    public final void a(boolean z) {
        if (!this.w) {
            this.w = true;
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ajj ajj = (ajj) weakReference.get();
                if (ajj == null) {
                    this.y.remove(weakReference);
                } else {
                    ajj.a(this, z);
                }
            }
            this.w = false;
        }
    }

    public final void close() {
        a(true);
    }

    public final void b(boolean z) {
        if (this.t) {
            this.u = true;
            if (z) {
                this.v = true;
                return;
            }
            return;
        }
        if (z) {
            this.p = true;
            this.r = true;
        }
        if (!this.y.isEmpty()) {
            f();
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ajj ajj = (ajj) weakReference.get();
                if (ajj == null) {
                    this.y.remove(weakReference);
                } else {
                    ajj.a();
                }
            }
            g();
        }
    }

    public final void f() {
        if (!this.t) {
            this.t = true;
            this.u = false;
            this.v = false;
        }
    }

    public final void g() {
        this.t = false;
        if (this.u) {
            this.u = false;
            b(this.v);
        }
    }

    /* Access modifiers changed, original: final */
    public final void h() {
        this.p = true;
        b(true);
    }

    /* Access modifiers changed, original: final */
    public final void i() {
        this.r = true;
        b(true);
    }

    public final ArrayList j() {
        if (!this.p) {
            return this.o;
        }
        this.o.clear();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            aja aja = (aja) this.c.get(i);
            if (aja.isVisible()) {
                this.o.add(aja);
            }
        }
        this.p = false;
        this.r = true;
        return this.o;
    }

    public final void k() {
        ArrayList j = j();
        if (this.r) {
            Iterator it = this.y.iterator();
            int i = 0;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ajj ajj = (ajj) weakReference.get();
                if (ajj == null) {
                    this.y.remove(weakReference);
                } else {
                    i |= ajj.b();
                }
            }
            if (i != 0) {
                this.d.clear();
                this.q.clear();
                int size = j.size();
                for (i = 0; i < size; i++) {
                    aja aja = (aja) j.get(i);
                    if (aja.f()) {
                        this.d.add(aja);
                    } else {
                        this.q.add(aja);
                    }
                }
            } else {
                this.d.clear();
                this.q.clear();
                this.q.addAll(j());
            }
            this.r = false;
        }
    }

    public final ArrayList l() {
        k();
        return this.q;
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        b(false);
    }

    public final void a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.l;
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i > 0) {
                this.e = resources.getText(i);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i2 > 0) {
                this.f = ra.a(this.a, i2);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        b(false);
    }

    public boolean a(aja aja) {
        boolean z = false;
        if (!this.y.isEmpty()) {
            f();
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ajj ajj = (ajj) weakReference.get();
                if (ajj == null) {
                    this.y.remove(weakReference);
                } else {
                    z = ajj.a(aja);
                    if (z) {
                        break;
                    }
                }
            }
            g();
            if (z) {
                this.i = aja;
            }
        }
        return z;
    }

    public boolean b(aja aja) {
        boolean z = false;
        if (!this.y.isEmpty() && this.i == aja) {
            f();
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ajj ajj = (ajj) weakReference.get();
                if (ajj == null) {
                    this.y.remove(weakReference);
                } else {
                    z = ajj.b(aja);
                    if (z) {
                        break;
                    }
                }
            }
            g();
            if (z) {
                this.i = null;
            }
        }
        return z;
    }
}
