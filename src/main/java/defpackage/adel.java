package defpackage;

import android.content.Context;
import android.text.Html;
import com.google.android.youtube.R;

/* renamed from: adel */
public final class adel extends adqq implements adqi, xcp {
    public final adqf a;
    public final bcaa b;
    public final xci c;
    public final acwa d;
    public albl e;
    private final yx f = yx.a();
    private final Context g;
    private final albi h;

    public adel(Context context, adqf adqf, bcaa bcaa, albi albi, xci xci, acwa acwa) {
        this.g = (Context) amqw.a((Object) context);
        this.a = (adqf) amqw.a((Object) adqf);
        this.b = (bcaa) amqw.a((Object) bcaa);
        this.h = (albi) amqw.a((Object) albi);
        this.c = (xci) amqw.a((Object) xci);
        this.d = (acwa) amqw.a((Object) acwa);
    }

    public final void a(adqe adqe) {
    }

    public final void b(adqe adqe) {
    }

    private final void a() {
        albl albl = this.e;
        if (albl != null) {
            this.h.a(albl);
        }
    }

    public final void c(adqe adqe) {
        a();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{adfa.class, adqk.class};
        } else if (i == 0) {
            String str = ((adfa) obj).a;
            if (!(str == null || str.isEmpty())) {
                Context context = this.g;
                str = this.f.a(str);
                str = Html.fromHtml(context.getString(R.string.mdx_auto_cast_snackbar_message, new Object[]{str})).toString();
                String string = this.g.getString(R.string.mdx_auto_cast_snackbar_action);
                albi albi = this.h;
                albi.b(((albk) albi.b().b(str).a(string, new adeo(this)).c(-2)).a(new aden(this)).c(false).d());
                return null;
            }
        } else if (i == 1) {
            adqe adqe = ((adqk) obj).a;
            if (!(adqe == null || adqe.h() == null)) {
                a();
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
