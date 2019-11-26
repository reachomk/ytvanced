package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import java.util.HashMap;
import java.util.Map;

/* renamed from: flj */
public final class flj implements OnClickListener {
    private final aaas a;
    private final akvp b;
    private final FloatingActionButton c;
    private fff d;

    public flj(aaas aaas, akvp akvp, FloatingActionButton floatingActionButton) {
        this.a = aaas;
        this.b = akvp;
        this.c = floatingActionButton;
        floatingActionButton.setOnClickListener(this);
    }

    public final void a(fff fff) {
        if (fff != null && this.d == fff) {
            xpr.a(this.c, true);
            return;
        }
        this.d = fff;
        fff = this.d;
        if (fff != null) {
            arwf a = fff.a();
            if (a != null) {
                akvp akvp = this.b;
                arwh a2 = arwh.a(a.b);
                if (a2 == null) {
                    a2 = arwh.UNKNOWN;
                }
                this.c.setImageResource(akvp.a(a2));
            } else {
                this.c.setImageDrawable(null);
            }
            this.c.setContentDescription(this.d.c());
            xpr.a(this.c, true);
            return;
        }
        xpr.a(this.c, false);
    }

    public final void onClick(View view) {
        fff fff = this.d;
        if (fff == null) {
            return;
        }
        if (fff.d() != null) {
            this.a.a(this.d.d(), flj.a(this.d));
        } else if (this.d.b() != null) {
            this.a.a(this.d.b(), flj.a(this.d));
        }
    }

    private static Map a(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        return hashMap;
    }
}
