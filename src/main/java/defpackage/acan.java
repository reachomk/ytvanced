package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.youtube.R;
import java.util.HashMap;

/* renamed from: acan */
public final class acan {
    private static final amul c = amul.a(Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(3));
    public final HashMap a = new HashMap();
    public acar b;
    private final acar d;
    private final Handler e;
    private final SparseArray f = new SparseArray();
    private int g;

    public acan(Context context) {
        Object handler = new Handler(Looper.getMainLooper());
        this.e = (Handler) amqw.a(handler);
        this.d = new acar(context.getResources().getString(R.string.lc_default_stream_status_unknown_text));
        a();
    }

    public final void a() {
        for (int i = 0; i < this.f.size(); i++) {
            this.e.removeCallbacks(((acar) this.f.valueAt(i)).c);
        }
        this.f.clear();
        this.a.clear();
        this.b = this.d;
    }

    public final int b() {
        int i = this.g;
        this.g = i + 1;
        this.f.put(i, new acar(i, new acap(this, i)));
        return i;
    }

    public final void a(int... iArr) {
        int i = iArr[0];
        if (i >= 0 && i < this.g) {
            acar acar = (acar) this.f.get(i);
            acar.a = -1;
            acar.b = null;
        }
        c();
        d();
    }

    public final void a(int i, int i2, String str, boolean z) {
        Spanned spannedString = str != null ? new SpannedString(str) : null;
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.g) {
            z2 = true;
        }
        int i3 = this.g;
        StringBuilder stringBuilder = new StringBuilder(60);
        stringBuilder.append("statusSource (");
        stringBuilder.append(i2);
        stringBuilder.append(") must be between 0 and ");
        stringBuilder.append(i3);
        amqw.a(z2, stringBuilder.toString());
        acar acar = (acar) this.f.get(i2);
        if (acar == null) {
            StringBuilder stringBuilder2 = new StringBuilder(58);
            stringBuilder2.append("Trying to set status for a nonexistent source: ");
            stringBuilder2.append(i2);
            Log.w("CaptureHealthManager", stringBuilder2.toString());
            return;
        }
        acar.a = i;
        acar.b = spannedString;
        Runnable runnable = acar.c;
        this.e.removeCallbacks(runnable);
        if (z) {
            this.e.postDelayed(runnable, 4500);
        }
        c();
        d();
    }

    private final void c() {
        acar acar = null;
        acar acar2 = null;
        acar acar3 = acar2;
        for (int i = 0; i < this.f.size(); i++) {
            acar acar4 = (acar) this.f.valueAt(i);
            if (!TextUtils.isEmpty(acar4.b)) {
                int i2 = acar4.a;
                if (c.contains(Integer.valueOf(i2))) {
                    acar = acar4;
                    break;
                } else if (i2 == 1 && acar == null) {
                    acar = acar4;
                } else if (i2 == 0 && acar3 == null) {
                    acar3 = acar4;
                } else if (i2 == 5 && acar3 == null) {
                    acar2 = acar4;
                }
            }
        }
        if (acar == null) {
            acar = acar2 == null ? acar3 != null ? acar3 : this.d : acar2;
        }
        this.b = acar;
    }

    private final void d() {
        for (Runnable runnable : this.a.values()) {
            if (this.e.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                this.e.post(runnable);
            }
        }
    }
}
