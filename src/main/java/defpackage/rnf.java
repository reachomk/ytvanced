package defpackage;

import android.content.Context;

@qlp
/* renamed from: rnf */
public final class rnf {
    public final qjf a = new qjf();
    public final Context b;
    public pbc c;
    public rks d;
    public rlz e;
    public String f;
    public pee g;
    public pec h;
    public boolean i;
    public boolean j;

    public rnf(Context context) {
        this.b = context;
    }

    public final void a(String str) {
        if (this.e == null) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 63);
            stringBuilder.append("The ad unit ID must be set on InterstitialAd before ");
            stringBuilder.append(str);
            stringBuilder.append(" is called.");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
