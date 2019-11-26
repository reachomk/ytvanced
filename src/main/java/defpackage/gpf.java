package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: gpf */
final /* synthetic */ class gpf implements OnClickListener {
    private final gpa a;

    gpf(gpa gpa) {
        this.a = gpa;
    }

    public final void onClick(View view) {
        gpa gpa = this.a;
        if (gpa.j.c()) {
            gpa.j.b();
        } else {
            gpa.j.a();
        }
    }
}
