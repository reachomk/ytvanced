package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: kza */
public final class kza {
    public final fmx a;
    public final SharedPreferences b;
    public final Set c = Collections.newSetFromMap(new WeakHashMap());

    public kza(fmx fmx, SharedPreferences sharedPreferences) {
        this.a = (fmx) amqw.a((Object) fmx);
        this.b = sharedPreferences;
    }

    public final void a(kzc kzc, acvx acvx) {
        this.c.add(kzc);
        b(kzc, acvx);
    }

    public final void a(acvx acvx) {
        for (kzc b : this.c) {
            if (b(b, acvx)) {
                return;
            }
        }
    }

    private final boolean b(kzc kzc, acvx acvx) {
        if (!kzc.i()) {
            return false;
        }
        View j = kzc.j();
        if (j != null && j.isShown() && kzc.g() && !kzc.h()) {
            aruh f = kzc.f();
            if (f != null) {
                this.a.a(f, j, f, acvx);
            }
        }
        j = kzc.k();
        String string = this.b.getString("add_to_long_press_hint_trigger_video_id", null);
        aruh d = kzc.d();
        if (!(j == null || j.getVisibility() != 0 || kzc.d() == null || string == null || string.equals(kzc.l()) || d == null)) {
            artx artx = d.h;
            if (artx == null) {
                artx = artx.c;
            }
            int a = artz.a(artx.b);
            if (a != 0 && a == 4) {
                this.a.a(kzc.d(), j, d, acvx);
            }
        }
        return true;
    }
}
