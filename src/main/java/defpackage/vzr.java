package defpackage;

import com.google.android.libraries.youtube.ads.player.ui.AdProgressTextView;
import com.google.android.youtube.R;
import java.util.Arrays;

/* renamed from: vzr */
public final class vzr extends vzs {
    public boolean a;
    private final int f;
    private final int g = 1;
    private String h;
    private String i;

    public vzr(int i) {
        super(vxe.a().a());
        this.f = i;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        a(this.d);
        this.h = ((AdProgressTextView) this.c).getResources().getString(R.string.ad_text_separator);
        this.i = ((AdProgressTextView) this.c).getResources().getString(R.string.ad_badge);
    }

    private final void a(boolean z) {
        if (this.e) {
            ((AdProgressTextView) this.c).setVisibility(!z ? 8 : 0);
        }
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Object obj, boolean z) {
        String str;
        vxe vxe = (vxe) obj;
        int c = vxe.c();
        if (this.f == 2) {
            c += vxe.e().c();
        }
        if (c == -1) {
            ((AdProgressTextView) this.c).a.a();
        }
        if (!(this.g == 2 || vxe.d() == ((vxe) this.b).d())) {
            ((AdProgressTextView) this.c).a.a(vxe.d(), this.g == 0);
        }
        if (this.d != z) {
            a(z);
        }
        amqh a = amqh.a(this.h).a();
        String[] strArr = new String[3];
        String str2 = null;
        String str3 = (this.f == 2 || this.a) ? null : this.i;
        strArr[0] = str3;
        vrd e = vxe.e();
        if (this.f == 0 || e.b() == 0 || (e.b() == 1 && this.f != 2)) {
            str = null;
        } else {
            int a2 = e.a();
            int b = e.b();
            StringBuilder stringBuilder = new StringBuilder(26);
            stringBuilder.append(a2);
            stringBuilder.append(" of ");
            stringBuilder.append(b);
            str = stringBuilder.toString();
        }
        strArr[1] = str;
        if (c >= 0) {
            str2 = xvd.b((long) ((c + 999) / 1000));
        }
        strArr[2] = str2;
        ((AdProgressTextView) this.c).setText(a.a(Arrays.asList(strArr)));
    }
}
