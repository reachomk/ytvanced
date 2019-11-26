package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: klw */
public final class klw extends akpl {
    public final aaas a;
    public aygy b;
    public Map c;
    private final akvp d;
    private final flu e;
    private final GridLayout f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;

    public klw(Context context, akvp akvp, aaas aaas, flu flu) {
        this.d = akvp;
        this.a = aaas;
        this.e = flu;
        View inflate = LayoutInflater.from(context).inflate(R.layout.tile_button, null);
        View findViewById = inflate.findViewById(R.id.card_view);
        this.f = (GridLayout) inflate.findViewById(R.id.content);
        this.g = (ImageView) inflate.findViewById(R.id.icon);
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.i = (TextView) inflate.findViewById(R.id.info);
        this.j = (TextView) inflate.findViewById(R.id.description);
        findViewById.setOnClickListener(new klz(this));
        flu.a(inflate);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.e.b;
    }

    private static LayoutParams a(int i, int i2, int i3) {
        return new LayoutParams(GridLayout.spec(i, i3, GridLayout.CENTER), GridLayout.spec(i2, 1));
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        Map b;
        arml arml;
        aygy aygy = (aygy) obj;
        this.b = aygy;
        arml arml2 = null;
        if (akor != null) {
            String str = "sectionListController";
            b = amur.e().b(str, akor.a(str)).a(akor.b()).b();
        } else {
            b = null;
        }
        this.c = b;
        GridLayout gridLayout = this.f;
        int a = aygw.a(aygy.h);
        if (a == 0) {
            a = 1;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gridLayout.getLayoutParams();
        layoutParams.gravity = a + -1 != 2 ? 8388611 : 1;
        gridLayout.setLayoutParams(layoutParams);
        int i = aygy.a;
        a = i & 4;
        boolean z = false;
        Object obj2 = (a == 0 || (i & 1) == 0) ? 1 : null;
        if (a == 0) {
            this.h.setLayoutParams(klw.a(0, 1, 2));
        } else if ((i & 1) != 0) {
            this.h.setLayoutParams(klw.a(0, 1, 1));
            this.j.setLayoutParams(klw.a(1, 1, 1));
        } else {
            this.j.setLayoutParams(klw.a(0, 1, 2));
        }
        if (obj2 != null) {
            this.i.setLayoutParams(klw.a(0, 2, 2));
        } else {
            this.i.setLayoutParams(klw.a(0, 2, 1));
        }
        View view = this.g;
        if ((aygy.a & 8) != 0) {
            z = true;
        }
        xpr.a(view, z);
        if ((aygy.a & 8) != 0) {
            ImageView imageView = this.g;
            akvp akvp = this.d;
            arwf arwf = aygy.g;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a2 = arwh.a(arwf.b);
            if (a2 == null) {
                a2 = arwh.UNKNOWN;
            }
            imageView.setImageResource(akvp.a(a2));
        }
        TextView textView = this.h;
        if ((aygy.a & 1) != 0) {
            arml = aygy.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.i;
        if ((aygy.a & 2) != 0) {
            arml = aygy.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.j;
        if ((aygy.a & 4) != 0) {
            arml2 = aygy.f;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml2));
        this.e.a(akor);
    }
}
