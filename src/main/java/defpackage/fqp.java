package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: fqp */
final class fqp implements xys {
    private final /* synthetic */ fqg a;

    public final void a(CharSequence charSequence, SparseArray sparseArray, akpd akpd) {
        nn p = this.a.p();
        if (p != null) {
            this.a.al.a();
            for (int i = 0; i < sparseArray.size(); i++) {
                TextView textView = (TextView) View.inflate(p, R.layout.connections_overflow_menu_section_title, null);
                textView.setText((CharSequence) sparseArray.valueAt(i));
                this.a.al.a(sparseArray.keyAt(i), textView);
            }
            fqg fqg = this.a;
            fqg.af.b = charSequence;
            fqg.ai.a((apa) akpd);
        }
    }

    public final void a(CharSequence charSequence) {
        this.a.af.b = charSequence;
        c();
    }

    public final void a(boolean z) {
        this.a.ag = z;
        c();
    }

    public final void b(boolean z) {
        if (z) {
            this.a.ah.a();
        } else {
            this.a.ah.b();
        }
    }

    public final void a() {
        this.a.ad.d();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        new alpp(charSequence, charSequence2).a(this.a.p());
    }

    public final void b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            xtl.d("Attempting to show snackbar for empty message, skipping.");
            return;
        }
        this.a.ak.a(charSequence);
        this.a.ak.c();
    }

    public final void b() {
        this.a.ak.d();
    }

    public final void c(CharSequence charSequence) {
        xpr.a(this.a.aj, charSequence);
    }

    private final void c() {
        ezt ezt = (ezt) this.a.p();
        if (ezt != null) {
            ezt.c().b();
        }
    }

    /* synthetic */ fqp(fqg fqg) {
        this.a = fqg;
    }
}
