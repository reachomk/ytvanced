package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: akdz */
public final class akdz implements akdy, OnSharedPreferenceChangeListener {
    private final Object a = new Object();
    private final SharedPreferences b;
    private final List c;

    public akdz(SharedPreferences sharedPreferences) {
        this.b = sharedPreferences;
        this.c = new ArrayList();
    }

    public final boolean a() {
        return this.b.getBoolean(xay.SUBTITLES_ENABLED, false);
    }

    public final void a(akdx akdx) {
        synchronized (this.a) {
            if (this.c.isEmpty()) {
                this.b.registerOnSharedPreferenceChangeListener(this);
            }
            this.c.add(akdx);
        }
    }

    public final void b(akdx akdx) {
        synchronized (this.a) {
            this.c.remove(akdx);
            if (this.c.isEmpty()) {
                this.b.unregisterOnSharedPreferenceChangeListener(this);
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(xay.SUBTITLES_ENABLED)) {
            ArrayList arrayList;
            int i = 0;
            this.b.getBoolean(xay.SUBTITLES_ENABLED, false);
            synchronized (this.a) {
                arrayList = new ArrayList(this.c);
            }
            int size = arrayList.size();
            while (i < size) {
                ((akdx) arrayList.get(i)).a();
                i++;
            }
        }
    }
}
