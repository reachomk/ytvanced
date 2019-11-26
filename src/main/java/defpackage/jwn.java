package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: jwn */
public final class jwn extends akyk {
    private final aajq a;

    public jwn(Context context, aajq aajq) {
        super(context, aajq.b);
        this.a = aajq;
        for (arlz arlz : aajq.d) {
            if ((arlz.a & 1) != 0) {
                this.e = ra.a(context, (int) R.drawable.accelerated_badge);
                return;
            }
        }
    }

    public final int a() {
        return this.a.a;
    }
}
