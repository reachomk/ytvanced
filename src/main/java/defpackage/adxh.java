package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build.VERSION;
import com.google.android.youtube.R;

/* renamed from: adxh */
public final class adxh implements t, xcp {
    public final Activity a;
    public final adgw b;
    public albg c;
    private final albh d;
    private final xci e;
    private final SharedPreferences f;
    private final adqf g;

    public adxh(Activity activity, albh albh, adgw adgw, xci xci, SharedPreferences sharedPreferences, adqf adqf) {
        this.a = (Activity) amqw.a((Object) activity);
        this.d = albh;
        this.b = adgw;
        this.e = xci;
        this.f = sharedPreferences;
        this.g = adqf;
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void B_() {
        this.e.a((Object) this);
    }

    public final void C_() {
        this.e.b(this);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adxc.class};
        } else if (i == 0) {
            adxc adxc = (adxc) obj;
            adis adis = adxc.a;
            if (adis == null || this.g.c() != null) {
                return null;
            }
            String str = "com.google.android.libraries.youtube.mdx.smartremote.LAST_SMART_REMOTE_REQUESTED_TIME";
            if (adxc.b == this.f.getLong(str, 0)) {
                return null;
            }
            albc adxl = new adxl(this);
            Resources resources = this.a.getResources();
            if (VERSION.SDK_INT < 21) {
                albh albh = this.d;
                albh.b(albh.b().c(resources.getText(R.string.mdx_smart_remote_mealbar_pre_l_text)).a(adxl).b(resources.getText(R.string.mdx_smart_remote_mealbar_dismiss_button_text), adxk.a).d((int) R.drawable.mdx_smart_remote_mic_grey3).c(false).e());
            } else {
                albh albh2 = this.d;
                albh2.b(albh2.b().d(resources.getText(R.string.mdx_smart_remote_mealbar_title)).c(resources.getText(R.string.mdx_smart_remote_mealbar_detail_text)).a(adxl).a(resources.getText(R.string.mdx_smart_remote_mealbar_connect_button_text), new adxj(this, adis)).b(resources.getText(R.string.mdx_smart_remote_mealbar_dismiss_button_text), adxm.a).d((int) R.drawable.mdx_smart_remote_mic_grey3).c(false).e());
            }
            this.f.edit().putLong(str, adxc.b).apply();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
