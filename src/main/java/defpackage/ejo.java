package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ejo */
public final class ejo implements OnSharedPreferenceChangeListener, exv {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    private final Context b;
    private final afve c;
    private afvg d;

    public ejo(Context context, SharedPreferences sharedPreferences, afve afve) {
        this.b = context;
        this.c = afve;
        this.d = afvd.a(afve, context);
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public final void b() {
    }

    public final void a() {
        c();
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("video_notifications_enabled".equals(str)) {
            c();
        }
    }

    private final void c() {
        afvg c = this.c.c(this.b);
        if (c == null || !c.equals(this.d)) {
            this.d = c;
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ejn) arrayList.get(i)).a(this.d);
            }
        }
    }
}
