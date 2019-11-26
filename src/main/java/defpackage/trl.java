package defpackage;

import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.util.DisplayMetrics;
import android.view.Display;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: trl */
public final class trl implements DisplayListener {
    public final HashMap a = new HashMap();
    public DisplayManager b;
    public final Set c = Collections.newSetFromMap(new WeakHashMap());

    public final void a(Object obj) {
        this.c.add(obj);
    }

    public final void onDisplayAdded(int i) {
        onDisplayChanged(i);
    }

    public final void onDisplayChanged(int i) {
        if (this.c.isEmpty()) {
            this.a.remove(Integer.valueOf(i));
        } else {
            a(this.b.getDisplay(i));
        }
    }

    public final void onDisplayRemoved(int i) {
        this.a.remove(Integer.valueOf(i));
    }

    public final DisplayMetrics a(Display display) {
        if (display == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        if (this.b != null) {
            this.a.put(Integer.valueOf(display.getDisplayId()), displayMetrics);
        }
        return displayMetrics;
    }
}
