package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: fsc */
public final class fsc {
    public final View a;
    public final lwc b;
    public final Set c;
    public int d;
    public boolean e;
    public int f;

    public fsc(Activity activity, exu exu, lwc lwc) {
        View findViewById = activity.getWindow().getDecorView().findViewById(R.id.next_gen_watch_container_layout);
        if (findViewById == null) {
            findViewById = activity.getWindow().getDecorView().findViewById(16908290);
        }
        this.a = findViewById;
        this.b = (lwc) amqw.a((Object) lwc);
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new fsf(this));
        this.c = Collections.newSetFromMap(new WeakHashMap());
        this.f = 1;
        exu.a(new fse(this));
    }

    public final void a() {
        for (fsg a : this.c) {
            a.a(this.f);
        }
    }
}
