package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kxw */
public final class kxw extends kyc {
    private static final String a;
    private final aaas b;
    private final ViewGroup f;
    private final TextView g = ((TextView) this.f.findViewById(R.id.description));
    private final LinearLayout h = ((LinearLayout) this.f.findViewById(R.id.metadata_row_container));
    private final View i = this.f.findViewById(R.id.bottom_separator);
    private final kky j;
    private final bgx k;

    public kxw(Context context, aaas aaas, kla kla) {
        this.b = aaas;
        this.f = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_video_description, null);
        this.j = new kky((Context) kla.a((Context) kla.a.get(), 1), (akpb) kla.a((akpb) kla.b.get(), 2), (LinearLayout) kla.a(this.h, 3), true);
        bhj bhj = new bhj();
        bgx eyl = new eyl();
        eyl.a((int) R.id.container);
        bhj.a(eyl);
        eyl = new kxz();
        eyl.a((int) R.id.description);
        eyl.a((int) R.id.metadata_row_container);
        eyl.a((int) R.id.bottom_separator);
        bhj.a(eyl);
        this.k = bhj;
    }

    public final View K_() {
        return this.f;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        f();
        g();
        h();
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        bhf.a(this.f);
        this.j.a();
    }

    public final void aD_() {
        bhf.a(this.f, this.k);
        f();
        g();
        h();
    }

    private final void f() {
        arml arml;
        axps axps = (axps) this.d;
        arml arml2 = null;
        if ((axps.a & 1) != 0) {
            arml = axps.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        if ((axps.a & 2) != 0) {
            arml2 = axps.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        Spanned a2 = aabb.a(arml2, this.b, false);
        if (this.e.f && !(TextUtils.isEmpty(a) && TextUtils.isEmpty(a2))) {
            this.g.setVisibility(0);
            this.g.setImportantForAccessibility(1);
            this.g.setText(ajqy.a(a, a, a2));
            return;
        }
        this.g.setVisibility(8);
        this.g.setImportantForAccessibility(2);
    }

    private final void g() {
        axps axps = (axps) this.d;
        azcm azcm = axps.d;
        if (azcm == null) {
            azcm = azcm.c;
        }
        if ((azcm.a & 1) != 0) {
            kky kky = this.j;
            akor akor = this.c;
            azcm azcm2 = axps.d;
            if (azcm2 == null) {
                azcm2 = azcm.c;
            }
            auxl auxl = azcm2.b;
            if (auxl == null) {
                auxl = auxl.e;
            }
            kky.a(akor, auxl, this.e.f ^ 1);
        }
    }

    private final void h() {
        View view = this.i;
        int i = 0;
        if (!(this.g.getVisibility() == 0 || this.h.getVisibility() == 0)) {
            i = 8;
        }
        view.setVisibility(i);
    }

    static {
        String str = "line.separator";
        String valueOf = String.valueOf(System.getProperty(str));
        str = String.valueOf(System.getProperty(str));
        a = str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
    }
}
