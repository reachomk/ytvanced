package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;
import com.google.android.youtube.R;

/* renamed from: ahw */
public final class ahw extends ContextWrapper {
    public int a;
    private Theme b;
    private LayoutInflater c;
    private Resources d;

    public ahw() {
        super(null);
    }

    public ahw(Context context, int i) {
        super(context);
        this.a = i;
    }

    public ahw(Context context, Theme theme) {
        super(context);
        this.b = theme;
    }

    public final Resources getResources() {
        return a();
    }

    private final Resources a() {
        if (this.d == null) {
            this.d = super.getResources();
        }
        return this.d;
    }

    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            b();
        }
    }

    public final Theme getTheme() {
        Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = R.style.f496Theme.AppCompat.Light;
        }
        b();
        return this.b;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    private final void b() {
        if (this.b == null) {
            this.b = a().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    public final AssetManager getAssets() {
        return a().getAssets();
    }
}
