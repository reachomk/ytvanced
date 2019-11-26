package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: ieg */
public final class ieg extends aito implements xcp {
    private boolean a = false;

    public final void a(Context context, View view) {
    }

    /* Access modifiers changed, original: protected|final */
    public final aitx b(Context context) {
        aitx b = super.b(context);
        b.b();
        b.a = 0;
        b.a();
        b.b = 0;
        return b;
    }

    public ieg(Context context) {
        super(context);
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final View a(Context context) {
        return View.inflate(context, R.layout.pip_ad_overlay, null);
    }

    public final boolean c() {
        return this.a;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            boolean a = ((ahkn) obj).a.a();
            this.a = a;
            if (a) {
                af_();
                return null;
            }
            ag_();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
