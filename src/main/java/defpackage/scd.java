package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: scd */
final class scd implements OnClickListener {
    private final /* synthetic */ sbz a;

    scd(sbz sbz) {
        this.a = sbz;
    }

    public final void onClick(View view) {
        try {
            this.a.j.g();
        } catch (sbt | sbv e) {
            sdf.a(sbz.g, "Failed to move to the next item in the queue", e);
        }
    }
}
