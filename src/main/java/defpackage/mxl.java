package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;

/* renamed from: mxl */
public final class mxl extends ContextWrapper {
    public static final Class[] a = new Class[]{Context.class, AttributeSet.class};
    private final Resources b;
    private final LayoutInflater c;
    private final Theme d;
    private final AssetManager e;

    public mxl(Context context, Resources resources, ClassLoader classLoader, Theme theme) {
        super(context);
        this.b = (Resources) amml.a(resources, "resources cannot be null");
        this.d = (Theme) amml.a(theme, "theme cannot be null");
        this.e = resources.getAssets();
        LayoutInflater cloneInContext = ((LayoutInflater) super.getSystemService("layout_inflater")).cloneInContext(this);
        mxk mxk = new mxk(classLoader);
        if (VERSION.SDK_INT >= 21) {
            cloneInContext.setFactory2(new aat(mxk));
        } else {
            aat aat = new aat(mxk);
            cloneInContext.setFactory2(aat);
            Factory factory = cloneInContext.getFactory();
            if (factory instanceof Factory2) {
                aaq.a(cloneInContext, (Factory2) factory);
            } else {
                aaq.a(cloneInContext, aat);
            }
        }
        this.c = cloneInContext;
    }

    public final Resources getResources() {
        return this.b;
    }

    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            return this.c;
        }
        return super.getSystemService(str);
    }

    public final Theme getTheme() {
        return this.d;
    }

    public final AssetManager getAssets() {
        return this.e;
    }
}
