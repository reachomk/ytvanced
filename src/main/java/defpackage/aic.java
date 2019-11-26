package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: aic */
final class aic {
    public aal A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D = null;
    public Mode E = null;
    public final /* synthetic */ aia F;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;

    public aic(aia aia, Menu menu) {
        this.F = aia;
        this.a = menu;
        a();
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public static char a(String str) {
        return str != null ? str.charAt(0) : 0;
    }

    public final void a(MenuItem menuItem) {
        int i = 0;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r > 0).setTitleCondensed(this.l).setIcon(this.m);
        int i2 = this.v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        if (this.z != null) {
            if (this.F.c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            aia aia = this.F;
            if (aia.d == null) {
                aia.d = aia.a(aia.c);
            }
            menuItem.setOnMenuItemClickListener(new aid(aia.d, this.z));
        }
        boolean z = menuItem instanceof aja;
        if (this.r >= 2) {
            if (z) {
                ((aja) menuItem).a(true);
            } else if (menuItem instanceof ajc) {
                ajc ajc = (ajc) menuItem;
                try {
                    if (ajc.e == null) {
                        ajc.e = ajc.d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    ajc.e.invoke(ajc.d, new Object[]{Boolean.valueOf(true)});
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = this.x;
        if (str != null) {
            menuItem.setActionView((View) a(str, aia.a, this.F.b));
            i = 1;
        }
        i2 = this.w;
        if (i2 > 0) {
            if (i != 0) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        aal aal = this.A;
        if (aal != null) {
            if (menuItem instanceof tf) {
                ((tf) menuItem).a(aal);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.B;
        boolean z2 = menuItem instanceof tf;
        if (z2) {
            ((tf) menuItem).a(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
        charSequence = this.C;
        if (z2) {
            ((tf) menuItem).b(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((tf) menuItem).setAlphabeticShortcut(c, i3);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        c = this.p;
        i3 = this.q;
        if (z2) {
            ((tf) menuItem).setNumericShortcut(c, i3);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i3);
        }
        Mode mode = this.E;
        if (mode != null) {
            if (z2) {
                ((tf) menuItem).setIconTintMode(mode);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            if (z2) {
                ((tf) menuItem).setIconTintList(colorStateList);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    public final SubMenu b() {
        this.h = true;
        SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        a(addSubMenu.getItem());
        return addSubMenu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor constructor = Class.forName(str, false, this.F.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            str = constructor.newInstance(objArr);
            return str;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot instantiate class: ");
            stringBuilder.append(str);
            Log.w("SupportMenuInflater", stringBuilder.toString(), e);
            return null;
        }
    }
}
