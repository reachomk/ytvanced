package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.widget.ActiveItemIndicatorView;
import com.google.android.youtube.R;

/* renamed from: jyz */
final class jyz implements jyw {
    public final /* synthetic */ jyi a;
    private final jzd b;
    private final jza c;
    private jyw d;

    jyz(jyi jyi, View view) {
        this.a = jyi;
        ActiveItemIndicatorView activeItemIndicatorView = (ActiveItemIndicatorView) view.findViewById(R.id.active_item_indicator);
        this.b = new jzd(jyi.a, jyi.g, (ViewGroup) view.findViewById(R.id.pagination_thumbnails), new jyy(this));
        this.c = new jza(jyi.a, activeItemIndicatorView);
    }

    public final void a(ajry ajry) {
        jyi jyi = this.a;
        ajry ajry2 = jyi.l;
        if (ajry2 == null || ajry2.f == null || !xss.b(jyi.a)) {
            int i;
            jza jza = this.c;
            this.d = jza;
            ActiveItemIndicatorView activeItemIndicatorView = jza.a;
            jyi jyi2 = this.a;
            int i2 = jyi2.c;
            if (jyi.a(jyi2.l)) {
                i = this.a.b;
            } else {
                i = 0;
            }
            jyi.a(activeItemIndicatorView, i2 + i);
            this.b.a(false);
            this.c.a(true);
        } else {
            this.d = this.b;
            this.c.a(false);
            this.b.a(true);
        }
        this.d.a(ajry);
    }

    public final void a(int i) {
        jyw jyw = this.d;
        if (jyw != null) {
            jyw.a(i);
        }
    }

    public final void a(boolean z) {
        jyw jyw = this.d;
        if (jyw != null) {
            jyw.a(false);
        }
    }

    public final int a() {
        jyw jyw = this.d;
        if (jyw != null) {
            jyw.a();
        }
        return 0;
    }
}
