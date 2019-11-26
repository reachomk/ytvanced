package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: jhy */
public class jhy extends akve {
    @Deprecated
    public int a = 0;
    public arsi b;
    private final Context d;

    public jhy(Context context) {
        super(jhy.a(context));
        this.d = context;
    }

    public void a() {
        a(jhy.a(this.d));
    }

    public final int b() {
        int i;
        if (this.b != null) {
            i = this.d.getResources().getConfiguration().orientation;
            boolean b = xss.b(this.d);
            if (i != 2) {
                if (b) {
                    i = this.b.c;
                } else {
                    i = this.b.b;
                }
                return i;
            }
            if (b) {
                i = this.b.e;
            } else {
                i = this.b.d;
            }
            return i;
        }
        i = this.a;
        if (i <= 0) {
            i = this.c;
        }
        return i;
    }

    public final void a(int i) {
        if (this.b != null || this.a > 0) {
            i = b();
        }
        super.a(i);
    }

    public static int a(Context context) {
        return context.getResources().getInteger(R.integer.grid_shelf_num_columns);
    }
}
