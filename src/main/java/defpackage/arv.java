package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: arv */
public final class arv extends ContextWrapper {
    private static final Object a = new Object();
    private static ArrayList b;
    private final Resources c;
    private final Theme d;

    public static Context a(Context context) {
        if ((context instanceof arv) || (context.getResources() instanceof arx) || (context.getResources() instanceof asr) || (VERSION.SDK_INT >= 21 && !asr.a())) {
            return context;
        }
        synchronized (a) {
            if (b != null) {
                WeakReference weakReference;
                int size = b.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    weakReference = (WeakReference) b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        b.remove(size);
                    }
                }
                size = b.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    weakReference = (WeakReference) b.get(size);
                    arv arv = weakReference != null ? (arv) weakReference.get() : null;
                    if (arv != null) {
                        if (arv.getBaseContext() == context) {
                            return arv;
                        }
                    }
                }
            } else {
                b = new ArrayList();
            }
            arv arv2 = new arv(context);
            b.add(new WeakReference(arv2));
            return arv2;
        }
    }

    private arv(Context context) {
        super(context);
        if (asr.a()) {
            this.c = new asr(this, context.getResources());
            this.d = this.c.newTheme();
            this.d.setTo(context.getTheme());
            return;
        }
        this.c = new arx(this, context.getResources());
        this.d = null;
    }

    public final Theme getTheme() {
        Theme theme = this.d;
        return theme == null ? super.getTheme() : theme;
    }

    public final void setTheme(int i) {
        Theme theme = this.d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    public final Resources getResources() {
        return this.c;
    }

    public final AssetManager getAssets() {
        return this.c.getAssets();
    }
}
