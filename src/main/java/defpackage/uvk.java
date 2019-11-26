package defpackage;

import com.google.android.youtube.R;

/* renamed from: uvk */
final /* synthetic */ class uvk implements Runnable {
    private final uvg a;

    uvk(uvg uvg) {
        this.a = uvg;
    }

    public final void run() {
        uvg uvg = this.a;
        if (uvg.g > 0) {
            uvg.d.setTextColor(xwe.a(uvg.a, R.attr.ytBrandRed, 0));
            uvg.e.setText("");
            xpr.a(uvg.f, uvg.b.getString(R.string.retry_password));
            uvg.g--;
            return;
        }
        uvg.c.a(2);
    }
}
